package seleniumbasics;

public class BrowserCommands extends Base {

	public void verifyBrowserCommands() {
		String title = driver.getTitle(); // To get the tab title
		System.out.println(title);
		String url = driver.getCurrentUrl(); // To get the URL
		System.out.println(url);
		String handleId = driver.getWindowHandle();
		System.out.println(handleId); // unique Id for identifying each tab
		String source = driver.getPageSource();
		System.out.println(source); // To get source code

	}

	public void verifyNavigationCommands() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

	public static void main(String[] args) {
		BrowserCommands bc = new BrowserCommands();
		bc.browserLaunch();
		// bc.verifyBrowserCommands();
	//	bc.verifyNavigationCommands();

	}

}
