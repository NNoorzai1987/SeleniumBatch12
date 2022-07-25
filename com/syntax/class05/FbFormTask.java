package com.syntax.class05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FbFormTask {
    /*
    HW1 Go to facebook sign up page Fill out the whole form Click signup
     */
    public static String url="https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://www.facebook.com");
        webDriver.get(url);
        WebElement newaccount=webDriver.findElement(By.partialLinkText("Create new account"));
        newaccount.click();
        Thread.sleep(2000);
        WebElement Fname=webDriver.findElement(By.xpath("//input[@name='firstname']"));
        Fname.sendKeys("Robert");
        WebElement Lsname=webDriver.findElement(By.xpath("//input[@name='lastname']"));
        Lsname.sendKeys("Timothy");
        WebElement Phonenum=webDriver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
        Phonenum.sendKeys("415-855-9955");
        WebElement Password=webDriver.findElement(By.xpath("//input[@aria-label='New password']"));
        Password.sendKeys("RoberTim.12");
        WebElement Month=webDriver.findElement(By.id("month"));
        Select select=new Select(Month);
        select.selectByVisibleText("Sep");
        WebElement day=webDriver.findElement(By.id("day"));
        Select click=new Select(day);
        click.selectByVisibleText("8");
        WebElement Year=webDriver.findElement(By.id("year"));
        Select chose=new Select(Year);
        chose.selectByVisibleText("1975");
        WebElement radio=webDriver.findElement(By.xpath("//input[@value='2']")); radio.click();
        WebElement SignUp= webDriver.findElement(By.xpath("//button[@name='websubmit']"));SignUp.click();}}
