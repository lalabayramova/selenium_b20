package com.cybertek.tests.MyPracticies;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SeleniumEasy_CheckBox_Verification2 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

WebElement checkAll=driver.findElement(By.xpath("//input[@type='button']"));
String actualText=checkAll.getAttribute("value");
String expectedText="Check All";

if(actualText.equals(expectedText)){
    System.out.println("Passed");
}else {
    System.out.println("Failed");
}
checkAll.click();

        List<WebElement>listOfAllBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
for(WebElement each:listOfAllBoxes){
    if(each.isSelected()){
        System.out.println("Passed");
    }else {
        System.out.println("Failed");
    }
}
WebElement uncheckAll=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));

String expected="Uncheck All";
String actual=uncheckAll.getAttribute("value");
        Assert.assertEquals(expected,actual);


    }
}
