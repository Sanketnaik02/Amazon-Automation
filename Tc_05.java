/* 5 Test searching for products using its name like shoe
Verify that searching with filters (e.g., category, price range) yields
*/
package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc_05 {

	public static void main(String[] args) {
		
		// open chrome Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// go to the Amazon Url
		driver.get("https://www.amazon.in/");
		
		// Search SHoes in search Box
		WebElement SearchBar = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBar.sendKeys("Shoes");	
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		// 1. choose sort option Low to High (Drop Down Section)
		WebElement options = driver.findElement(By.id("s-result-sort-select"));
		Select select = new Select(options);
		
		select.selectByVisibleText("Price: Low to High");
		
		// 2. selct some check Box Options for filters Out
		driver.findElement(By.xpath("//li[@id='p_90/6741118031']")).click();
		
		
		
		
		

	}

}
