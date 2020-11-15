package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor_Practices {
    @Test
    public void scroll() {

        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
        BrowserUtils.wait(1);

        for (int i = 0; i <10 ; i++) {
            js.executeScript("window.scrollBy(0,500)");

        }







    }

  @Test
  public void scroll2(){
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        BrowserUtils.wait(2);
        WebElement link=Driver.getDriver().findElement(By.linkText("Cybertek School"));
      WebElement homeLink=Driver.getDriver().findElement(By.linkText("Home"));

      //locating cybertek school link
     JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();

     js.executeScript("arguments[0].scrollIntoView(true)",link);
     BrowserUtils.wait(2);


      js.executeScript("arguments[0].scrollIntoView(true)",homeLink);

BrowserUtils.wait(2);
      js.executeScript("window.scrollBy(500,500)"); // scrolling right and then scrolling down

  }


  @Test
    public void fillForm(){

       Driver.getDriver().get("http://practice.cybertekschool.com/sign_up");

     WebElement userName= Driver.getDriver().findElement(By.name("full_name"));
     WebElement email= Driver.getDriver().findElement(By.name("email"));
     WebElement sign= Driver.getDriver().findElement(By.name("wooden_spoon"));



     BrowserUtils.wait(2);
// sending keys to username input
     JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
js.executeScript("arguments[0].setAttribute('value', 'Jane Doe')" ,userName);

js.executeScript("arguments[0].setAttribute('value', 'something@gmail.com')",email);

BrowserUtils.wait(2);

js.executeScript("arguments[0].click()",sign);













  }








}
