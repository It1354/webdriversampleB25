package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:/Program Files/Google/Chrome Beta/Application/chrome.exe");
		
		WebDriver driver= new ChromeDriver(options);
		Actions actions=new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		WebElement menu= driver.findElement(By.cssSelector("ul.nav.navbar-nav li.nav-item.dropdown:nth-child(3)"));
		WebElement menuitem=driver.findElement(By.xpath("//a[contains(text(), 'Monitors')]"));
		actions.moveToElement(menu).click(menuitem).perform();
		WebElement search= driver.findElement(By.name("search"));
		search.sendKeys(Keys.chord(Keys.SHIFT+"p"));
		search.sendKeys("hone");
		search.sendKeys(Keys.PAGE_DOWN);
		search.sendKeys(Keys.PAGE_UP);
		
		//For Screenshot
		
		TakesScreenshot screen=(TakesScreenshot) driver;
		File src= screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Screenshot\\FullPage.png"));
		WebElement items=driver.findElement(By.cssSelector("div#product-list"));
		File itemsrc= screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(itemsrc, new File("F:\\Screenshot\\Items.png"));
		
		
		
		//MouseHover
		
		
//		
//		//RightClick
//   	WebElement search= driver.findElement(By.name("search"));
//		actions.contextClick(search).perform();
		
		//DoubleClick
		
//		driver.get("https://stqatools.com/demo/DoubleClick.php");
//		
//    	WebElement btnDbl= driver.findElement(By.xpath("//button(contains(),contains(text(), 'Double Click Me')]"));
//    	actions.doubleClick(btnDbl).perform();
    	
    	
		
		
		
		

	}

}
