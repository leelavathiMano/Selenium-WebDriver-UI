package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2Practice {
public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/angularpractice/");
    System.out.print(driver.getTitle());
    driver.findElement(By.name("name")).sendKeys("leelavathi");
    driver.findElement(By.name("email")).sendKeys("leelachills123@gmail.com");
    driver.findElement(By.id("exampleInputPassword1")).sendKeys("Leela@123");
    driver.findElement(By.id("exampleCheck1")).click();
    WebElement gender=driver.findElement(By.id("exampleFormControlSelect1"));

    Select gender1=new Select(gender);
    gender1.selectByVisibleText("Female");
    driver.findElement(By.id("inlineRadio2")).click();
    driver.findElement(By.name("bday")).sendKeys("10-05-1995");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@value='Submit']")).click();
    String successMessage = driver.findElement(By.xpath("(//div[@class='container']/div)[3]")).getText();
    String normalizedSuccessMessage = successMessage
        .replaceAll("\\p{Cntrl}", "")
        .replaceAll("\\s+", " ")
        .trim();
    System.out.println("Success message: [" + normalizedSuccessMessage + "]");
    String expectedmessageString = "?Success! The Form has been submitted successfully!.";
    Assert.assertEquals(normalizedSuccessMessage, expectedmessageString);
    
}
}
