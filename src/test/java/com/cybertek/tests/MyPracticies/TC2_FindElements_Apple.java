package com.cybertek.tests.MyPracticies;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/*

TC #02: FINDELEMENTS_APPLE
1.Open Chrome browser
2.Go to https://www.apple.com
3.Click to iPhone
4.Print out the texts of all links
5.Print out how many link is missing text
6.Print out how many link has text
7.Print out how many total link


 */
public class TC2_FindElements_Apple {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");
WebElement iPhone=driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
iPhone.click();
        int linkWithoutText=0;
        int linkWithText=0;
        List<WebElement> allLinks=driver.findElements(By.xpath("//body//a"));
        for(WebElement eachLink:allLinks){
            String textOfEachLink=eachLink.getText();
            System.out.println(textOfEachLink);

if(textOfEachLink.isEmpty()){
    linkWithoutText++;
}else {
    System.out.println(linkWithText++);
}

        }




    }
}
