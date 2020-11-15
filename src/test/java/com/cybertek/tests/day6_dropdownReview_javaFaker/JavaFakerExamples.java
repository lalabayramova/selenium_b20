package com.cybertek.tests.day6_dropdownReview_javaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerExamples {

    @Test
    public void faker_test(){
        Faker faker=new Faker();
       String firstName= faker.name().firstName();
        System.out.println("firstName = " + firstName);
        String lastName=faker.name().lastName();
        System.out.println("lastName = " + lastName);

        String house=faker.gameOfThrones().house();
        System.out.println("house = " + house);
String quote=faker.gameOfThrones().quote();
        System.out.println("quote = " + quote);
    }


}
