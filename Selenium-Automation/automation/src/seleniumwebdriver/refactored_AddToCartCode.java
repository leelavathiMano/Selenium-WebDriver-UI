import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class refactored_AddToCartCode {

 public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));

    String[] multi={"Apple","Tomato","Cucumber","Raspberry"};
    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    System.out.print(driver.getTitle());
    driver.manage().window().maximize();
    Thread.sleep(3000);
    addProduct(driver, multi, wait);
}
public static void addProduct(WebDriver driver, String[] multi, WebDriverWait wait) {
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     int j = 0;
     List<WebElement> products=  driver.findElements(By.cssSelector("h4.product-name"));
 // System.out.println(products);

for(int i=0;i<products.size();i++){
  String[] vegAndFruits=  products.get(i).getText().split("-");  //conver array to arraylist
  String formattedWord= vegAndFruits[0].trim();
  List<String> vegF=Arrays.asList(multi);
    if(vegF.contains(formattedWord)){
      j++;
        driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
        if(j==multi.length){
          break;
        }
    }

}
driver.findElement(By.cssSelector("a.cart-icon")).click();
driver.findElement(By.cssSelector("div[class='cart-preview active'] button[type='button']")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
driver.findElement(By.cssSelector("button.promoBtn")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
    System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

}
}
 