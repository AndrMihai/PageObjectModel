package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers{
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}
	//locatori sau webelement
	//WebElement buton = driver.findElement(by.ceva(""))
	public By homeLink = By.linkText("HOME");
	public By contactLink = By.linkText("CONTACTS");
	public By loginLink = By.linkText("Login");
	public By shopLink = By.linkText("BOOKS");
	public By singleAuthorLink = By.linkText("SINGLE AUTHOR");
	public By blogLink = By.linkText("BLOG");
	public By aboutLink = By.linkText("ABOUT");
	public By eventsLink = By.linkText("EVENTS");
	public By searchIcon = By.cssSelector("button[class*='search_submit']");
	public By searchInput = By.cssSelector("input[class='search_field']");
	public By postFormats = By.linkText("Post Formats");
	//metode specifice cu locatori sau elemente de mai sus
	//metode specifice inseamna functionalitatea paginii in care ma aflu
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	public void hoverElement(By locator) {
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	public void search(String textToSearch) {
		click(searchIcon);
		sendKeys(searchInput, textToSearch);
		click(searchIcon);
		
		
		
	}

}
