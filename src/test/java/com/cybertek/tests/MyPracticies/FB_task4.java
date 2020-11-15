package com.cybertek.tests.MyPracticies;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FB_task4 {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.facebook.com");
WebElement createPage=driver.findElement(By.xpath("//a[.='Create a Page']"));
String button=createPage.getText();
String expectedResult="Create a Page";
String actualResult=button;
if(actualResult.equals(expectedResult)){
    System.out.println("PASSED");
}else {
    System.out.println("FAILED");
}




    }
}
