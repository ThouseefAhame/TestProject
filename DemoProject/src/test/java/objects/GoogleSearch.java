package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {
	
	WebDriver driver;
	
	public GoogleSearch(WebDriver driver) {
		
		this.driver = driver;
		
	}

	By searchbar= By.name("q");
	By searchButton= By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	By demoWebShop= By.xpath("//h3[text()='Demo webshop - Tricentis']");
	
	public void searchgoogle(String searchinput) 
	{
		driver.findElement(searchbar).sendKeys(searchinput);
		//boolean ele= driver.findElement(searchButton).isDisplayed();
		//System.out.println(ele);
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		//ele.click();
		driver.findElement(searchButton).click();
	}
	
	public void launchDemoWebShop()
	{
		driver.findElement(demoWebShop).click();
	}
}
