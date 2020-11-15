package com.cybertek.tests.MyPracticies;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
1.Open Chrome browser
2.Go to https://www.apple.com
3.Click to all of the headers one by onea.Mac, iPad, iPhone, Watch, TV, Music, Support
4.Printout how many links on each pagewiththe titles of the pages
5.Loop through all
6.Print out how many link is missing textTOTAL
7.Print out how many link has textTOTAL
8.Print out how many total linkTOTA



 */
public class TC3_FindElements_Apple {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");
WebElement mac=driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-mac']"));
mac.click();

WebElement iPad=driver.findElement(By.cssSelector("//a[class='ac-gn-link ac-gn-link-ipad']"));
iPad.click();
WebElement iPhone=driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
iPhone.click();

WebElement watch=driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-watch']"));
watch.click();

WebElement tv=driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-tv']"));

tv.click();

WebElement music=driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-music']"));
music.click();

WebElement support=driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-music']"));
support.click();



    }
}
