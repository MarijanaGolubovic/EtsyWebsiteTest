package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import browsers.Chrome;
import pages.HomePage;
import pages.ProductPage;
import pages.SignInPage;
import utilities.Constants;

public class EtsyE2ETests extends BaseTestChrome {

	WebDriver driver = Chrome.getBrowser();
	WebDriverWait wait = new WebDriverWait(driver, 30);

	// Successful sign in
	@Test(priority = 1)

	public void signinTest() {

		HomePage.clickSigninBtn(driver);
		SignInPage.inputEmail(driver, Constants.EMAIL);
		SignInPage.clickContinue(driver);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(SignInPage.PASSWORD)));
		SignInPage.inputPassword(driver, Constants.PASSWORD);
		SignInPage.clickSignin(driver);

		WebElement result = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Constants.WELCOME_H1)));
		Assert.assertEquals(result.getText(), "Welcome back, " + Constants.NAME + "!");
	}

	// Select a category from a dropdown menu
	@Test(priority = 2)

	public void dropdownMenuTest() {

		driver.navigate().to(Constants.HOME_URL);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(HomePage.NAV_ITEM)));
		HomePage.hoverOverDropDownMenuItem(driver);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePage.MENU_ITEM_DRESSES)));
		HomePage.clickOnDresses(driver);
		driver.navigate().refresh();
		wait.until(ExpectedConditions.urlToBe(Constants.DRESSES_URL));

		String expectedUrl = Constants.DRESSES_URL;
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	// Set filters for chosen item category
	@Test(priority = 3)

	public void setFiltersTest() {

		ProductPage.clickFreeShipping(driver);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ProductPage.PRICE_RADIO_BTN)));
		ProductPage.clickUnder25USD(driver);

		wait.until(ExpectedConditions.urlToBe(Constants.FILTERED_DRESSES_URL));

		String expectedUrl = Constants.FILTERED_DRESSES_URL;
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	// Sort chosen item category by ascending price
	@Test(priority = 4)
	public void sortByTest() {

		ProductPage.clickSortByButton(driver);
		ProductPage.clickLowestPrice(driver);

		wait.until(ExpectedConditions.urlToBe(Constants.ASCENDING_PRICE_URL));

		String expectedUrl = Constants.ASCENDING_PRICE_URL;
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);

	}

	// Search for an item
	@Test(priority = 5)
	public void searchFieldTest() {

		HomePage.inputSearchKeyword(driver, Constants.SRCH_KEYWORD);
		HomePage.clickSearchButton(driver);

		wait.until(ExpectedConditions.urlToBe(Constants.SEARCH_RESULT_URL));

		String expectedUrl = Constants.SEARCH_RESULT_URL;
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);

	}
}
