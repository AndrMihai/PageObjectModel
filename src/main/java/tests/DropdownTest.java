package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.MenuPage;
import pages.ShopPage;
import utils.BaseTest;

public class DropdownTest extends BaseTest {
	
	@Test(priority=1, groups = "ProductFunctionality")
	public void selectByValueTest() {
		MenuPage menu = new  MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		ShopPage shop = new ShopPage(driver);
		shop.selectByValue("price-desc");
		assertEquals(shop.getSelectedOption(), "Sort by price: high to low");
	}
	@Test(priority=2, groups = "ProductFunctionality")
	public void selectByVisibleTextTest() {
		
		MenuPage menu = new  MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		ShopPage shop = new ShopPage(driver);
		shop.selectByVisibileText("Sort by popularity");
		assertEquals(shop.getSelectedOption(), "Sort by popularity");
	}
	@Test(priority=3, groups = "ProductFunctionality")
	public void selectByIndexTest() {
		
		MenuPage menu = new  MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		ShopPage shop = new ShopPage(driver);
		shop.selectByIndex(3);
		assertEquals(shop.getSelectedOption(), "Sort by latest");
	}
	@Test(priority=4, groups = "ProductFunctionality")
	public void example() {
		MenuPage menu = new  MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		//identific webelement cu nume dropdown pe current browser chrome cu sessionid XX
		WebElement dropdown = driver.findElement(By.name("orderby"));
		Select select = new Select(dropdown);
		select.selectByIndex(2);//merge fara probleme
		//refresh
		//dupa refresh selenium isi ia alt session id 
		//foloseste element, dar selenium nu il poate asocia cu noul session id
		//el asociaza elementul cu vechiul session id si arunca exceptie StaleElement
		dropdown = driver.findElement(By.name("orderby"));
		select = new Select(dropdown);
		select.selectByValue("Sort by latest");
	}
	
}
