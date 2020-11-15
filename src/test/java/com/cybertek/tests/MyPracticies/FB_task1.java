package com.cybertek.tests.MyPracticies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_task1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        String expectedResult="Facebook - Log In or Sign Up";
        String actualResult=driver.getTitle();
        if(actualResult.equals(expectedResult)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }



    }
}
