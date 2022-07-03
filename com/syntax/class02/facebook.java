package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
    public static void main(String[] args) throws InterruptedException {
        /*navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser*/

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("Hana");
        driver.findElement(By.name("lastname")).sendKeys("Elizabeth");
        driver.findElement(By.name("reg_email__")).sendKeys("415-856-2255");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Hana_1999");
        driver.findElement(By.name("birthday_month")).sendKeys("July");
        driver.findElement(By.name("birthday_day")).sendKeys("7");
        driver.findElement(By.name("birthday_year")).sendKeys("1991");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("img[src='https://static.xx.fbcdn.net/rsrc.php/v3/y2/r/__geKiQnSG-.png']")).click();
        Thread.sleep(5000);
        driver.close();



    }
}
