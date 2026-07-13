package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autoSuggeDropdownAssignment {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Auto Suggestion Dropdown Assignment");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("autocomplete")).sendKeys("uni");
        Actions act = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-1")));
        act.moveToElement(driver.findElement(By.id("autocomplete")))
                .sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN).click()
                .build()
                .perform();
        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
        /*
         * List<WebElement> suggestions =
         * driver.findElements(By.className("ui-menu-item"));
         * for (WebElement country : suggestions) {
         * String requireCountry = country.getText();
         * System.out.println(requireCountry);
         * if (requireCountry.equalsIgnoreCase("United States (USA)")) {
         * country.click();
         * break;
         * }
         */
    }

}
