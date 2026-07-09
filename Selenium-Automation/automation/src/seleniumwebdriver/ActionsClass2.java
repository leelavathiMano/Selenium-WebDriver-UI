package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClass2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable");
        driver.manage().window().maximize();
        WebElement blogpage = driver.findElement(By.xpath(" //a[normalize-space()='Blog']"));
        WebElement supportPage = driver.findElement(By.xpath("(//a[normalize-space()='Support'])[2]"));
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).click(blogpage).keyUp(Keys.CONTROL).perform();
        // act.contextClick().perform();
        act.doubleClick(supportPage).perform();
        act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Contribute']"))).build().perform();

        // driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[2]/a")).click();
        act.click(driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[2]/a"))).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
        // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
        WebElement source = driver.findElement(By.id("draggable"));
        wait.until(ExpectedConditions.visibilityOf(source));
        WebElement destination = driver.findElement(By.id("droppable"));
        act.dragAndDrop(source, destination).build().perform();
        // to get out from the frame page we need to use defaultContent() method
        driver.switchTo().defaultContent();
        WebElement draggableLink = wait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Draggable']")));
        draggableLink.click();
        act.moveToElement(draggableLink).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        // driver.quit();

    }
}