package seleniumCodes;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin {
	public static void main(String[] args) throws InterruptedException {

       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com");

        Thread.sleep(Duration.ofSeconds(2));

        WebElement loginBtn = driver.findElement(By.id("login2"));
        loginBtn.click();

        Thread.sleep(Duration.ofSeconds(2));
        WebElement username = driver.findElement(By.id("loginusername"));
        username.sendKeys("testmorning");   
        WebElement password = driver.findElement(By.id("loginpassword"));
        password.sendKeys("elbis123");   

        WebElement submitBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
        submitBtn.click();
        Thread.sleep(Duration.ofSeconds(3));
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.println("Alert says: " + alertMessage);

        alert.accept();

        driver.quit();
    }
}



