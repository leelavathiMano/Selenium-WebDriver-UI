package seleniumwebdriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenLinksAutomation {
    public static void main(String[] args) throws MalformedURLException, URISyntaxException, IOException {
        System.out.println("Broken Links Automation");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        SoftAssert softassert = new SoftAssert();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //// JavascriptExecutor js = (JavascriptExecutor) driver;
        // broken links are links which are not working or not opening the page when we
        // click on it. So we can check the broken links by getting the href attribute
        // of the link and then sending a request to that URL and checking the response
        // code. If the response code is 200 then the link is working fine, if it is 404
        // then the link is broken.
        // Step 1:broken link
        // Java methods to get the URL of the link and then send a request to that URL
        // and get the response code.
        // if status code is >400 then the link is broken.
        //// js.executeScript("window.scrollBy(0,900)");
        // WebElement footer = driver.findElement(By.id("gf-BIG"));
        // List<WebElement> links = footer.findElements(By.tagName("a"));
        List<WebElement> allLinks = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
        for (WebElement link : allLinks) {
            String url = link.getAttribute("href");
            HttpURLConnection conn = (HttpURLConnection) new URI(url).toURL().openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int responseCode = conn.getResponseCode();
            System.out.println(responseCode);

            softassert.assertTrue(responseCode < 400,
                    "The link with URL " + link.getText() + " is a broken link with code " + responseCode);
            /*
             * if (responseCode > 400) {
             * System.out.println(responseCode);
             * Assert.assertTrue(false);
             * System.out.println("The link with URL " + url + " is a broken link");
             * } else {
             * System.out.println("The link with URL " + url + " is a valid link");
             * }
             */
        }
        softassert.assertAll();
        String url1 = driver.findElement(By.xpath("//a[normalize-space()='Broken Link']")).getAttribute("href");
        HttpURLConnection conn1 = (HttpURLConnection) new URI(url1).toURL().openConnection();
        conn1.setRequestMethod("HEAD");
        conn1.connect();
        int responseCode1 = conn1.getResponseCode();
        if (responseCode1 > 400) {
            System.out.println(responseCode1);
            Assert.assertTrue(false); // Hard Assertions means it will stop the execution
            // when the assertion fails. If we want to continue the execution even
            // if the assertion fails
            // then we can use Soft Assertions.
            System.out.println("The link with URL " + url1 + " is a broken link");
        } else {
            System.out.println("The link with URL " + url1 + " is a valid link");
        }

    }

}
