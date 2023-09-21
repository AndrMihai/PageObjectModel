package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class EditAddressShippingTest extends BaseTest {
	
	@Test
	public void testShipping() throws InterruptedException {
		
		app.click(app.menu.loginLink);
		app.login.loginInApp("TestUser", "12345@67890");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(app.login.logoutButton));
		driver.get("https://keybooks.ro/account/edit-address/shipping/");
		app.shippingPage.selectByIndex(41, app.shippingPage.countryDropdown);
		app.shippingPage.selectByValue("NL", app.shippingPage.provinceSelector);
		assertEquals(app.shippingPage.getSelectedText(app.shippingPage.countryDropdown),"Canada");
		assertEquals(app.shippingPage.getSelectedText(app.shippingPage.provinceSelector),"Newfoundland and Labrador");
	}

}
