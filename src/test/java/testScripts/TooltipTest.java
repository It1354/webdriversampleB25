package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TooltipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:/Program Files/Google/Chrome Beta/Application/chrome.exe");
		
		WebDriver driver= new ChromeDriver(options);
		Actions actions=new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");

		driver.switchTo().frame(0);

		WebElement age = driver.findElement(By.id("age"));

		age.sendKeys(Keys.PAGE_DOWN);

		actions.moveToElement(age).perform();

		String strToolText = driver.findElement(By.className("ui-tooltip-content")).getText();

		System.out.println("Tool tip Text :" +strToolText);

	}

}
