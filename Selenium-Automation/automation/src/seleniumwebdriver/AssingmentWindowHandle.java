package seleniumwebdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentWindowHandle {
    public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//a[normalize-space()='Multiple Windows']")).click();
    driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
  String parentWindow=  driver.getWindowHandle();
   Set<String> allWindows= driver.getWindowHandles();
   Iterator<String> it=allWindows.iterator();
   while(it.hasNext()){
   String Pwindow= it.next();
   String Cwindow= it.next();
   driver.switchTo().window(Cwindow);
        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
           driver.switchTo().window(Pwindow);
    System.out.println(driver.findElement(By.xpath("//h3[normalize-space()='Opening a new window']")).getText());

   }
   
   /*for(String childWindow:allWindows){
    if(!childWindow.equalsIgnoreCase(parentWindow)){
        driver.switchTo().window(childWindow);
        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
    }
    driver.switchTo().window(parentWindow);
     System.out.println(driver.findElement(By.xpath("//h3[normalize-space()='Opening a new window']")).getText());
    }*/
   }
    }


