package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesHandling extends Base {

	public void verifyFrames() {
		driver.navigate().to("https://demoqa.com/frames");

		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrames.size()); // to fetch total no of frames

		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1); // to switch control from entire page to a specific frame

		WebElement heading = driver.findElement(By.id("sampleHeading"));
		System.out.println(heading.getText());

		driver.switchTo().defaultContent(); // To switch back to where it was previously.

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FramesHandling frames = new FramesHandling();
		frames.browserLaunch();
		frames.verifyFrames();

	}

}
