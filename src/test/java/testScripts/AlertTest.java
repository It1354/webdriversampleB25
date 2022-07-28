package testScripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:/Program Files/Google/Chrome Beta/Application/chrome.exe");
		
		WebDriver driver= new ChromeDriver(options);
		Actions actions=new Actions(driver);
		
		driver.manage().window().maximize();
		
		//Explicit Wait
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(3));
		
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		//Implicit Wait
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		String strtxt=alert.getText();
		Thread.sleep(2000);
		System.out.println("Alert text=" +strtxt);
		alert.accept();
		
		
		//Confirmation Alert
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][1]")).click();
		Thread.sleep(2000);
		Alert confirm=driver.switchTo().alert();
		Thread.sleep(2000);
		String strtxt1=alert.getText();
		System.out.println("Alert text=" +strtxt1);
		confirm.dismiss();
		
		//Prompt Alert
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][2]")).click();
		Thread.sleep(2000);
		Alert prompt=driver.switchTo().alert();
		Thread.sleep(2000);
		String strtxt2=alert.getText();
		Thread.sleep(2000);
		System.out.println("Alert text=" +strtxt2);
		
		
		prompt.sendKeys("Hello Welcome");
		Thread.sleep(2000);
		prompt.accept();
		

	}

}
