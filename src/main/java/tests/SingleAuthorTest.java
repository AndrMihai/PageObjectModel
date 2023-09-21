package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.*;
import utils.BaseTest;


public class SingleAuthorTest extends BaseTest {
	
	@Test
	public void checkingSingleAuthorPercentages() {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.singleAuthorLink);
		SingleAuthorPage singleAuthor = new SingleAuthorPage(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));			
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(singleAuthor.dramaPercentage, "95%"));
		assertEquals(app.getElementText(singleAuthor.dramaPercentage), "95%");
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(singleAuthor.biographyPercentage, "75%"));
		assertEquals(app.getElementText(singleAuthor.biographyPercentage), "75%");
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(singleAuthor.cookbooksPercentage, "82%"));
		assertEquals(app.getElementText(singleAuthor.cookbooksPercentage), "82%");
	}

}
