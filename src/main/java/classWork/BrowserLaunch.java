package classWork;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.getTitle();
		
		Thread.sleep(3000);
		//driver.close();
		driver.quit();

	}

}
