package seleniumwebdriver;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonAddMultipleProducttask {
    public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
          int j=0;
    String[] multi={"Apple","Tomato","Cucumber","Raspberry"};
    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    System.out.print(driver.getTitle());
    driver.manage().window().maximize();
    Thread.sleep(3000);
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

}
}