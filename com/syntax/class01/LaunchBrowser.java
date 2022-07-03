package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // setting the property to use chromedriver
                                                        // for windows users add extension .exe
        WebDriver driver = new ChromeDriver(); // launch the browser
        driver.get("http://www.google.com");
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        Thread.sleep(2000);
        System.out.println(url);
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(2000);
        driver.quit();
    }
}
