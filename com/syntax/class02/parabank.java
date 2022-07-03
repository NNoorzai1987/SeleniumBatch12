package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabank {
    public static void main(String[] args)  {
        /*HW
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser*/

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("John");
        driver.findElement(By.id("customer.lastName")).sendKeys("Smith");
        driver.findElement(By.id("customer.address.street")).sendKeys("1235 Willow Pass Rd");
        driver.findElement(By.id("customer.address.city")).sendKeys("Concord");
        driver.findElement(By.id("customer.address.state")).sendKeys("California");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("94520");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("925-356-5522");
        driver.findElement(By.id("customer.ssn")).sendKeys("562-68-9512");
        driver.findElement(By.id("customer.username")).sendKeys("John_1920");
        driver.findElement(By.id("customer.password")).sendKeys("Smith@.0102");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Smith@.0102");
        driver.findElement(By.className("button")).click();
        driver.close();




    }
}
