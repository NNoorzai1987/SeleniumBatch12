package com.syntax.class06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task01 {
    /*Task Navigate to https://syntaxprojects.com/bootstrap-iframe.php verify the header text Sorry,
     We Couldn't Find Anything For “Asksn” is displayed, verify enroll today button is enabled */
    public static String url="https://syntaxprojects.com/bootstrap-iframe.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(" https://syntaxprojects.com/bootstrap-iframe.php");
        webDriver.get(url);
        webDriver.switchTo().frame("FrameOne");
        WebElement display = webDriver.findElement(By.xpath("//h1[@class='heading-13']"));
        display.isDisplayed();
        boolean IsDisplaying=display.isDisplayed();
        System.out.println("Is the text (Sorry We Couldn't Find Anything For “Asksn”) is displaying? "+IsDisplaying);
        webDriver.switchTo().defaultContent().switchTo().frame("FrameTwo");
        WebElement check=webDriver.findElement(By.xpath("//div[@class='text-block-2']"));
        check.isEnabled();
        boolean findout=check.isEnabled();
        System.out.println("Check the enroll today button is enabled? "+findout);}}
