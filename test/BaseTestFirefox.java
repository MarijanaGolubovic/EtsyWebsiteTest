package test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import browsers.Firefox;
import utilities.Constants;

public class BaseTestFirefox {
	
	@BeforeClass
	public static void setUp() {	
		Firefox.getBrowser().get(Constants.HOME_URL);
		Firefox.getBrowser().manage().window().maximize();
		Firefox.getBrowser().manage().deleteAllCookies();
		Firefox.getBrowser().manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Firefox.getBrowser().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void cleanUp() {
		Firefox.getBrowser().quit();
	}
}
