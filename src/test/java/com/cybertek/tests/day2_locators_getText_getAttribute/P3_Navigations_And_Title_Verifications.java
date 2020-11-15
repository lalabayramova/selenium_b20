package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_Navigations_And_Title_Verifications {
    public static void main(String[] args) {
        //TC #3: Back and forth navigation
//1- Open a chrome browser
//2 - GO to: https://google.com
//3-click to Gmail from top right
//4-verify title contains
//Expected: Gmail
//5-GO back to Google by using the. Back
//6- Verify title equals:
//Expected: Google
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
       driver.get("https://www.google.com");

       driver.findElement(By.linkText("Gmail")).click();

String expectedInTitle="Gmail";
String actualTitle=driver.getTitle();

if(actualTitle.contains(expectedInTitle)){
    System.out.println("Title verification PASSED!");
}else{
    System.out.println("Title verification FAILED!");
}
driver.navigate().back();

String expectedGoogleTitle="Google";
String actualGoogleTitle=driver.getTitle();

if(actualGoogleTitle.equals(expectedGoogleTitle)){
    System.out.println("Google title verification PASSED!");
}else{
    System.out.println("Google title verification FAILED!");
}




















    }
}
