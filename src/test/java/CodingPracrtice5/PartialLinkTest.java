package CodingPracrtice5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PartialLinkTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//section[@id='examples']/div/div/div/div/h3/a[contains(text(),'Radio Buttons')]"));
        element.click();
        String condtionalUrl = "https://practice.expandtesting.com/radio-buttons";
        String current = driver.getCurrentUrl();
        System.out.println(current);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlToBe(condtionalUrl));
        if (current.equals(condtionalUrl)) {
            System.out.println("Navigated to Radio Buttons Practice Page.");
        }
        driver.quit();
    }
    }

