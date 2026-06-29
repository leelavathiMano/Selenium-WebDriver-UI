package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamic_Dropdowns {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(options);
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
       Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div")).click();
        Thread.sleep(3000);
       // driver.findElement(By.xpath("//div[contains(text(),'Bengaluru')]")).click();
        //another way of writing xpath for the same element for dynamic dropdowns
       driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs'] //div[contains(text(),'Bengaluru')]")).click();
                Thread.sleep(3000);
                //
            driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs'] //div[contains(text(),'Chennai In')]")).click();
               // driver.findElement(By.xpath("//div[contains(text(),'Ahmedabad')]")).click();

       // System.out.println("Total close buttons: " + driver.findElements(By.xpath("//*[@id='closeButton']/span")).size());
       // List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
       // System.out.println("Total iframes: " + iframes.size());

        Thread.sleep(6000);
 //       WebElement closeBtn = driver.findElement(By.xpath("//*[@id='closeButton']/span"));

//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("arguments[0].click();", closeBtn);

                      //  driver.findElement(By.xpath("//*[@id='closeButton']")).click();
                     //   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
                        
       //  WebElement ClosePopup=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='closeButton']/span"))));
//ClosePopup.click();
      //  driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")).click();
               // Thread.sleep(3000);

       // driver.findElement(By.xpath("//input[@placeholder='Enter airport code/city']")).click();
      //  driver.findElement(By.xpath("(//div[contains(text(),'Kempegowda International Airport')])")).click();
       // Thread.sleep(2000);
              //  driver.findElement(By.xpath("//input[@placeholder='Enter airport code/city']")).click();
       // driver.findElement(By.xpath("//input[@placeholder='Enter airport code/city']")).click();
driver.findElement(By.xpath("//div[contains(text(),'Return Date')]")).click();
        //driver.findElement(By.xpath("(//div[contains(text(),'IXB - Bagdogra, India')])[2]")).click();
        Thread.sleep(6000);
       WebElement adultcheckBoxElement =wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[contains(text(),'Senior Citizen')])[2]"))));
       adultcheckBoxElement.click();
    }

}
