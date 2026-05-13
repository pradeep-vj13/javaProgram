package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver; // WebDriver declaration globally

	public void browserLaunch() {
		driver = new ChromeDriver ();
		 driver.get("https://selenium.qabible.in/");
		//driver.get("https://www.youtube.com/@dssp-v5p");
		driver.manage().window().maximize();

	}

	public void browserCloseAndQuit() {
		// driver.close(); // To close a single tab
		driver.quit(); // To close all tabs

	}

	public static void main(String[] args) {
		Base b1 = new Base();
		b1.browserLaunch();
		b1.browserCloseAndQuit();
	}

}
