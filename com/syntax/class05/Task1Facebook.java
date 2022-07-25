package com.syntax.class05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class Task1Facebook {
/*
TC 1: Facebook dropdown verification Open chrome browser Go to “https://www.facebook.com” click on create new account Verify: month dd has 12 month options
day dd has 31 day options year dd has 115 year options Select your date of birth Quit browser
 */
      public static String url="https://www.facebook.com";
   public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    WebDriver webDriver=new ChromeDriver();
    webDriver.get("https://www.facebook.com");
    webDriver.get(url) ;
    WebElement newacount=webDriver.findElement(By.partialLinkText("Create new account"));
    newacount.click();
    Thread.sleep(2000);
    WebElement listbox=webDriver.findElement(By.id("month"));
    Select select=new Select(listbox);
    List<WebElement> Months=select.getOptions();
    int numberofMonths=Months.size();
    System.out.println(numberofMonths);
    select.selectByVisibleText("Jan");
    for (int i =0; i <numberofMonths ; i++) {
        String MonthsoftheYear = Months.get(i).getText();
        System.out.print(MonthsoftheYear + " ");} System.out.println();
     Thread.sleep(2000);
     WebElement day =webDriver.findElement(By.xpath("//select[@aria-label='Day']"));
     select = new Select(day);
     List<WebElement>numberOfDays=select.getOptions();
     int Days=numberOfDays.size();
    select.selectByValue("1");
    for (int i =0; i <Days ; i++) {
    String weekdays= numberOfDays.get(i).getText();
    System.out.print(weekdays+" ");}System.out.println();
    Thread.sleep(2000);
    WebElement year =webDriver.findElement(By.id("year"));
    select=new Select(year);
    List<WebElement>Years=select.getOptions();
    int years=Years.size();
    Thread.sleep(2000);
    System.out.println(years);
    select.selectByValue("1987");
    for (int i = 0; i <years ; i++) {
        String numOfyears=Years.get(i).getText();
        System.out.print(numOfyears+" ");}
    System.out.println();
    Thread.sleep(5000);
    webDriver.quit();}}
