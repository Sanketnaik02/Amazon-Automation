//2 Verify login is successful with correct email and password.

package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_02 {

	public static void main(String[] args) {

		// open chrome Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// go to the Amazon Url
		driver.get("https://www.amazon.in/");

		// click on Account button
		driver.findElement(By.id("nav-link-accountList")).click();
		
		// Enter Valid Number
		WebElement mobile = driver.findElement(By.id("ap_email"));
		mobile.sendKeys("8390942414");
		driver.findElement(By.id("continue")).click();
		
		// Enter Valid Password
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Sanketnaik393@");
		driver.findElement(By.id("signInSubmit")).click();
		
		
		
	}

}
