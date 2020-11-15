package com.cybertek.tests.MyPracticies;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cybertek_Forgot_Password {

WebDriver driver;
    @BeforeMethod
    public void setUp(){
      driver= WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();

    }
    @Test
    public void forgotPassword(){
        driver.get("http://practice.cybertekschool.com/forgot_password");
       WebElement home= driver.findElement(By.xpath("//a[@class='nav-link']"));
       WebElement password= driver.findElement(By.xpath("//h2[.='Forgot Password']"));
WebElement email=driver.findElement(By.xpath("//label[@for='email']"));
WebElement emailInput=driver.findElement(By.name("email"));
WebElement retrieve=driver.findElement(By.xpath("//i[.='Retrieve password']"));
WebElement powered=driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        Assert.assertTrue(password.isDisplayed() && home.isDisplayed() && email.isDisplayed() &&emailInput.isDisplayed() && retrieve.isDisplayed() && powered.isDisplayed());

    }






}
