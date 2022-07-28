package testScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WinPopupTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:/Program Files/Google/Chrome Beta/Application/chrome.exe");
		
		WebDriver driver= new ChromeDriver(options);
		Actions actions=new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https:www.google.com/");
		String parentWin=driver.getWindowHandle();
		
		//Open a New Window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.youtube.com/");
		Set<String> wins= driver.getWindowHandles();
		System.out.println("No Of Opened Windows:" +wins.size());
	    
		Iterator<String> it=wins.iterator();
		String gWindow=it.next(); //GOOGLE WINDOW HANDLE
		String SelWindow=it.next(); //SELENIUM WINDOW HANDLE
		System.out.println(driver.getTitle());
		
		driver.close();
		
		//switch to Google Window
		driver.switchTo().window(parentWin);
		//driver.switchTo().window(gWindow);
		System.out.println(driver.getTitle());
		
		//Open a new tabbed window
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://playwright.dev/");
		System.out.println(driver.getTitle());
		
		//driver.close();
		driver.quit();
		
		
		
		
		

	}

}
