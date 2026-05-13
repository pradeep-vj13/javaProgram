package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {

	public void verifySimpleAlert() {

		driver.navigate().to("https://demoqa.com/alerts");

		WebElement simpleClick = driver.findElement(By.id("alertButton"));
		simpleClick.click();

		Alert al = driver.switchTo().alert();
		al.accept();

	}

	public void verifyConfirmAlert() {

		driver.navigate().to("https://demoqa.com/alerts");

		WebElement confirmClick = driver.findElement(By.id("confirmButton"));
		confirmClick.click();

		Alert al = driver.switchTo().alert();
		// al.accept();
	
		al.dismiss();

	}
	
	public void verifyPromtAlert () {
		
		driver.navigate().to("https://demoqa.com/alerts");

		WebElement promtClick = driver.findElement(By.id("promtButton"));
		promtClick.click();
		
		Alert al = driver.switchTo().alert();
		al.sendKeys("Pradeep");
		al.accept();
		
	}

	public static void main(String[] args) {

		AlertHandling alert = new AlertHandling();
		alert.browserLaunch();
		// alert.verifySimpleAlert();
		// alert.verifyConfirmAlert();
		alert.verifyPromtAlert();
	}

}
