package testScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import objects.GoogleSearch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void searchOperation() 
	{
		GoogleSearch page= new GoogleSearch(driver);
		page.searchgoogle("https://demowebshop.tricentis.com/");
		page.launchDemoWebShop();
		
	}
	
	
	@AfterTest
	public void aftertest()
	{
		//driver.quit();
	}
	

}
