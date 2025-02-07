package seleniumYou;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		/*
		 * id - Done
		 * className - Done
		 * tagName - Done
		 * LinkText - Done 
		 * PatrialLinkText 
		 * Name - Done
		 * 
		 * CSS
		 * Xpath
		 */
		System.out.println("Hello everyone");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.findElement(By.name("login")).getText());
		driver.findElement(By.id("email")).sendKeys("bipin123@gmail.com");
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		driver.findElement(By.linkText("Forgotten password?")).click();

	}

}
