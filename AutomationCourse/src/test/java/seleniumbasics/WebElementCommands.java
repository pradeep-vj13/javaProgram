package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{

	
	public void verifyCommands ()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		 
		WebElement messagebBox = driver.findElement(By.id("single-input-field"));
		 messagebBox.sendKeys("Hi There");
		 
		 WebElement showMessage = driver.findElement(By.id("button-one"));
		 showMessage.click();
		
		 WebElement yourMsg = driver.findElement(By.id("message-one"));
		 System.out.println(yourMsg.getText()); // Used to fetch text from web element to console.
		 
		 System.out.println(showMessage.getTagName());
		 messagebBox.clear();
		
	
	}
	public static void main(String[] args) {
		WebElementCommands webelement  = new WebElementCommands();
		
		webelement.browserLaunch();
		webelement.verifyCommands();
	

	}

}
