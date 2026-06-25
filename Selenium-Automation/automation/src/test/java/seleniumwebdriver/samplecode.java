package seleniumwebdriver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class samplecode {
    public static void main(String args[]) throws InterruptedException{
System.out.println("Hello World");
//WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();//Webdriver is interface which has several methods without implementation 
// it is class responsible for launching the browser like implemets all the methods if they are using 
//System.setProperty("webdriver.edge.driver", "C:/Users/leela/OneDrive/Automation Docs/edgedriver_win64/msedgedriver.exe");
//WebDriver driver = new EdgeDriver();//Webdriver is interface which has several methods without implementation

//driver.get("https://rahulshettyacademy.com/");
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
//iver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("inputUsername")).sendKeys("leela");
driver.findElement(By.name("inputPassword")).sendKeys("password");
driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
String errorMessage = driver.findElement(By.xpath("//*[text()='* Incorrect username or password']")).getText();
assert(errorMessage.equals("* Incorrect username or password"));
driver.findElement(By.linkText("Forgot your password?")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Leelavathi Manoharan");
driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("leelachills123@gmail.com");
driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7619610259");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
Thread.sleep(2000);
System.out.println(driver.findElement(By.cssSelector("form p")).getText());
String infoMessage = driver.findElement(By.cssSelector("form p")).getText();
assert(infoMessage.equals("Please use temporary password 'rahulshettyacademy' to Login."));
//Css selector syntax: tagname[attribute='value']
//css selector syntax: tagname.classname
//css selector syntax: tagname#id
driver.findElement(By.xpath("//div/button[1][@class='go-to-login-btn']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("leelachills123@gmail.com");
driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
driver.findElement(By.cssSelector("input#chkboxOne")).click();
driver.findElement(By.xpath("//span/input[@id='chkboxTwo']")).click();
driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


//driver.close();// it will close the current browser which is opened by selenium webdriver
//driver.quit();// it will close all the browsers which are opened by selenium webdriver



    }
    
}
