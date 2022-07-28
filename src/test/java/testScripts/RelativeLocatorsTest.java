package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:/Program Files/Google/Chrome Beta/Application/chrome.exe");
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		String strName= driver.findElement(with(By.tagName("li"))
				   .toLeftOf(By.id("pid6"))
		           .below(By.id("pid1")))
				   .getText();
		System.out.println(strName);
		
	}

	

}
