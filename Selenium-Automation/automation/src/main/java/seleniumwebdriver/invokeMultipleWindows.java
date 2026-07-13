package seleniumwebdriver;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokeMultipleWindows {
    public static void main(String[] args) throws InterruptedException, IOException {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        String ParentWindow = driver.getWindowHandle(); // Capture parent BEFORE opening new tab
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> windowHandles = driver.getWindowHandles();
        String childwindow = "";
        for (String handle : windowHandles) {
            if (!handle.equals(ParentWindow)) {
                childwindow = handle; // Child is whichever handle is NOT the parent
            }
        }
        Thread.sleep(3000);
        driver.switchTo().window(childwindow);
        Thread.sleep(3000);
        driver.get("https://rahulshettyacademy.com/course-library/");
        WebElement courseName = driver.findElement(
                By.xpath("//h3[contains(text(),'Playwright JS/TS Automation Testing from Scratch & Framework')]"));
        String courseNameText = courseName.getText();
        System.out.println(courseNameText);
        driver.switchTo().window(ParentWindow);
        WebElement name = driver.findElement(By.cssSelector("input[name='name']"));
        name.sendKeys(courseNameText);

        // Capture screenshot
        File screenshot1 = name.getScreenshotAs(OutputType.FILE);
        // String filePath = System.getProperty("user.dir") + File.separator +
        // "logo.png";
        // System.out.println("Screenshot saved to: " + filePath);
        FileUtils.copyFile(screenshot1, new File(
                "C:\\Users\\leela\\OneDrive\\Automation Docs\\WebAutomation_LearningProject\\Selenium-Automation\\automation\\logo1.png"));
        System.out.println("Screenshot capture completed successfully!");
        int height = name.getRect().getDimension().getHeight();
        int width = name.getRect().getDimension().getWidth();
        System.out.println("Height: " + height + ", Width: " + width);

    }
}
