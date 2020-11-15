package com.cybertek.tests.day10_testBase_properties_driverUtil;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void readingFromProperties() throws IOException {

        // We create properties object  to be able to read properties file
        Properties properties=new Properties();


        String path="configuration.properties";

        //We need to pass the path of the file we want to open in JVM

        FileInputStream file=new FileInputStream(path);

//We will load the file

        properties.load(file);

        //We read from the file

        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));

        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));


        // Close the file
file.close();


    }

    @Test
    public void usingProperties(){
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"smartbearUrl\") = " + ConfigurationReader.getProperty("smartbearUrl"));


    }

















}
