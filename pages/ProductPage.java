package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	private static final String SHIPPING_CHECKBOX = "//*[@id=\"search-filter-reset-form\"]/div[2]/fieldset/div/div/div[1]/div";
	public static final String PRICE_RADIO_BTN = "//*[@id=\"search-filter-reset-form\"]/div[4]/fieldset/div/div/div[2]";
	private static final String SORT_BY_BTN = "//*[@id=\"sortby\"]/button/span[1]";
	private static final String LOWEST_PRICE = "//*[@id=\"sortby\"]/div/a[4]";

	public static void clickFreeShipping(WebDriver driver) {
		driver.findElement(By.xpath(SHIPPING_CHECKBOX)).click();
	}

	public static void clickUnder25USD(WebDriver driver) {
		driver.findElement(By.xpath(PRICE_RADIO_BTN)).click();
	}

	public static void clickSortByButton(WebDriver driver) {
		driver.findElement(By.xpath(SORT_BY_BTN)).click();
	}

	public static void clickLowestPrice(WebDriver driver) {
		driver.findElement(By.xpath(LOWEST_PRICE)).click();
	}

}
