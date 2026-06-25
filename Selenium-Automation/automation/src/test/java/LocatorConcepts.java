import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import static org.testng.Assert.assertEquals;

public class LocatorConcepts {
 public static void main(String args[]) throws InterruptedException{
    //ebDriver driver = new ChromeDriver();
    System.setProperty("webdriver.edge.driver", "C:/Users/leela/OneDrive/Automation Docs/edgedriver_win64/msedgedriver.exe");
WebDriver driver;//Webdriver is interface which has several methods without implementation
     driver = new EdgeDriver();

     String password = getPassword(driver);

    String name="leelachills123@gmail.com";
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.findElement(By.id("inputUsername")).sendKeys(name);
driver.findElement(By.name("inputPassword")).sendKeys(password);
driver.findElement(By.cssSelector("input#chkboxOne")).click();
driver.findElement(By.xpath("//span/input[@id='chkboxTwo']")).click();
driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
Thread.sleep(2000);
System.out.println(driver.findElement(By.tagName("p")).getText());
assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello " + name + ",");
driver.findElement(By.cssSelector("button.logout-btn")).click();
    assertEquals(driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).isDisplayed(), true);
    driver.close();
}
//create method to getpassword and call the method in main method and use the password to login
public static String getPassword(WebDriver driver) throws InterruptedException{
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.linkText("Forgot your password?")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
    String infoMessage = driver.findElement(By.cssSelector("form p")).getText();
    assert(infoMessage.equals("Please use temporary password 'rahulshettyacademy' to Login."));
    //Please use temporary password 'rahulshettyacademy' to Login.
    String[] passwordArray = infoMessage.split("'");
    passwordArray[1].split("'");
    String password = passwordArray[1].split("'")[0];
    System.out.println(password);
    //0th index will have Please use temporary password
    //1st index will have rahulshettyacademy' to Login.

return password;



}
}