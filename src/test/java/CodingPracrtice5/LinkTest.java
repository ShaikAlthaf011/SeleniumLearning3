package CodingPracrtice5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LinkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.expandtesting.com");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//section[@id='examples']/div/div/div/div/h3/a[contains(text(),'Web inputs')]"));
        element.click();
        String ExpectedUrl="https://practice.expandtesting.com/inputs";
        String currentUrl=driver.getCurrentUrl();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(ExpectedUrl));
        if(currentUrl.equals(ExpectedUrl)){
            System.out.println("Navigated to Web Inputs Practice Page");
        }
        driver.quit();
    }
}
