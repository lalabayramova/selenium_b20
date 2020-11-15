package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args)throws InterruptedException{
// 1-Set up the web driver


        WebDriverManager.chromedriver().setup();

   //2-create the instance of the Chrome Driver

        WebDriver driver=new ChromeDriver(); // THIS LINE IS OPENING ME BROWSER
        driver.manage().window().maximize();

//3- test is driver is working
driver.get("https://www.google.com");

       // System.out.println("The title of the page is: "+ driver.getTitle());

        String actualTitle=driver.getTitle();

        System.out.println("ACTUAL TITLE STRING: "+actualTitle);

        String actualURL=driver.getCurrentUrl();

        System.out.println("actualURL = " + actualURL);
        Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);

driver.navigate().forward();
Thread.sleep(1000);
driver.navigate().refresh();
Thread.sleep(1000);

driver.navigate().to("https://www.facebook.com");

String pageSource=driver.getPageSource();
        System.out.println("pageSource = " + pageSource);
driver.close();

    }

}
