package e5WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1ShadowRootElement {
	
//	Webpage to refer for CSS: https://www.geeksforgeeks.org/selenium-css-selectors/
	
//	Shadow root elements
//
//	* If an element is present inside the shadow root, we can not locate it in DOM using xpath or CSS.
//		It always shows 0 of 0.
//	* To access an element which is present inside the shadow dom or show root. You need to find thet host of the shadow root
//		* Then use the method getShadowRoot();
//	* Keep in mind that, xpath wond work inside the shadow root. 
//		* You need to use the CSS Selector
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://watir.com/examples/shadow_dom.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		SearchContext shadowHost1 = driver.findElement(By.id("shadow_host")).getShadowRoot();
		
//		shadowHost1.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		
		shadowHost1.findElement(By.cssSelector("input[type = 'text']")).sendKeys("Hello");
		
//		trying to access an element inside the nested shadow root
		
		SearchContext nestedShadowHost = shadowHost1.findElement(By.cssSelector("#nested_shadow_host")).getShadowRoot();
		
		String nestedText = nestedShadowHost.findElement(By.cssSelector("div[id='nested_shadow_content']>div")).getText();
		
		System.out.println(nestedText);
		
		
		
		
		
	}

}
