package com.np.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionclass {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement iframe= driver.findElement(By.xpath("//iframe[@name='callout']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();

    }
}
