package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HandlingCheckboxAndItsSize_Assert {

    //TestNG is a testing framework in selenium
    // Assert is a class to validate the output based on expected conditions
    //Assert.assertTrue and false will be validated based on the boolean conditions eg: isSelected(), isDisplayed(), isEnabled()
    //Assert.assertEquals it will compare the actual and expected result
          public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(options);
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
                            Thread.sleep(3000);
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
       Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div")).click();
        Thread.sleep(3000);
         driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs'] //div[contains(text(),'Bengaluru')]")).click();
                //
            driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs'] //div[contains(text(),'Chennai In')]")).click();
                      Thread.sleep(6000);
                      driver.findElement(By.xpath("//div[text()='Add-ons']")).click();
    //driver.findElement(By.xpath("//div[contains(text(),'Return Date')]")).click();

        //driver.findElement(By.xpath("(//div[contains(text(),'IXB - Bagdogra, India')])[2]")).click();

       WebElement adultcheckBoxElement =wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[contains(text(),'Senior Citizen')])[2]"))));
       adultcheckBoxElement.click();
       Thread.sleep(3000);
      Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(text(),'Senior Citizen')])[2]")).isDisplayed());
      Assert.assertFalse(driver.findElement(By.xpath("(//div[contains(text(),'Senior Citizen')])[2]")).isSelected());
       System.out.println(driver.findElement(By.xpath("(//div[contains(text(),'Senior Citizen')])[2]")).getText());
       System.out.println(driver.findElements(By.cssSelector("circle")).size());
      System.out.println(driver.findElements(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj'])[2]")).size());
       List<WebElement>checkboxes=driver.findElements(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj'])[2]//div"));
       for(WebElement checkbox:checkboxes){
              if (checkbox.getText().equalsIgnoreCase("Govt. Employee")) {
                  checkbox.click();
                  break;
              }
       }
    }

}
