import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebElementListGreenKartPagination {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> products = driver.findElements(By.xpath("//tbody/tr/td[1]"));
        System.out.println(products.size());
        // System.out.println(products);
        List<String> originalList = products.stream().map(s -> s.getText()).collect(Collectors.toList());
        originalList.forEach(s -> System.out.println(s));
        System.out.println("=================================================");
        List<String> sortedList = products.stream().map(s -> s.getText()).sorted().collect(Collectors.toList());
        sortedList.forEach(s -> System.out.println(s));
        System.out.println("=================================================");
        Assert.assertEquals(originalList, sortedList);
        // driver.findElement(By.id("page-menu")).click();
        // Select select = new Select(driver.findElement(By.id("page-menu")));
        // select.selectByVisibleText("20");
        List<String> price;
        do {
            List<WebElement> productslist = driver.findElements(By.xpath("//tbody/tr/td[1]"));
            price = productslist.stream().filter(s -> s.getText().contains("Rice"))
                    .map(s -> getPriceVeggies(s)).collect(Collectors.toList());
            price.forEach(s -> System.out.println(s));
            if (price.size() < 1) {
                driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
            }
        } while (price.size() < 1);

        //// productslist.forEach(s -> System.out.println(s.getText()));
        System.out.println("=================================================");
        // List<String> price = productslist.stream().filter(s ->
        // s.getText().contains("Beans"))
        // .map(s -> getPriceVeggies(s)).collect(Collectors.toList());
        price.forEach(s -> System.out.println(s));

    }

    public static String getPriceVeggies(WebElement s) {

        String pricevalue = s.findElement(By.xpath("//tr/td[1]/following-sibling::td[1]")).getText();
        return pricevalue;
    }

}
