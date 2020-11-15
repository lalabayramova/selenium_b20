package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }

    @Test
    public void p1_infoAlert() {

WebElement jsAlert=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
jsAlert.click();
        Alert alertButton=driver.switchTo().alert();
        alertButton.accept();
       WebElement result= driver.findElement(By.xpath("//p[.='You successfuly clicked an alert']"));
       String resultText=result.getText();
       String expected="You successfuly clicked an alert";

        Assert.assertEquals(resultText,expected);

    }

}