package com.syntax.class05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TaskforEbay {
    /*
    HW2
    Go to ebay.com
    get all the categories and print them in the console
    select Computers/Tables & Networking
    click on search
    verify the header
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://www.ebay.com");
        WebElement allcategories =webDriver.findElement(By.xpath("//select[@aria-label='Select a category for search']"));
        allcategories.getText();
        String print=allcategories.getText();
        System.out.println(print);
        WebElement CompTableNetworking =webDriver.findElement(By.id("gh-cat"));
        Select select=new Select(CompTableNetworking);
        select.selectByVisibleText("Computers/Tablets & Networking");
         WebElement Search =webDriver.findElement(By.xpath("//input[@value ='Search']"));
        Search.click();

        WebElement Header =webDriver.findElement(By.xpath("//span[@class ='b-pageheader__text']"));
        Header.isDisplayed();
        boolean Displing=Header.isDisplayed();
        System.out.println("Is the header is displaying? "+Displing);
    }
}
