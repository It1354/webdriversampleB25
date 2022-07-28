package testScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class ShadowDOMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:/Program Files/Google/Chrome Beta/Application/chrome.exe");
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowhost=driver.findElement(By.cssSelector("#shadow_host"));
		SearchContext shadowroot=shadowhost.getShadowRoot();
		String strProperty = shadowroot.findElement(By.id("shadow_content")).getDomProperty("namespaceURI");
		String strAttribute = shadowroot.findElement(By.id("shadow_content")).getDomAttribute("class");
		System.out.println("Dom Property:" +  strProperty);
		System.out.println("Dom Attribute:" +  strAttribute);

	}

}
