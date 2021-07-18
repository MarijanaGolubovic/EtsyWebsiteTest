package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HomePage {

	private static final String SIGNIN_BTN = "//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button";
	public static final String NAV_ITEM = "//*[@id=\"catnav-primary-link-10923\"]";
	public static final String MENU_ITEM_DRESSES = "//*[@id=\"catnav-l4-10926\"]";  
	private static final String SEARCH_FILED = "global-enhancements-search-query"; 
	private static final String SEARCH_BUTTON = "//*[@id=\"gnav-search\"]/div/div[1]/button";
	
	public static void clickSigninBtn(WebDriver driver) {
		driver.findElement(By.xpath(SIGNIN_BTN)).click();
	}

	public static void hoverOverDropDownMenuItem(WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(NAV_ITEM))).perform();
	}

	public static void clickOnDresses(WebDriver driver) {
		driver.findElement(By.xpath(MENU_ITEM_DRESSES)).click();
	}
	
	public static void inputSearchKeyword(WebDriver driver, String input) {
		WebElement element = driver.findElement(By.id(SEARCH_FILED));
		element.clear();
		element.sendKeys(input);
	}
	
	public static void clickSearchButton(WebDriver driver) {
		driver.findElement(By.xpath(SEARCH_BUTTON)).click();
	}

}
