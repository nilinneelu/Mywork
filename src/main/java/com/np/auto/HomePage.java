package com.np.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.usbank.com/index.html");
        driver.manage().window().maximize();

       List<WebElement> cards= driver.findElements(By.xpath("//div[@class='card-title heading small']"));
       for (int i=0;i<cards.size();i++) {
       System.out.println(cards.get(i).getText());
       if(cards.get(i).getText().equalsIgnoreCase("Credit cards"))
       {
           driver.findElement(By.xpath("//div[@class='card-title heading small']")).click();
       }

           WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-cardname='cashback']")));
          String cardname1="//button[@data-cardname='";
          String cardname2="']";
          String value="cashback";
          driver.findElement(By.xpath(cardname1+value+cardname2)).click();

       }

       //    HDFC Bank Direction using index
       //    (//button[@class='g88MCb S9kvJb '])[3]

       }
    }
