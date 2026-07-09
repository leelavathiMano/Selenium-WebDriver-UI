package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class trickyAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("checkBoxOption2")).click();
        String checkboxText = driver.findElement(By.xpath("//label[normalize-space()='Option2']")).getText();
        System.out.println(checkboxText);
        driver.findElement(By.id("dropdown-class-example")).click();
        WebElement dropdownElement = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Option2");
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys(checkboxText);
        driver.findElement(By.xpath("//input[@value='Alert']")).click();
        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
        if (alertText.contains(checkboxText)) {
            System.out.println("Alert text contains checkbox text");
        } else {
            System.out.println("Alert text does not contain checkbox text");
        }
        Thread.sleep(4000);
        driver.switchTo().alert().accept();

    }
}
