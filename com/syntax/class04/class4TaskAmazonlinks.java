package com.syntax.class04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class class4TaskAmazonlinks {
   /* Amazon link count: Open chrome browser Go to “https://www.amazon.com/”
    Get all links Get number of links that has text Print to console only the links that has text*/
   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
       WebDriver webDriver=new ChromeDriver();
       webDriver.get("https://www.amazon.com");
       List<WebElement>Printlinks=webDriver.findElements(By.tagName("a"));
        for(WebElement element : Printlinks){
        String Texts = element.getText();
        String fullLink = element.getAttribute("href");
        if(!Texts.isEmpty()) { System.out.println(fullLink);}}
       webDriver.quit();
   }}
