package com.np.auto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readingPropertyfile {
    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();


       String propertyFilePath= System.getProperty("user.dir")+"\\src\\main\\resources\\data.properties";
        System.out.println(propertyFilePath);
        FileReader reader = new FileReader(propertyFilePath);
        prop.load(reader);
        System.out.println("The url is"+prop.getProperty(("Url")));
    }
}
