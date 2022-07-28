package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class RadioChkBoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:/Program Files/Google/Chrome Beta/Application/chrome.exe");
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		
		driver.findElement(By.xpath("//input[@type=\"radio\" and @value='Female' and @name= 'gender']")).click();
		
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		WebElement chkbox= driver.findElement(By.xpath("//input[@class='cb1-element'])[2]"));
		
		
		System.out.println("Is checkbox selected:" + chkbox.isSelected());
		chkbox.click();
		
		
		
		
		
	}

}
