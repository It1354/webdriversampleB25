package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:/Program Files/Google/Chrome Beta/Application/chrome.exe");
		
		WebDriver driver= new ChromeDriver(options);
		Actions actions=new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");

		WebElement strText = driver.findElement(By.cssSelector("label > span"));

		System.out.println("Label Text: " +strText.getText());

		//from main page to frame1
		//driver.switchTo().frame("Frame1");
		driver.switchTo().frame(0);
		driver.findElement(By.tagName("input")).sendKeys("Hello welcome");

		Thread.sleep(2000);
		//from main page to frame3
		driver.switchTo().frame("Frame3");
		//driver.switchTo().frame(0);
		WebElement chkbox = driver.findElement(By.id("a"));

		if(!chkbox.isSelected())
		chkbox.click();

		//from frame3 to frame1

		driver.switchTo().parentFrame();
		
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("Hello welcome back");


		//Frame1 to main page
		driver.switchTo().defaultContent();

		WebElement stText = driver.findElement(By.cssSelector("label > span"));
		System.out.println("Label after coming back :" +stText.getText());


		//main page to frame2

		driver.switchTo().frame(1);

		Select drpdown = new Select(driver.findElement(By.id("animals")));

		drpdown.selectByIndex(3);

		System.out.println("Selected value:" +drpdown.getFirstSelectedOption().getText());


	
	}

}
