package com.syntax.class03;

import javafx.beans.property.SetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
   /* HW
    Navigate to http://syntaxprojects.com
    Click on start practicing
    click on simple form demo
    enter any text on first text box
    click on show message
    quit the browser*/
   public static void main(String[] args) throws InterruptedException{
       System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("http://syntaxprojects.com");
       WebElement startpractising =driver.findElement(By.xpath("//a [@id='btn_basic_example']"));
       startpractising.click();
       driver.manage().window().maximize();
       Thread.sleep(5000);
       WebElement SimpleFormDemo=driver.findElement(By.xpath("//a[contains(@class,'list-group-item')]"));
       /*SimpleFormDemo.click();
       Thread.sleep(2000);
       WebElement EnterMessage=driver.findElement(By.xpath("//input[contains(@id, 'user')]"));
       EnterMessage.sendKeys("Hello World");
       Thread.sleep(2000);
       WebElement ShowMessage=driver.findElement(By.xpath("//button[contains(@onclick, 'showInput')]"));
       ShowMessage.click();
       Thread.sleep(5000);
       driver.quit();
*/


   }
}
