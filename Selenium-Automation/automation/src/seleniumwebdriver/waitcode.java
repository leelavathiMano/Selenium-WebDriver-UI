package seleniumwebdriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitcode {
      public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String[] models={"iphone X","Samsung Note 8","Blackberry","Nokia Edge"};
        int j=0;
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        System.out.print(driver.getTitle());
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='checkmark'])[2]")));
       driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.switchTo().alert().accept();
      WebElement user=  driver.findElement(By.cssSelector("select.form-control"));
        Select consultant= new Select(user);
        consultant.selectByContainsVisibleText("Consultant");
        driver.findElement(By.cssSelector("input#terms")).click();
        driver.findElement(By.cssSelector("input#signInBtn")).click();
   System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1[class='my-4']"))).getText());
   List<WebElement> mobileList=driver.findElements(By.xpath("//h4[@class='card-title']"));

   List<String> Mobiles= Arrays.asList(models);
   for(int i=0;i<mobileList.size();i++){
    String mobs=mobileList.get(i).getText();
    if(Mobiles.contains(mobs)){
      driver.findElements(By.cssSelector("button.btn btn-info")).get(i).click();
      if(j==models.length){
        break;
      }
   }

    }
 System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn btn-success"))).getText())
 ;
  }
}
