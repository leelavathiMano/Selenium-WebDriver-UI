package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seliniumIntro {
     public static void main(String args[]){
        // invoking browser
//System.setProperty("webdriver.chrome.driver","/Users/lemanoharan/Documents/Reports/Chromedriver/chromedriver-mac-arm64/chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        //Headless Execution: Run tests without a graphical user interface (GUI).
        options.addArguments("--headless=new");
        //Window Management: Start the browser maximized or with a specific resolution.
        options.addArguments("start-maximized");
        options.addArguments("window-size=1200,800");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.greyhound.com");
      System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();

    }

}
