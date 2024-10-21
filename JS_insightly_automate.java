import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.html.HTMLInputElement;

public class JS_insightly_automate {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("JavaScript Insightly automate:");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vadion\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //driver.get("http://www.google.com");
        driver.get("https://login.insightly.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //  ------------  Login Automation  ------------

        js.executeScript("document.getElementById('emailaddress').value='testing.automat@gmail.com'");
        js.executeScript("document.getElementById('continue-button').click()");
        js.executeScript("document.getElementById('password').value='qweQWE123!@#'");
        js.executeScript("document.getElementById('login-button').click()");


        // -------------- Adding Tasks ---------------
        js.executeScript("document.evaluate('/html/body/div[1]/div[2]/ul/li[2]/a/div/div', document, null," +
                " XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click()");
        Thread.sleep(2000);
        js.executeScript("document.evaluate('/html/body/div[1]/div[3]/div[1]/div[1]/header/div[1]/div[1]/a', document, null," +
                " XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click()");

        // -------------- Entering values ---------------
        Thread.sleep(2000);
        js.executeScript("document.evaluate('/html/body/div[3]/div[2]/div/form/div/div/div/div/section[1]/div/div[1]/div[3]/div/span/input', " +
                "document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.value='Meeting'");

        // -------------- Entering values ---------------
        Thread.sleep(2000);
        js.executeScript("document.getElementById('Task_DUE_DATE').value='15 Oct 2024'");
        js.executeScript("document.getElementById('Task_START_DATE').value='10 Oct 2024'");
        js.executeScript("document.getElementById('Task-REMINDER_DATE_UTC').value='14 Oct 2024'");
        js.executeScript("document.getElementById('Task-REMINDER_DATE_UTC-time').value='10:00 AM'");
        js.executeScript("document.getElementById('Task_PERCENT_COMPLETE').value='50'");
        Thread.sleep(2000);

       //js.executeScript("document.getElementById('btn-save').click()");
        driver.findElement(By.id("btn-save")).click();


    }
}
