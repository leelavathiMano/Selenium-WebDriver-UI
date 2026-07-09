package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calendertestAssignment {
    public static void main(String[] args) {
        System.out.println("Calendar Assignment");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        String month = "8";
        String date = "16";
        String year = "2029";
        String[] expectedDate = { month, date, year };
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".react-date-picker.react-date-picker--closed.react-date-picker--enabled"))
                .click();
        driver.findElement(By.className("react-calendar__navigation__label")).click();
        driver.findElement(By.className("react-calendar__navigation__label")).click();
        driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
        System.out.println(driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).size());
        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
                .get(Integer.parseInt(month) - 1)
                .click();
        driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();
        // assertion
        List<WebElement> dateElements = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        for (int i = 0; i < dateElements.size(); i++) {
            System.out.println(dateElements.get(i).getAttribute("value"));
            Assert.assertEquals(dateElements.get(i).getAttribute("value"), String.join("/", expectedDate[i]));

        }
    }

}
