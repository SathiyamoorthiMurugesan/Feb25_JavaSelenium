package e5SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A1LaunchingBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		Why we did not create object as 
//		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver1 = new FirefoxDriver();
		
//		driver = new FirefoxDriver();
		
		A1LaunchingBrowser obj = new A1LaunchingBrowser();
		obj.launchBrowser("Chrome");
	}
	
	
	public void launchBrowser(String browserName) {
		
		WebDriver driver;
		
		switch(browserName) {
		
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\firefox.exe");
			driver = new FirefoxDriver();
			break;
			
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\chromedriver_136.exe");
			driver = new ChromeDriver();
			break;
			
		case "Edge":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\edge.exe");
			driver = new EdgeDriver();
			break;
		}
	}

}
