package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {

	public void verifyRightClick() {

		WebElement otherMenu = driver.findElement(By.id("others"));
		Actions a = new Actions(driver); // we need to pass driver to work
		a.contextClick(otherMenu).build().perform(); // build,perform needs to give to work in Action.

	}

	public void verifyMouseHover() {

		WebElement otherMenu = driver.findElement(By.id("others"));
		Actions a = new Actions(driver);
		a.moveToElement(otherMenu).build().perform();

	}

	public void verifyDragAndDrop() {

		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();

	}

	public void verifyKeyboardActions() throws AWTException {

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_T);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_T);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions actions = new HandlingActions();
		actions.browserLaunch();
		// actions.verifyRightClick();
		// actions.verifyMouseHover();
		// actions.verifyDragAndDrop();
		try {
			actions.verifyKeyboardActions();
		} catch (AWTException e) {

			e.printStackTrace();
		}

	}

}
