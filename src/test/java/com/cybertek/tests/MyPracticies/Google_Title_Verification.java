package com.cybertek.tests.MyPracticies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Title_Verification {
    public static void main(String[]args){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

String expectedTitle="Google";
String actualTitle=driver.getTitle();
if(actualTitle.equals(expectedTitle)){
    System.out.println("Passed");
}else {
    System.out.println("Failed");
}



    }

}
