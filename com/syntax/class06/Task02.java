package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
    /*
    HW
Go to https://syntaxprojects.com/javascript-alert-box-demo.php
click on each button and handle the alert accordingly
     */
    public static String url="https://syntaxprojects.com/javascript-alert-box-demo.php";
    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver webDriver = new ChromeDriver();
            webDriver.get(" https://syntaxprojects.com/bootstrap-iframe.php");
            webDriver.get(url);
            WebElement AlertBox=webDriver.findElement(By.xpath("//button[@class='btn btn-default']"));
            AlertBox.getText();
            String text=AlertBox.getText();
            System.out.println(text);
            System.out.println("-------------------------------------");
            WebElement wholeMessage=webDriver.findElement(By.xpath("//div[text()='Java Script Alert Box']/following-sibling::div"));
            wholeMessage.getText();
            String framemessage=wholeMessage.getText();
            System.out.println(framemessage);
            AlertBox.click();
            Alert simpAlert = webDriver.switchTo().alert();
            simpAlert.accept();
            System.out.println("------------------------------------------");
            Thread.sleep(2000);
            WebElement ConfirmBox=webDriver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
            ConfirmBox.getText();
            String str=ConfirmBox.getText();
            System.out.println(str);



    }
}
