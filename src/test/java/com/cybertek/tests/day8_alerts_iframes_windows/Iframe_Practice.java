package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iframe_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");
    }
@Test
    public void iFramePractice(){
        // by index
   // driver.switchTo().frame(0);
    // by id
   // driver.switchTo().frame("mce_0_ifr");

   WebElement iframe= driver.findElement(By.id("mce_0_ifr"));
   driver.switchTo().frame(iframe);

      WebElement content= driver.findElement(By.xpath("//p"));
    Assert.assertTrue(content.isDisplayed());

    driver.switchTo().defaultContent();

   WebElement header= driver.findElement(By.xpath("h3"));
   Assert.assertTrue(header.isDisplayed());


}





}
