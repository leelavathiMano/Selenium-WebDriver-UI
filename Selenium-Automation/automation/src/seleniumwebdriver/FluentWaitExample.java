package seleniumwebdriver;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {
    public static void main(String[] args) {
        // This is a placeholder for the FluentWaitExample implementation.
        // You can implement the FluentWait logic here as needed.
        System.out.println("FluentWaitExample is not yet implemented.");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
        driver.findElement(By.cssSelector("#start button")).click();
        Wait<WebDriver> fluent = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
           WebElement startbtn=     fluent.until(new Function<WebDriver, WebElement>() {
                    public WebElement apply(WebDriver driver) {
                        if (driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed()) {
                            return driver.findElement(By.cssSelector("div[id='finish'] h4"));
                        }
                        return null;
                    }
            });
                System.out.println( driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed());

        }
        
    }

