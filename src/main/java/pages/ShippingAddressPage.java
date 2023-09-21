package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressPage {
	
	public WebDriver driver;
	
	public ShippingAddressPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public By countryDropdown = By.cssSelector("select[id='shipping_country']");
	public By provinceSelector = By.cssSelector("select[id='shipping_state']");
	
	public void selectByIndex(int index, By locator) {
		WebElement dropdown = driver.findElement(locator);
		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}
	public void selectByValue(String value, By locator) {
		WebElement dropdown = driver.findElement(locator);
		Select select = new Select(dropdown);
		select.selectByValue(value);
	}
	
	public String getSelectedText(By locator) {
		WebElement dropdown = driver.findElement(locator);
		Select select = new Select(dropdown);
		return select.getFirstSelectedOption().getText();
	}
	

}
