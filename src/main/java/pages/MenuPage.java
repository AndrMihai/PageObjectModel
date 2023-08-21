package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}
	//locatori sau webelement
	//WebElement buton = driver.findElement(by.ceva(""))
	public By homeLink = By.linkText("HOME");
	public By contactLink = By.linkText("CONTACTS");
	public By loginLink = By.linkText("Login");
	//metode specifice cu locatori sau elemente de mai sus
	//metode specifice inseamna functionalitatea paginii in care ma aflu
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}

}
