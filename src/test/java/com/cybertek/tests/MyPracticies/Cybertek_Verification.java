package com.cybertek.tests.MyPracticies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cybertek_Verification {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(" https://practice.cybertekschool.com");
String expectedResult="cybertekschcool";
String actualResult=driver.getCurrentUrl();
if(actualResult.contains(expectedResult)){
    System.out.println("Passed");
}else {
    System.out.println("Failed");
}


    }
}
