package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:/Program Files/Google/Chrome Beta/Application/chrome.exe");
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
		//driver.findElement(By.id("username")).sendKeys("tomsmith");
		//driver.findElement(By.name("username")).sendKeys("tomsmith");
		//driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
		//driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='username' or @type='text']")).sendKeys("tomsmith");
		
		
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		//driver.findElement(By.className("radius")).click();
		//driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//button")).click();
		
		
		//driver.findElement(By.linkText("Elemental Selenium")).click();
		//driver.findElement(By.partialLinkText("Elemental")).click();
		
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//button[@class='radius']")).click();
		
		
		
		
	}

}
