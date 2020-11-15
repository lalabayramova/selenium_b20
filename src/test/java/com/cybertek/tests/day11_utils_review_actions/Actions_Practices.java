package com.cybertek.tests.day11_utils_review_actions;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Actions_Practices {


    @Test
public void hoverOver(){
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        WebElement img1=Driver.getDriver().findElement(By.xpath("(//div[@class='figure'] )[1]"));
        WebElement img2=Driver.getDriver().findElement(By.xpath("(//div[@class='figure'] )[2]"));
        WebElement img3=Driver.getDriver().findElement(By.xpath("(//div[@class='figure'] )[3]"));



        WebElement user1=Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2=Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3=Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        Actions actions=new Actions(Driver.getDriver());

        BrowserUtils.wait(2);
actions.moveToElement(img1).perform();
        Assert.assertTrue(user1.isDisplayed());


        actions.moveToElement(img2).perform();
        Assert.assertTrue(user2.isDisplayed());


        actions.moveToElement(img3).perform();
        Assert.assertTrue(user3.isDisplayed());


    }

}
