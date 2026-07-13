package seleniumwebdriver;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheckAutomation {
    public static void main(String[] args) {
        System.out.println("SSL Check Automation");
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("ipaddress:8080");

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.setProxy(proxy);
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://expired.badssl.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

    }

}
