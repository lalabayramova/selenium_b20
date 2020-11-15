package com.cybertek.tests.day11_utils_review_actions;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextClick {


    @Test
    public void context(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
WebElement idButton=Driver.getDriver().findElement(By.id("hot-spot"));
        Actions actions=new Actions(Driver.getDriver());
        actions.contextClick(idButton).perform();

        Alert alert=Driver.getDriver().switchTo().alert();
        alert.accept();
    }
}
