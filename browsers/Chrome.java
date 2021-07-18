package browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	
	private static ChromeDriver browser;

	public static ChromeDriver getBrowser() {
		if (browser == null){
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			browser = new ChromeDriver();
		}
			return browser;
		}

}


