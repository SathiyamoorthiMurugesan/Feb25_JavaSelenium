package e5WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class A7WindowHandling {

	WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		WebDriver driver = new ChromeDriver(); // session id and window handle will be created.

		SessionId sessionId = ((RemoteWebDriver) driver).getSessionId();
		System.out.println("Driver session ID: " + sessionId);

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		driver.findElement(By.id("newWindowBtn")).click();
		
//		I want to close the first window and move the focus to the second window 
		
		String parentWindowHandleID = driver.getWindowHandle();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
//		for(String eachWindowHandle: allWindowHandles) { 
////			scenario 1) parent and child - works
////			scenario 2) child and parent
//			if(!eachWindowHandle.equals(parentWindowHandleID)) {
//				driver.switchTo().window(eachWindowHandle);
//			}
//			if(eachWindowHandle.equals(parentWindowHandleID)) {
//				driver.close();
//			}
//		}
		
		for(String eachWindowHandle: allWindowHandles) { 
			if(eachWindowHandle.equals(parentWindowHandleID)) {
				driver.close();
				break;
			}
		}
		

	}

}
