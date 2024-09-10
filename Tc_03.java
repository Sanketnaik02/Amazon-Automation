// 3 Ensure login fails with incorrect email or password.

package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_03 {

	public static void main(String[] args) {

		// open chrome Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// go to the Amazon Url
		driver.get("https://www.amazon.in/");

		// click on Account button
		driver.findElement(By.id("nav-link-accountList")).click();

		// Enter IN-Valid Number
		WebElement mobile = driver.findElement(By.id("ap_email"));
		mobile.sendKeys("1234567890");
		driver.findElement(By.id("continue")).click();

		// Enter IN-Valid Password
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Enter InValid Password");
		driver.findElement(By.id("signInSubmit")).click();

		String Title = driver.getTitle();
		if (Title == "Account Login Successfull") {

			System.out.println("Test CAses Failed !");
		} else {
			System.out.println("Test Cases Passed !");
		}

		driver.close();

	}

}
