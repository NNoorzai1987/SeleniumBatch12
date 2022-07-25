package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class class7Task02 {
    /*HW
    navigate to http://www.uitestpractice.com/Students/Contact
    click on the link
    get text
    print out in the console*/

    public static String url="http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement Alxa= driver.findElement(By.xpath("//a[contains(text(),'This is')]"));Alxa.click();
        WebElement gettext=driver.findElement(By.xpath("//p[contains(text(), 'web application')]"));
        gettext.getText();
        String text=gettext.getText();
        System.out.println(text);

}}
