package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:/Program Files/Google/Chrome Beta/Application/chrome.exe");
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		//driver.navigate().to("https://www.google.com");
		//driver.navigate().refresh();
		
//		WebElement searchbox= driver.findElement(By.name("q"));
//		searchbox.sendKeys("Java Tutorial");
		
		String strSalary= driver.findElement(By.xpath("//td[contains(text(), 'B.Wagner')]//following-sibling::td[5]")).getText();
		System.out.println("Salary:" +strSalary);
		System.out.println("Modified By Tester 2");

	}

}
