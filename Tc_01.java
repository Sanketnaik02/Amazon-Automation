// 1 Test if a new user can successfully register.

package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_01 {

	public static void main(String[] args) {
		
		// open chrome Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// go to the Amazon Url
		driver.get("https://www.amazon.in/");

		// click on Account button 
		driver.findElement(By.id("nav-link-accountList")).click();
		
		// click on create account button
		driver.findElement(By.id("createAccountSubmit")).click();
		
		// Enter your all details 
		// First And Last Name
		WebElement Name = driver.findElement(By.id("ap_customer_name"));
		Name.sendKeys("Test User");
		
		// Phone Number
		WebElement Number = driver.findElement(By.id("ap_phone_number"));
		Number.sendKeys("6203221059");
		
		// Password 
		WebElement Password = driver.findElement(By.id("ap_password"));
		Password.sendKeys("Welcome@01");
		
		// Click Verify Button
		driver.findElement(By.id("continue")).click();
		
		String Title = driver.getTitle();
		if(Title=="") {
			System.out.println("test case is PASSED");
		}
		else {
			System.out.println("test case is Failed !");
		}
	
		driver.close();
	}

}
