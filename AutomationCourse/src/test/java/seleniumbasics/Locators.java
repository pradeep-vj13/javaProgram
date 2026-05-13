package seleniumbasics;

import org.openqa.selenium.By;

public class Locators extends Base {

	public void verifyLocators()

	{
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("form-control")); // High chance of duplicates.
		driver.findElement(By.tagName("input"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Select Input"));
		driver.findElement(By.partialLinkText("Select"));
		driver.findElement(By.cssSelector("button[id='button-one']")); // Syntax - tagname[attribute='attribute value']
		driver.findElement(By.xpath("//button[@id='button-two']")); // Syntax -  //tagname[@attribute='attribute value']
		
		driver.findElement(By.xpath("//button[text()='Get Total']")); // - when id,and other atrributes isnt available, use text.
		
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']")); 
		// Xpath using and operator. Both elements needs to be match left and right of and.
		
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
		// Xpath using or operator. Any one elements needs to be matched.
		
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
		// Used when the parent doesn’t have a unique identifier, but the child text is unique.
		
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']")); 
		// Using child.
		
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		// it will locate all the class=card under button-one.
		
		driver.findElement(By.xpath(" //button[@id='button-one']//preceding:: div[@class='card']"));
		// it will locate all the class=card above button-one.
		
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		//it will locate all 6 parent div tags.
		
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[1]"));
		//it will locate first parent div tags.
		
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
		//it will locate all child div tags under class=card.
		
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
