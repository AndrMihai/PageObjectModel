package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework33 extends BaseTest{
	@Test
	public void homework33Test() {
		
		app.click(app.menu.searchIcon);
		app.sendKeys(app.menu.searchInput, "King");
		app.click(By.xpath("(//a[contains(@href, 'the-wicked-king')])[1]"));
		
		assertEquals(app.returnElement(app.bookTemplate.category).getText(), "New Releases");
	}

}
