package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertTopic {
public static void main(String[] args) throws InterruptedException {
    String myName="Leela mano";
    WebDriver driver=new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    System.out.print(driver.getTitle());
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys(myName);
    driver.findElement(By.id("alertbtn")).click();
    System.out.println(driver.switchTo().alert().getText().trim());
    Assert.assertEquals(driver.switchTo().alert().getText().trim(),"Hello Leela mano, share this practice page and share your knowledge");
    driver.switchTo().alert().accept();
    driver.findElement(By.id("confirmbtn")).click();
     System.out.println(driver.switchTo().alert().getText().trim());
    driver.switchTo().alert().dismiss();


}
}