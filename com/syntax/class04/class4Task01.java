package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*        Task
        Open chrome browser Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
        Enter valid username and password (username - Admin, password - Hum@nhrm123)
        Click on login button Then verify Syntax Logo is displayed. if condition*/
public class class4Task01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement Username= driver.findElement(By.cssSelector("input#txtUsername"));
        Username.sendKeys("Admin");
        WebElement password=driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement clickonLoging= driver.findElement(By.cssSelector("input#btnLogin"));
        clickonLoging.click();
        WebElement SyntaxLogo= driver.findElement(By.cssSelector("img[alt $= 'HRM']"));
        boolean Isdisplay= SyntaxLogo.isDisplayed();
        if(Isdisplay){
            System.out.println("The Syntax Logo is displayed");
        }else {
            System.out.println("The Syntax Logo is not displayed");
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
