package e5WebDriverMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5FindElements {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		List<WebElement> link_SocialMedia = driver.findElement(By.id("social")).findElement(By.tagName("li")).findElements(By.tagName("a"));
		System.out.println(link_SocialMedia.size());
		
		for(WebElement eachElement: link_SocialMedia) {
			String socialMediaName = eachElement.getAttribute("class");
			System.out.println(socialMediaName);
		}
	}
}
