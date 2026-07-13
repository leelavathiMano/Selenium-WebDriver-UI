package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesAssignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        WebElement productTable = driver.findElement(By.id("product"));

        // Row count includes header row in this table structure.
        int rowCount = productTable.findElements(By.tagName("tr")).size();
        System.out.println("Row Count: " + rowCount);

        int columnCount = productTable.findElements(By.xpath(".//tr[1]/th")).size();
        System.out.println("Column Count: " + columnCount);

        // Second row in tbody (first data row) text.
        String secondRowText = productTable.findElement(By.xpath(".//tbody/tr[2]")).getText();
        System.out.println("Second Row Text: " + secondRowText);

        driver.quit();

    }
}
