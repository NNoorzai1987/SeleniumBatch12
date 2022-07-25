package com.syntax.class08;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.BitSet;
import java.util.concurrent.TimeUnit;
public class class08Task01 {
    /*go to https://the-internet.herokuapp.com/dynamic_controls
    click on checkbox and click on remove
    verify the text
    click on enable verify the textbox is enabled
    enter text and click disable
    verify the textbox is disabled*/
    public static String url="https://the-internet.herokuapp.com/dynamic_controls";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get(url);
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement checkbox=webDriver.findElement(By.xpath("//*[@type='checkbox']"));checkbox.click();
        WebElement RemoveButton=webDriver.findElement(By.xpath("//button[contains(text(),'Remove')]"));RemoveButton.click();
        WebElement textverification= webDriver.findElement(By.id("message"));textverification.getText();
        String text=textverification.getText();
        System.out.println(text);
        WebElement CheckEnablebutton=webDriver.findElement(By.xpath("//button[contains(text(),'Enable')]"));
        CheckEnablebutton.click();
        WebDriverWait wait=new WebDriverWait(webDriver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='text']")));
        WebElement check=webDriver.findElement(By.xpath("//*[@type='text']"));
        check.isEnabled();
        boolean print=check.isEnabled();
        System.out.println("Textbox available? "+print);
        WebElement checkbutton=webDriver.findElement(By.xpath("//button[contains(text(),'Disable')]"));checkbutton.isDisplayed();
        boolean checkif=checkbutton.isDisplayed();
        if (checkif){ System.out.println("The textbox is disable!");
        }else {System.out.println("The texbox is not disable!");}}}
