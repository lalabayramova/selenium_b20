package com.cybertek.tests.MyPracticies;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActivityStream {

    @Test
    public  void activityStream(){

        Driver.getDriver().get("https://login2.nextbasecrm.com/stream/");
        WebElement username=Driver.getDriver().findElement(By.xpath("//input[@class='login-inp']"));
username.sendKeys("helpdesk16@cybertekschool.com");

WebElement password=Driver.getDriver().findElement(By.name("USER_PASSWORD"));
password.sendKeys("UserUser");

        BrowserUtils.wait(2);

WebElement login=Driver.getDriver().findElement(By.xpath("//input[@type='submit']"));
login.click();


WebElement message=Driver.getDriver().findElement(By.id("feed-add-post-form-tab-message"));
message.click();

BrowserUtils.wait(2);
WebElement link=Driver.getDriver().findElement(By.xpath("//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']"));
link.click();

WebElement text=Driver.getDriver().findElement(By.xpath("//input[@placeholder='Link text']"));;
      text.sendKeys("functions");

WebElement linkInput=Driver.getDriver().findElement(By.xpath("//input[@placeholder='Link URL']"));
linkInput.sendKeys("bay@gmail.com");

WebElement save=Driver.getDriver().findElement(By.id("undefined"));
save.click();

        Assert.assertTrue(text.getText().equals("functions"));



    }

}
