package testScripts;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:/Program Files/Google/Chrome Beta/Application/chrome.exe");
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.google.com");
		driver.navigate().refresh();
		
		WebElement searchbox= driver.findElement(By.name("q"));
		searchbox.sendKeys("Java Tutorial");
		//searchbox.submit();
//		searchbox.sendKeys(Keys.ENTER);
//		
//		String pageTitle=driver.getTitle();
//		System.out.println("Page Title:"+ pageTitle);
//		System.out.println("Page URL:"+ driver.getCurrentUrl());
//		
//		driver.navigate().back();
//		
//		System.out.println("Home Page Title:"+ driver.getTitle());
//		driver.navigate().forward();
		
		
		System.out.println("Search Box Attr:" +searchbox.getAttribute("role"));
		Thread.sleep(2000);
		
		List<WebElement> items= driver.findElements(By.xpath("//ul[@class='G43f7e']//li//descendant::div[@class=wM6W7d']"));
        System.out.println("Number of Items:" +items.size());
        
        for(int i=0; i<items.size(); i++) {
        	
        	System.out.println(items.get(i).getText());
        	System.out.println(items.get(i).getTagName());
        	if(items.get(i).getText().equalsIgnoreCase("java tutorial pdf"))
        			{
        			   items.get(i).click();
        	           break;
        			}
        }
        
        
		
		
	}

}
