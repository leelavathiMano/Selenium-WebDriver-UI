package seleniumwebdriver;

import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CalenderHandleAndRadioButton {
   public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs'] //div[contains(text(),'Bengaluru')]")).click();
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs'] //div[contains(text(),'Chennai In')]")).click();
        //get today from calander
        LocalDate today= LocalDate.now();
        String currentdate= String.valueOf(today.getDayOfMonth());
        System.out.println(currentdate);
        driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[4]/div[7]")).click();
        System.out.println(driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).getAttribute("class"));
        driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).click();
         System.out.println(driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).isEnabled());
       System.out.println(driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).getAttribute("class"));

if(driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).getAttribute("class").contains("r-14lw9ot")){
System.out.print("It is enabled");
Assert.assertTrue(true);
}
else{
        System.out.print("It is disabled");
Assert.assertTrue(false);
}
driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).click();
driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
 WebElement AdultElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'1 Adult')])[1]")));
        String passinfo = AdultElement.getText();
        System.out.println(passinfo);
        AdultElement.click();

//driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(2000);
for(int i=1;i<=4;i++){
    driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();// It adds 2 adults
    Thread.sleep(2000);
}
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[contains(text(),'5 Adult')])[1]")).click();
WebElement finalAdultCount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(text(),'5 Adult')])[1]")));
Assert.assertEquals(finalAdultCount.getText(), "5 Adults");
       Thread.sleep(2000);
       // Close the passenger panel before opening currency options
       driver.findElement(By.xpath("//div[contains(text(),'Passengers')]")).click();
       Thread.sleep(1000);
       WebElement currencyDropdown = driver.findElement(By.xpath("(//*[@class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c']/div/div)[2]"));
       currencyDropdown.click();
       Thread.sleep(1000);
       String desiredCurrency = "AED";
       java.util.List<WebElement> currencyOptions = driver.findElements(By.xpath("//div[normalize-space(text())='" + desiredCurrency + "']"));
       if (currencyOptions.isEmpty()) {
           currencyOptions = driver.findElements(By.xpath("//div[contains(normalize-space(text()), '" + desiredCurrency + "')]") );
       }
       if (!currencyOptions.isEmpty()) {
           WebElement currencyOption = currencyOptions.get(0);
           wait.until(ExpectedConditions.elementToBeClickable(currencyOption)).click();
           System.out.println("Selected currency: " + currencyOption.getText());
       } else {
           throw new org.openqa.selenium.NoSuchElementException("Currency option not found: " + desiredCurrency);
       }
       Thread.sleep(2000);
       WebElement adultcheckBoxElement = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[contains(text(),'Senior Citizen')])[2]"))));
       adultcheckBoxElement.click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
       Thread.sleep(2000);
      System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getTitle());
}    
}
