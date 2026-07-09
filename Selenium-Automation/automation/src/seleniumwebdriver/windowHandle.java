package seleniumwebdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/loginpagePractise/");
driver.findElement(By.xpath("//a[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Mate')]")).click();
//driver.getWindowHandle() – It returns a handle of the current page (a unique identifier). It is used to get the address of the current browser where the control is and return type is String. Syntax is:

//String handle = driver.getWindowHandle()
//driver.getWindowHandles() – It returns a set of handles of the all the pages available. 
// It is used to get the address of all the open browser and its return type is Iterator<String>. Syntax is:

//<Set> handles=driver.getWindowHandles();
Set<String> windows=driver.getWindowHandles();
Iterator<String> it=windows.iterator();
  while(it.hasNext()){
String parentWindow=it.next();
String childWindow=it.next();
driver.switchTo().window(childWindow);
  
Thread.sleep(2000);
System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
String emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
System.out.println(emailId);
driver.switchTo().window(parentWindow);

driver.findElement(By.id("username")).sendKeys(emailId);
}
}

}
