package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base {

	public void verifyDropdown() {
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));

		Select sel = new Select(dropdown);
		// sel.selectByIndex(2); Select by index
		// sel.selectByValue("c#"); Select by Value
		sel.selectByVisibleText("SQL"); // Select by visible Text.

	}

	public void VerifyCheckbox() {

		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox' and @value='option-1']"));
		checkbox.click();

	}

	public void VerifyRadioButton() {

		WebElement radiobutton = driver
				.findElement(By.xpath("//input[@type='radio' and @name='color' and @value='yellow']"));
		radiobutton.click();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdown hd = new HandlingDropdown();
		hd.browserLaunch();
		hd.verifyDropdown();
		hd.VerifyCheckbox();
		hd.VerifyRadioButton();

	}

}
