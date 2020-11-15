package com.cybertek.tests.day10_testBase_properties_driverUtil;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilsPractice {

    @Test
    public void googleSearch(){

        Driver.getDriver().get("https://google.com");
       WebElement searchBox= Driver.getDriver().findElement(By.name("q"));
       String search= ConfigurationReader.getProperty("searchValue");
searchBox.sendKeys(search+ Keys.ENTER);

String expected=search;
String actual=Driver.getDriver().getTitle();


        Assert.assertTrue(actual.contains(expected));
    }




}
