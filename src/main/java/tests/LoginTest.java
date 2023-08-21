package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test(priority=1)
	public void validLoginTest() throws InterruptedException {
		MenuPage menu = new MenuPage(driver);
		//menu.navigateTo(menu.contactLink);
		//menu.navigateTo(menu.homeLink);
		menu.navigateTo(menu.loginLink);
		LoginPage login = new LoginPage(driver);
		login.loginInApp("TestUser", "12345@67890");
		assertTrue(driver.findElement(login.successLoginPopup).isDisplayed());
		Thread.sleep(5000);
		login.logoutFromApp();
	}
	@Test(priority=2)
	public void invalidLoginTest() throws InterruptedException {
		MenuPage menu = new MenuPage(driver);
		//menu.navigateTo(menu.contactLink);
		//menu.navigateTo(menu.homeLink);
		menu.navigateTo(menu.loginLink);
		LoginPage login = new LoginPage(driver);
		login.loginInApp("UserGresit", "12345@67890");
		assertTrue(driver.findElement(login.errorLoginPopup).isDisplayed());
		
	}

}
