package seleniumwebdriver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestingDropdown {
    public static void main(String[] args) throws InterruptedException {
         WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
           Thread.sleep(3000);
    List<WebElement> suggestions = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
    Thread.sleep(3000);
    //for(WebElement chooseOne:suggestions){
    //traverse through all the elements in the list and click on the one which has text as India using iterator
    Iterator<WebElement> it = suggestions.iterator();
    while(it.hasNext()){
      WebElement country = it.next();
        if(country.getText().equalsIgnoreCase("India")){
            country.click();
            break;
        }
    }

    Thread.sleep(3000);

         /*       driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Au");
Thread.sleep(3000);
List<WebElement> Countries = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
    Thread.sleep(6000);

for(WebElement country1:Countries){
        if(country1.getText().equalsIgnoreCase("Australia")){
            country1.click();
            break;
        }

    }
    */
    
}
    

}

