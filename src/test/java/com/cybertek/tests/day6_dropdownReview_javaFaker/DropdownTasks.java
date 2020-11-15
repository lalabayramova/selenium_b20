package com.cybertek.tests.day6_dropdownReview_javaFaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownTasks {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void test2_verify_state_dropdown() throws InterruptedException {
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Virginia");
        Thread.sleep(1000);
        stateDropdown.selectByValue("CA");
        String expectedResult = "California";
        String actualResult = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualResult, expectedResult, "actual vs expected");
    }

    @Test
    public void test3_date_dropdown_verification() {

        /*
TC #3: Selecting date on dropdown and verifying
1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/dropdown
3.Select “December 1st, 1921” and verify it is selected.
Select year using: visible text
Select month using : value attribute
Select day using: index number

*/
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        String expectedYear = "1921";
        String expectedMonth = "December";
        String expectedDay = "1";

        yearDropdown.selectByVisibleText("1921");
        monthDropdown.selectByValue("11");
        dayDropdown.selectByIndex(0);

        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();


        Assert.assertEquals(actualYear, expectedYear);
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertTrue(actualDay.equals(expectedDay));



/*
TC #4: Selecting value from multiple select dropdown
1.Open Chrome browser
2.Go to http://practice.cybertekschool.com/dropdown
3.Select all the options from multiple select dropdown.
4.Print out all selected values.
5.Deselect all values.



 */

    }


@Test
    public void task4_multiple_value_select_dropdown() throws InterruptedException{
      Select optionsDropdown=new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
    List<WebElement> allOptions=optionsDropdown.getOptions();
    for(WebElement eachOption:allOptions){
        Thread.sleep(500);
        eachOption.click();
        System.out.println("Selected: "+eachOption.getText());
        Assert.assertTrue(eachOption.isSelected(),"The option is not selected");
    }
optionsDropdown.deselectAll();
for(WebElement eachOption:allOptions){
    Assert.assertTrue(!eachOption.isSelected());
}
}

@Test
    public void test5_html_dropdown_handling(){
        WebElement websiteDropdown=driver.findElement(By.xpath("//div[@class='dropdown']/a"));
        websiteDropdown.click();
        WebElement facebookLink=driver.findElement(By.xpath("//a[.='Facebook']"));
        facebookLink.click();

        String actualTitle=driver.getTitle();
        String expectedTitle="Facebook - Log In or Sign Up";
        Assert.assertEquals(actualTitle,expectedTitle);





}

















}
