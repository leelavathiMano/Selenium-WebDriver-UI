package seleniumwebdriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_waitcode {
      public static void main(String[] args) {
         ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-features=PasswordManager,PasswordLeakDetection");
        // hide automation switch to reduce some browser UI prompts
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
        HashMap<String,Object> prefrences=new HashMap<String,Object>();
        prefrences.put("credentials_enable_service", false);
        prefrences.put("profile.password_manager_enabled", false);
        prefrences.put("password_manager_enabled", false);
        // block Notification popups (0=allow,1=block,2=ask) — set to 2 to block
        prefrences.put("profile.default_content_setting_values.notifications", 2);
        options.setExperimentalOption("prefs", prefrences);
        WebDriver driver = new ChromeDriver(options);
        String[] models={"iphone X","Samsung Note 8","Blackberry","Nokia Edge"};
        int j=0;

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        // small fallback: some browser-level UI (like Chrome password/breach prompts)
        // cannot be clicked by Selenium — press ESC to dismiss if present
       
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");
        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        WebElement okaybtn= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        okaybtn.click();
         /// alertWait.until(ExpectedConditions.alertIsPresent());
        //  driver.switchTo().alert().accept();
    
      WebElement user=  driver.findElement(By.cssSelector("select.form-control"));
        Select consultant= new Select(user);
        consultant.selectByVisibleText("Consultant");
        driver.findElement(By.cssSelector("input#terms")).click();
        driver.findElement(By.cssSelector("input#signInBtn")).click();

            System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1[class='my-4']"))).getText());
               try {
          Thread.sleep(3000);
          Robot robot = new Robot();
          robot.keyPress(KeyEvent.VK_ESCAPE);
          robot.keyRelease(KeyEvent.VK_ESCAPE);
        } catch (Exception e) {
          // ignore — fallback only
        }
   List<WebElement> mobileList=driver.findElements(By.xpath("//h4[@class='card-title']"));

   List<String> Mobiles= Arrays.asList(models);
   for(int i=0;i<mobileList.size();i++){
    String mobs=mobileList.get(i).getText();
    if(Mobiles.contains(mobs)){
      driver.findElements(By.cssSelector("button.btn.btn-info")).get(i).click();
      j++;
      if(j==models.length){
        break;
      }
   }

    }
    driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

 System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn.btn-success"))).getText());
  }
}
