package com.syntax.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CommonMethods {
    /*create a package and name it as utils
    create a class and name as CommonMethods
            create functions (methods) to open and quit the browsers
    open method has to accept a url as a parameter*/
    WebDriver webDriver=new ChromeDriver();
    public void OpenBrowser(String Url) {;
        webDriver.get(Url);
    }
    public void quitTheBrowser(){
        webDriver.quit();
    }
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        CommonMethods commonMethods=new CommonMethods();
        commonMethods.OpenBrowser("https://www.ebay.com/");
        Thread.sleep(5000);
        commonMethods.quitTheBrowser();
    }}
