package com.syntax.class04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class class4ApplicationTask {
    /*HRMS Application Negative Login: Open chrome browser
    Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
    Enter valid username  Leave password field empty
    Click on login button Verify error message with text “Password cannot be empty” is displayed.*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName = webDriver.findElement(By.cssSelector("input[type $= 'text']"));
        userName.sendKeys("Admin123");
        WebElement password=webDriver.findElement(By.cssSelector("input[type $= 'password']"));
        Thread.sleep(5000);
        WebElement ClickonLogin=webDriver.findElement(By.cssSelector("input#btnLogin"));
        ClickonLogin.click();
        WebElement cannotbeEmpty =webDriver.findElement(By.cssSelector("span#spanMessage"));
        if(cannotbeEmpty.isDisplayed()){System.out.println("error message with text “Password cannot be empty” is displayed.");}
        else {System.out.println("error message with text “Password cannot be empty” is not displayed.");}
        Thread.sleep(5000);
        /*webDriver.quit();*/
    }}
