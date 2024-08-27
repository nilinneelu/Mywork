package com.np.auto;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class screenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.usbank.com/index.html");
        driver.manage().window().maximize();

        TakesScreenshot screenshot = (TakesScreenshot) driver;
         File ss=  screenshot.getScreenshotAs(OutputType.FILE);
        String path=System.getProperty("user.dir")+"\\screenshot\\screenshot.png";
        FileHandler.copy(ss,new File(path));

    }
}
