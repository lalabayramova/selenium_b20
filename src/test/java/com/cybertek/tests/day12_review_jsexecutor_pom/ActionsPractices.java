package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void doubleClick(){
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        Driver.getDriver().switchTo().frame("iframeResult");
        WebElement textDouble=Driver.getDriver().findElement(By.id("demo"));

        Actions actions=new Actions(Driver.getDriver());

        actions.doubleClick(textDouble).perform();
        String expected="red";
        String actual=textDouble.getAttribute("style"); // color red
        Assert.assertTrue(actual.contains(expected));

    }



      @Test
      public void dragDrop(){
          Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
          WebElement bigCircle=Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));

        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle,bigCircle).perform();
String expected="You did great!";
String actual=bigCircle.getText();


Assert.assertTrue(actual.equals(expected));



      }

@Test
    public void contextClick(){

        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        WebElement box=Driver.getDriver().findElement(By.id("hot-spot"));
        Actions actions=new Actions(Driver.getDriver());
        actions.contextClick(box).perform();

    Alert alert=Driver.getDriver().switchTo().alert();
    alert.accept();





}

















    }

