package com.syntax.class10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class HW1class10 {
   /* HW
    Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
    click on leave  click on leave list    choose from "From calendar"   choose from "To calendar"
    click only on cancelled and rejected checkboxes   uncheck Pending Approval  select IT support from DD  click search*/
   public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get(url);
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       WebElement username = driver.findElement(By.id("txtUsername"));
       username.sendKeys("Admin");
       WebElement password = driver.findElement(By.id("txtPassword"));
       password.sendKeys("Hum@nhrm123");
       WebElement loginButton = driver.findElement(By.id("btnLogin"));loginButton.click();
       WebElement leaveButton = driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveModule']")); leaveButton.click();
       WebElement LeaveList=driver.findElement(By.xpath("//a[contains(text(),'Leave List')]"));LeaveList.click();
       WebElement chosecalendar=driver.findElement(By.id("calFromDate"));chosecalendar.click();
       WebElement ChosedMonth=driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
       Select select = new Select(ChosedMonth);select.selectByVisibleText("Apr");
       WebElement ChoseYear=driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
       Select select2=new Select(ChoseYear);select2.selectByVisibleText("2023");

       List<WebElement> StartsDate = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
       for(WebElement Date: StartsDate) {String dateText = Date.getText();if(dateText.equals("21")) {Date.click();break;}}
       WebElement Todate=driver.findElement(By.xpath("//input[@id='calToDate']/following-sibling::img"));Todate.click();
       WebElement Enddate=driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
       Select todate=new Select(Enddate);todate.selectByVisibleText("Jun");
       WebElement ReturnYear=driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
       Select returnyear=new Select(ReturnYear);returnyear.selectByVisibleText("2024");
       List<WebElement> RD = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
       for(WebElement REDate: RD) {String dateText = REDate.getText();if(dateText.equals("27")) {REDate.click();break;}}
       WebElement click=driver.findElement(By.id("leaveList_chkSearchFilter_0"));click.click();
       WebElement Click=driver.findElement(By.id("leaveList_chkSearchFilter_-1"));Click.click();
       WebElement Diselect=driver.findElement(By.id("leaveList_chkSearchFilter_1"));Diselect.click();
       WebElement clickIT=driver.findElement(By.id("leaveList_cmbSubunit"));
       Select ITDeport=new Select(clickIT);ITDeport.selectByVisibleText("IT Support");
       WebElement search=driver.findElement(By.id("btnSearch"));search.click(); }}
