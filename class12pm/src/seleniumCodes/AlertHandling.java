package seleniumCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement simp_alert_nav, button1, confirm_nav, button2, textbox_nav, button3;
		
		simp_alert_nav = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a"));
		simp_alert_nav.click();
		
		button1 = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		button1.click();
		Thread.sleep(Duration.ofSeconds(5));
		driver.switchTo().alert().accept();
		
		confirm_nav = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		confirm_nav.click();
		button2 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		button2.click();
		Thread.sleep(Duration.ofSeconds(5));
		driver.switchTo().alert().dismiss();
		
		textbox_nav = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		textbox_nav.click();
		button3 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		button3.click();
		Thread.sleep(Duration.ofSeconds(5));
		driver.switchTo().alert().sendKeys("asmi");
		driver.switchTo().alert().accept();
		
		driver.quit();
		
		
		
	}
}
		
		
		


