package com.cybertek.tests.MyPracticies;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumEasy_Checkbox_Verification1 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
WebElement successButton=driver.findElement(By.xpath("//div[@id='txtAge']"));
if(!successButton.isDisplayed()){
    System.out.println("Passed");
}else {
    System.out.println("Failed");
}
WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
checkBox.click();
        if(successButton.isDisplayed()){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }


    }
}
