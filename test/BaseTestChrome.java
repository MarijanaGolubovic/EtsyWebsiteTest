package test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import browsers.Chrome;
import utilities.Constants;


public class BaseTestChrome {
	
	
	@BeforeClass
	public static void setUp() {	
		Chrome.getBrowser().get(Constants.HOME_URL);
		Chrome.getBrowser().manage().window().maximize();
		Chrome.getBrowser().manage().deleteAllCookies();
		Chrome.getBrowser().manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Chrome.getBrowser().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void cleanUp() {
		Chrome.getBrowser().quit();
	}

}
