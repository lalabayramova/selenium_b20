package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_Google_Search {
    public static void main(String[] args) {
       // TC#4:	Google	search1-
        // Open	a	chrome	browser
        // 2-Go	to:	https://google.com
        // 3-Write	“apple”	in	search	box
        // 4-Click	google	search	button
        // 5-Verify	title:
        // Expected:	Title	should	start	with	“apple


        // set up the browser driver
        WebDriverManager.chromedriver().setup();


        // create driver instance and open chrome browser
        WebDriver driver=new ChromeDriver();

driver.get("https://www.google.com");

       driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);



String expectedTitle="apple - Google Search";
String actualTitle=driver.getTitle();

if(actualTitle.equals(expectedTitle)){
    System.out.println("Search title verification passed");
}else{
    System.out.println("search title verification failed");
}






    }
}
