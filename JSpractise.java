package sampleapp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSpractise {
    public static void main(String[] args) {
        System.out.println("javascript automation");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vadion\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("prompt('Enter Your Name :')");
       // driver.quit();



    }
}
// js.executeScript("alert('Welcome to Selenium')");

