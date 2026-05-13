package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {

	public void verifyFileUpload()

	{

		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		chooseFile.sendKeys("D:\\JavaWorkSpace\\AutomationCourse\\src\\test\\resources\\PRADEEP-VJ-CV.pdf");

		WebElement accept = driver.findElement(By.xpath("//input[@id='terms']"));
		accept.click();
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbutton']"));

		submit.click();

	}

	public void verifyFileUploadUsingRobot() throws AWTException {

		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement pickFile = driver.findElement(By.id("pickfiles"));
		pickFile.click();

		StringSelection selection = new StringSelection(
				"D:\\JavaWorkSpace\\AutomationCourse\\src\\test\\resources\\PRADEEP-VJ-CV.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void main(String[] args) {

		FileUpload upload = new FileUpload();
		upload.browserLaunch();
		// upload.verifyFileUpload();
		try {
			upload.verifyFileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
