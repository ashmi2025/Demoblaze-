package seleniumCodes;

import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLauncher {

    public static void main(String[] args) throws InterruptedException {
    	
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter 1 for Edge, 2 for Chrome, 3 for Firefox:");
	     int choice = sc.nextInt();
    
	     WebDriver driver = null;
	     
	     switch(choice) {
	     case 1: 
	    	 driver = new ChromeDriver();
	    	 break;
	     case 2:
	    	 driver = new FirefoxDriver();
	    	 break;
	     case 3:
	         driver = new EdgeDriver();
	         break;
	         default:
	        	 System.out.println("Invalid choice.Existing.");
	        	 sc.close();
	        	 return;
	        	  
	     }
	     driver.manage().window().maximize();
	   driver.get("https://demoblaze.com");
	   Thread.sleep(Duration.ofSeconds(5));
	   driver.quit();
	   sc.close();
	   
		}

	}

