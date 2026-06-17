package seleniumCodes;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDay {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com");
        Thread.sleep(Duration.ofSeconds(60));
        driver.quit();
    }
}
