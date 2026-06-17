package seleniumCodes;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com");
        
        Thread.sleep(Duration.ofSeconds(3));
        
        WebElement signUpBtn = driver.findElement(By.id("signin2"));
        signUpBtn.click();

        Thread.sleep(Duration.ofSeconds(2));
        
        WebElement username = driver.findElement(By.id("sign-username"));
        username.sendKeys("ashmitest123"); 
        WebElement password = driver.findElement(By.id("sign-password"));
        password.sendKeys("ashmi123");
        WebElement registerBtn = driver.findElement(By.xpath("//button[text()='Sign up']"));
        registerBtn.click();
        
        Thread.sleep(Duration.ofSeconds(3));

        Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        System.out.println("Alert says: " + message);

        alert.accept();

        driver.quit();
    }
}
