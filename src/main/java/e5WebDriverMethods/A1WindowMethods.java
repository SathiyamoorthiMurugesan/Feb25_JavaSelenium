package e5WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1WindowMethods {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
//		Maximize the window
//		Options option = driver.manage();
//		Window window = option.window();
//		window.maximize();
		
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		
		Thread.sleep(3000);
		
		 Dimension dim = new Dimension(500, 500);
		driver.manage().window().setSize(dim);
		
		Thread.sleep(3000);
		
		driver.manage().window().fullscreen();
		
	}
	
	public void launchApplication(String url) {
		driver.get(url);
	}

	public void maximizeTheWindow() {
		driver.manage().window().maximize();
	}
	
	public void minimizeTheWindow() {
		driver.manage().window().minimize();
	}
	
	public void makeWindowFullScreen() {
		driver.manage().window().fullscreen();
	}
	
	public Dimension getWindowSize() {
		return driver.manage().window().getSize();
	}
}
