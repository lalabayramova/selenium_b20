package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_Header_Verification {
    public static void main(String[] args){

       //TC #6: Zero Bank header verification
        // 1.Open Chrome browsera
        // 2.Go to http://zero.webappsecurity.com/login.html
        // 3.Verify header textExpected:
        // “Log in to ZeroBank”

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();


driver.get("http://zero.webappsecurity.com/login.html");
   String actualText= driver.findElement(By.tagName("h3")).getText(); // returns String
      String expectedText="Log in to ZeroBank";

      if(actualText.equals(expectedText)){
          System.out.println("Header verification passed");
      }else{
          System.out.println("Header verification failed");
      }








    }









}
