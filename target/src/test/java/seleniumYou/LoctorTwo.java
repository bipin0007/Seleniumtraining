package seleniumYou;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoctorTwo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.className("gLFyf")).sendKeys("India");
		driver.findElement(By.partialLinkText("Gma")).click();
		driver.quit();
	}

}
