package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Siblings {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
                //Sibling- parent-child relationship - Parent traversel

        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
                //Sibling- Child to Parent traversal
                //  [//header/div/button[1]/parent::div/parent::header/a]
        System.out.println(driver.findElement(By.xpath(" //header/div/button[1]/parent::div/button[2]")).getText());


    }           

}
