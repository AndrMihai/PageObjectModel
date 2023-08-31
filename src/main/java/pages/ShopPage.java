package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ShopPage {
	
	public WebDriver driver;
	public ShopPage(WebDriver driver) {
		this.driver = driver;
		
	}
	//locatori
	public By orderDropdown = By.name("orderby");
	public By priceSliderInitialPosition = By.xpath("//span[@style='left: 0%;']");
	public By priceSliderFinalPosition = By.xpath("//span[@style='left: 100%;']");
	//metode
	public void selectByValue(String value) {
		WebElement dropdown = driver.findElement(orderDropdown);
		Select select = new Select(dropdown);
		select.selectByValue(value);
	}
	public void selectByVisibileText(String text) {
		WebElement dropdown = driver.findElement(orderDropdown);
		Select select = new Select(dropdown);
		select.selectByVisibleText(text);
	}
	public void selectByIndex(int index) {
		WebElement dropdown = driver.findElement(orderDropdown);
		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}
	public void dragAndDropSlider(By locator, int x, int y) {
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element).clickAndHold(element).moveByOffset(x, y).release().perform();
		
	}
	/**
	 * Method that returns the value as String from the current selection of a dropdown
	 * @return uses getText() method from selenium to return the text inside the selected option
	 */
	
	public String getSelectedOption() {
		WebElement dropdown = driver.findElement(orderDropdown);
		Select select = new Select(dropdown);
		return select.getFirstSelectedOption().getText();
	}
}
