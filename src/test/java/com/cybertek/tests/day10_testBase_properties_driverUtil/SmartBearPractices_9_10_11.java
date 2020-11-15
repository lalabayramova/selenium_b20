package com.cybertek.tests.day10_testBase_properties_driverUtil;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.SmartBearUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class SmartBearPractices_9_10_11 extends TestBase {

    @Test
    public void delete_order() throws IOException {
        Properties properties=new Properties();
        FileInputStream file=new FileInputStream("configuration.properties");
        properties.load(file);

        // URL from configuration properties
        String url=properties.getProperty("smartbearUrl");

    driver.get(url);
    SmartBearUtilities.loginToSmartBear(driver);

WebElement markSmith=driver.findElement(By.xpath("//td[.='Mark Smith']/../td[1]"));
markSmith.click();
WebElement deleteButton=driver.findElement(By.id("ctl00_MainContent_btnDelete"));
deleteButton.click();
List<WebElement>allNames=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[2]"));
for(WebElement each:allNames){
    Assert.assertFalse(each.getText().equals("Mark Smith"));
}

}




}
