package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	
	private static WebDriver browser;

	public static WebDriver getBrowser() {
		if (browser == null){
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
			browser = new FirefoxDriver();
		}
			return browser;
		}

}
