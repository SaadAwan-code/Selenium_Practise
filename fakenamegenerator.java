
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class fakenamegenerator {

    public static void main(String[] args) throws InterruptedException {
        List<String> names = generateNames(10);
        System.out.println(names);
    }

    public static List<String> generateNames(int numOfNames) throws InterruptedException {

        if (numOfNames > 10) {
            numOfNames = 10;
        } else if (numOfNames <= 0) {
            numOfNames = 1;
        }

        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vadion\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.duplichecker.com/name-generator.php");
        driver.manage().window().maximize();
        js.executeScript("document.querySelector(\"#countries\").click()");
        driver.findElement(By.xpath("/html/body/div[7]/div/div[1]/div/div/div[1]/form/div[1]/div/div[1]/div/div/select/option[12]")).click();
        driver.findElement(By.name("gender")).click();
        driver.findElement(By.xpath("/html/body/div[7]/div/div[1]/div/div/div[1]/form/div[1]/div/div[2]/div[1]/div/select/option[2]")).click();
        js.executeScript("document.querySelector(\"#range\").click()");
        js.executeScript("document.querySelector(\"#taxcalculator > div.col-xl.text-center > input\").click()");
        
        List<WebElement> parentElements = driver.findElements(By.xpath("/html/body/div[7]/div/div[1]/div/div/div[1]/div[4]/div[1]/div[2]"));

        List<String> names = new ArrayList<>();
        for (WebElement parentElement : parentElements) {
            List<WebElement> childDivs = parentElement.findElements(By.xpath("./div")); // Using './div' to get direct child divs
            for (WebElement nextparents : childDivs) {
                List<WebElement> nextchildDivs = nextparents.findElements(By.xpath("./div")); // Using './div' to get direct child divs

                for (WebElement child : nextchildDivs) {
                   String name = child.getText();
                       names.add(name.replace("Copy",""));

                }

            }

        }
        return names;
    }
}
