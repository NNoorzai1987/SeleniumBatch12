package com.syntax.class07;
import com.sun.org.apache.bcel.internal.generic.BIPUSH;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class Class7Task01 {
   /* HW
    Go to https://demoqa.com/browser-windows
    click on New Tab and print the text from new tab in the console
    click on New Window and print the text from new window in the console
    click on New Window Message and print the text from new window in the console
    Verify (compare) the titles for each page
    Print out the title of the all pages*/
    public static String url="https://demoqa.com/browser-windows";
   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get(url);
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       String MainPage=driver.getWindowHandle();
       WebElement NewTab=driver.findElement(By.id("tabButton"));NewTab.click();NewTab.getText();
       System.out.println(NewTab.getText());
       WebElement NewWindow=driver.findElement(By.cssSelector("button#windowButton"));NewWindow.click();NewWindow.getText();
       System.out.println(NewWindow.getText());
       WebElement NewWindowMessage=driver.findElement(By.xpath("//button[text()='New Window Message']"));NewWindowMessage.click();NewWindowMessage.getText();
       System.out.println(NewWindowMessage.getText());

       Set<String>AllWindowHandles=driver.getWindowHandles();
       Iterator<String> Print=AllWindowHandles.iterator();
       while (Print.hasNext()){
           String handle=Print.next();
          if(!MainPage.equals(handle)){
              String title=driver.getTitle();
              System.out.println(title);}}}}
