package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HandlingJavaScriptExecutor extends Base {

	public void verifyJs() {

		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessage = driver.findElement(By.id("button-one"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", showMessage); // clicking using java script exector

		js.executeScript("window.scrollBy(0,350)", ""); // for scroll up give value to Y axis

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingJavaScriptExecutor click = new HandlingJavaScriptExecutor();
		click.browserLaunch();
		click.verifyJs();

	}

}
