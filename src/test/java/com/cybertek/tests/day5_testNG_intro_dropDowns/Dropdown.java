package com.cybertek.tests.day5_testNG_intro_dropDowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdown {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void dropdown_test_1() throws InterruptedException{
        Select simpleDropdown=new Select(driver.findElement(By.id("dropdown")));


      String actualSelectedOption=simpleDropdown.getFirstSelectedOption().getText(); // return type is web element

String expectedSelectedOption="Please select an option";
        Assert.assertEquals(actualSelectedOption,expectedSelectedOption);
        Thread.sleep(2000);
        simpleDropdown.selectByVisibleText("Option 2");

    }





}