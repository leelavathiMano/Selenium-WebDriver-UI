package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectClassComplete {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait
         wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demo.mobiscroll.com/select/multiple-select");
        driver.manage().window().maximize();
        
      List<WebElement> multi = driver.findElements(By.cssSelector("input#multiple-select-input"));
      for(WebElement element : multi) {
          element.click();
      }
    }

}
