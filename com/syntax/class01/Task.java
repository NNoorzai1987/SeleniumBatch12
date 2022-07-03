package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

    /**
     * 1. launch the browser
     * 2. navigate to amazon web site
     * 3. print out the title and the url in the console
     * 4. close the browser
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");
        driver.manage().window().fullscreen();
        Thread.sleep(10000);
        driver.navigate().to("https://www.ebay.com");
        String title = driver.getTitle();

        String url = driver.getCurrentUrl();
        System.out.println(title + " " + url);
        driver.manage().window().maximize();
        Thread.sleep(299999999);
        driver.quit();
    }
}
