package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Task_1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com");
String expectedResult="Facebook";
String actualResult=driver.getTitle();
if(actualResult.equals(expectedResult)){
    System.out.println("Facebook-Log in or Sign Up");
}




    }

}
