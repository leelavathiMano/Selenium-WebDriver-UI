package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iframeExampleAssingment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Frames")).click();
        driver.findElement(By.linkText("Nested Frames")).click();
        System.out.println(driver.findElements(By.tagName("frame")).size());
        // WebElement frameTop = driver.findElement(By.name("frame-top"));
        // driver.switchTo().frame(frameTop);
        // System.out.println(frameTop.getText());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("frame-top")));
        WebElement framemiddle = driver.findElement(By.name("frame-middle"));
        driver.switchTo().frame(framemiddle);
        System.out.println(driver.findElement(By.id("content")).getText());

    }
}