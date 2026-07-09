package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Frames");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        WebElement frame1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame1);
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        WebElement nestedFrame = driver.findElement(By.xpath("//span[contains(text(),'Nested Frames')]"));
        nestedFrame.click();
        WebElement Parentframe = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(Parentframe);
        System.out.println(driver.findElement(By.xpath("//body[contains(text(),'Parent frame')]")).getText());
        Thread.sleep(3000);
        WebElement Childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(Childframe);
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Child Iframe')]")).getText());

    }
}
