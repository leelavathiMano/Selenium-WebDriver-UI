package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {
    public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://play.google.com/store/apps/details/%E1%8B%A8Google_Chrome?id=com.android.chrome&hl=en_SG"); // Get method will wait untill all the components of the webpage fully loaded and then it will perform the next action(Synchronization wait)
driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/"); // navigate method will not wait for the webpage to load and it will perform the next action immediately
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();

    }

}
