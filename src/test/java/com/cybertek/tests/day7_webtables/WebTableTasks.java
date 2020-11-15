package com.cybertek.tests.day7_webtables;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTableTasks {
    /*
TC#3: Smartbear software order verification
1.Open browser and login to Smartbear software
2.Click on View all orders
3.Verify Susan McLaren has order on date “01/05/2010
*/
    WebDriver driver;
@BeforeMethod
public void setUpMethod(){
    driver= WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    SmartBearUtilities.loginToSmartBear(driver);
}

@Test
public void verify_Susan_order(){
WebElement susanDate=driver.findElement(By.xpath("//td[.='Susan McLaren']/../td[5]"));
    System.out.println("susanDate = " + susanDate.getText());

String expectedResult="01/05/2010";
String actualResult=susanDate.getText();
    Assert.assertEquals(actualResult,expectedResult);
   // Assert.fail("I am failing this test on purpose");
}














}
