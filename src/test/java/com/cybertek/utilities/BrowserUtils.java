package com.cybertek.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

// in this class we will store utility methods that can be applied to any browser content
public class BrowserUtils {
  /*
  Accepts a list of web element
  @param List<WebElement>
  @return List<String>

   */
public static List<String>getElementsText(List<WebElement>list){
List<String>webElementsAsString=new ArrayList<>();
for (WebElement each:list){
    webElementsAsString.add(each.getText());

}
return webElementsAsString;

}


public static void wait(int sec){
    try {
        Thread.sleep(1000 * sec);
    } catch (InterruptedException e) {
        System.out.println("Interrupted Exception caught");
    }
}






}
