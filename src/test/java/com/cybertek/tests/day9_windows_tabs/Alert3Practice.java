package com.cybertek.tests.day9_windows_tabs;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alert3Practice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }
    @Test
    public void alertPractice(){
WebElement pjButton=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
pjButton.click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Hello");
        alert.accept();

     WebElement expectedText=  driver.findElement(By.id("result"));
        Assert.assertTrue(expectedText.isDisplayed());
        

    }
}
