package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class static_Dropdowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        //static dropdown
    WebElement currencyDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
Select dropdown=new Select(currencyDropdown);
dropdown.selectByIndex(3);
System.out.println(dropdown.getFirstSelectedOption().getText());
dropdown.selectByContainsVisibleText("INR");
dropdown.selectByValue("AED");
//Select passDropDown= new Select(passengerDropdown);
//WebElement passengerDropdown=
String passinfo=driver.findElement(By.id("divpaxinfo")).getText();
System.out.println(passinfo);

driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(2000);
for(int i=1;i<=4;i++){
driver.findElement(By.id("hrefIncAdt")).click();// It adds 2 adults
Thread.sleep(2000);
}
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
String passengerInfo=driver.findElement(By.id("divpaxinfo")).getText();
System.out.println(passengerInfo);

//Dynamic drop down - when dropdown details will load based on user actions eg: if we want to 
//select any city , first we need to select the State
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
driver.findElement(By.xpath("//a[contains(text(),'Chennai')]")).click(); 
    }
}
