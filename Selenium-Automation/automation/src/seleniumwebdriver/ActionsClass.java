package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
       WebElement accountLink = driver.findElement(By.cssSelector("div[id='nav-link-accountList'] a"));
        Actions action = new Actions(driver);
      //  action.moveToElement(accountLink).build().perform();
      //build() method is used to compile all the actions into a single action and perform() method is used to execute the action.
        WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
        // send the mobile text in caps using keyboard button "SHIFT"
action.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();
//to select the text in the search box we can use double click action
action.moveToElement(accountLink).contextClick().build().perform();
}
}
