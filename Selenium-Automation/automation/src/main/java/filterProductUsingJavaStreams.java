import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filterProductUsingJavaStreams {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> productslist = driver.findElements(By.xpath("//tbody/tr/td[1]"));
        // search-field
        driver.findElement(By.id("search-field")).sendKeys("p");
        List<WebElement> FilteredVegList = productslist.stream().filter(s -> s.getText().contains("p"))
                .collect(Collectors.toList());
        Assert.assertEquals(FilteredVegList.size(), productslist.size());

    }

}
