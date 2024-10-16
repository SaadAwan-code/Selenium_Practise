package sampleapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class insightly {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("insightly automate");

        System.setProperty("webdriver.chrome.driver","C:\\Users\\vadion\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("https://www.insightly.com/");

        //  ------------  Login Automation  ------------
        driver.get("https://login.insightly.com/");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("demo100@mailinator.com");

        WebElement ContinueButton = driver.findElement(By.id("continue-button"));
        ContinueButton.click();

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("qweQWE123!@#");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();


        // -------------- Adding Tasks ---------------

       WebElement tasksbutton = driver.findElement(By.xpath("//a[@id='navlink_task']"));
       tasksbutton.click();


        Thread.sleep(2000);

       WebElement newTaskButton = driver.findElement(By.xpath(
                 "/html/body/div[1]/div[3]/div[1]/div[1]/header/div[1]/div[1]/a"
                         ));
         newTaskButton.click();

        // -------------- Entering values ---------------
        Thread.sleep(2000);
        WebElement taskname = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div/div/div/section[1]/div/div[1]/div[3]/div/span/input"));
        taskname.sendKeys("Meeting");


        // -------------- Entering Duedate values ---------------
        Thread.sleep(2000);
        WebElement duedate = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div/div/div/section[1]/div/div[4]/div[3]/div/label/input[1]"));
        duedate.click();
        Thread.sleep(2000);
        WebElement nextmonth = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div/div/div/section[1]/div/div[4]/div[3]/div/label/div/div[1]/table/thead/tr[1]/th[3]"));
        nextmonth.click();
        Thread.sleep(2000);
        WebElement selectdate = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div/div/div/section[1]/div/div[4]/div[3]/div/label/div/div[1]/table/tbody/tr[5]/td[1]"));
        selectdate.click();

        // -------------- Entering StartDate values ---------------
        Thread.sleep(2000);
        WebElement startdate = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div/div/div/section[2]/div/div[1]/div[3]/div/label/input[1]"));
        startdate.click();
        Thread.sleep(2000);
        WebElement snextmonth = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div/div/div/section[2]/div/div[1]/div[3]/div/label/div/div[1]/table/thead/tr[1]/th[3]"));
        snextmonth.click();
        Thread.sleep(2000);
        WebElement sselectdate = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div/div/div/section[2]/div/div[1]/div[3]/div/label/div/div[1]/table/tbody/tr[3]/td[3]"));
        sselectdate.click();


        // -------------- Entering ReminderDate values ---------------
        Thread.sleep(2000);
        WebElement reminderdate = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div/div/div/section[2]/div/div[2]/div[3]/div/label[1]/input[1]"));
        reminderdate.click();
        Thread.sleep(2000);
        WebElement rnextmonth = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div/div/div/section[2]/div/div[2]/div[3]/div/label[1]/div/div[1]/table/thead/tr[1]/th[3]"));
        rnextmonth.click();
        Thread.sleep(2000);
        WebElement rreminderdate = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div/div/div/section[2]/div/div[2]/div[3]/div/label[1]/div/div[1]/table/tbody/tr[2]/td[7]"));
        rreminderdate.click();


        Thread.sleep(2000);
        WebElement progress = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div/div/div/section[2]/div/div[4]/div[3]/div/input"));
        progress.sendKeys("5");


        Thread.sleep(2000);
        WebElement mylabel = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div/div/div/div/section[6]/div/div/div[3]/div/input"));
        mylabel.sendKeys("label");


        Thread.sleep(2000);
        WebElement savebutton = driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[5]"));
        savebutton.click();

    }
}



