package seleniumCodes;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

    public static void main(String[] args) throws InterruptedException {

        // Step 1: Open Chrome
        WebDriver driver = new ChromeDriver();

        // Step 2: Maximize window
        driver.manage().window().maximize();

        // Step 3: Go to Demoblaze
        driver.get("https://www.demoblaze.com");

        // Step 4: Wait for page to load
        Thread.sleep(Duration.ofSeconds(3));

        // Step 5: Login first (cart requires login)
        WebElement loginBtn = driver.findElement(By.id("login2"));
        loginBtn.click();
        Thread.sleep(Duration.ofSeconds(2));

        // Step 6: Enter username
        WebElement username = driver.findElement(By.id("loginusername"));
        username.sendKeys("ashmitest123"); // your registered username

        // Step 7: Enter password
        WebElement password = driver.findElement(By.id("loginpassword"));
        password.sendKeys("ashmi123"); // your password

        // Step 8: Click login button
        WebElement submitBtn = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
        submitBtn.click();
        Thread.sleep(Duration.ofSeconds(3));

        // Step 9: Click on first product
        WebElement product = driver.findElement(By.xpath("//div[@class='card-block']//a"));
        product.click();
        Thread.sleep(Duration.ofSeconds(2));

        // Step 10: Click Add to Cart button
        WebElement addToCart = driver.findElement(By.xpath("//a[text()='Add to cart']"));
        addToCart.click();
        Thread.sleep(Duration.ofSeconds(2));

        // Step 11: Handle alert - "Product added"
        Alert alert = driver.switchTo().alert();
        String alertMsg = alert.getText();
        System.out.println("Alert says: " + alertMsg);
        alert.accept();

        // Step 12: Close browser
        driver.quit();
        System.out.println("Add to cart test completed!");
    }
}