package com.syntax.class10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class HW2class10 {
   /* HW Go to https://www.aa.com/homePage.do
    select depart date
    select return date
    select destination
    click on search
    quit the browser*/
   public static String url = "https://www.aa.com/homePage.do";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement departdate=driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
        departdate.click();departdate.clear();
        departdate.sendKeys("SFO");
        WebElement destinaion=driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
        destinaion.sendKeys("BER");
        WebElement NumOfPassegnger=driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
        Select number=new Select(NumOfPassegnger);
        number.selectByVisibleText("7");
        WebElement departDate=driver.findElement(By.xpath("//label[@for='aa-leavingOn']/following-sibling::button"));
        departDate.click();
        WebElement departDate1 = driver.findElement(By.xpath("//input[@name='departDate']"));
        departDate1.sendKeys("12/21/2022");
        WebElement returnDateDate = driver.findElement(By.xpath("//input[@name='returnDate']"));
        returnDateDate.sendKeys("01/5/2023");
        WebElement searchButton = driver.findElement(By.cssSelector("input[id*=reSubmit"));
        searchButton.click();
}}
