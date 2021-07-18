package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	
	private static final String EMAIL = "join_neu_email_field";	
	private static final String CONTINUE = "//*[@id=\"join-neu-form\"]/div[1]/div/div[5]/div/button";		
	public static final String PASSWORD = "join_neu_password_field";
	private static final String SIGNIN = "submit_attempt";
	
	
	public static void inputEmail(WebDriver driver, String input) {
		WebElement element = driver.findElement(By.id(EMAIL));
		element.clear();
		element.sendKeys(input);
	}
	
	public static void clickContinue(WebDriver driver) {
		driver.findElement(By.xpath(CONTINUE)).click();
	}

	public static void inputPassword(WebDriver driver, String input) {
		WebElement element = driver.findElement(By.id(PASSWORD));
		element.clear();
		element.sendKeys(input);
	}

	public static void clickSignin(WebDriver driver) {
		driver.findElement(By.name(SIGNIN)).click();
	}

}
