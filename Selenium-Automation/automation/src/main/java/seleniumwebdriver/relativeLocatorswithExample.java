package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class relativeLocatorswithExample {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement PageMenu = driver.findElement(By.xpath("//input[@name='name']"));
        driver.findElement(with(By.tagName("label")).above(PageMenu));
        // above(),below(),toLeftOf(),toRightOf(),near() are the methods
        // of relative locators
        WebElement DOB = driver.findElement(By.xpath("//[@for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(DOB)).click();
        WebElement checkbox = driver.findElement(By.className("form-check-label"));
        driver.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
        WebElement databind = driver.findElement(By.xpath("//h4[contains(text(),'Two-way Data Binding example:')]"));
        driver.findElement(with(By.tagName("input")).toRightOf(databind)).sendKeys("Hello");
    }
}
