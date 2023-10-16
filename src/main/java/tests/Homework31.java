package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework31 extends BaseTest {
	@Test
	public void sendMessageTest() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		String javascriptHover = "var obiect = document.createEvent('MouseEvent');" + "obiect.initMouseEvent('mouseover', true);" + "arguments[0].dispatchEvent(obiect);";
		jse.executeScript(javascriptHover, app.returnElement(app.menu.blogLink));
		
		app.click(app.menu.postFormats);
		
		jse.executeScript("arguments[0].scrollIntoView()", app.returnElement(app.postFormatsPage.galleryFormat));
		jse.executeScript("window.scrollBy(0, -100)");
		app.click(app.postFormatsPage.galleryFormat);
		jse.executeScript("document.getElementsByName('comment')[0].scrollIntoView()");
		jse.executeScript("window.scrollBy(0, -100)");
		jse.executeScript("document.getElementsByName('comment')[0].value ='Test'");
		Thread.sleep(3000);
		jse.executeScript("arguments[0].value='numele meu'", app.returnElement(app.galleryFormatPage.nameField));
		jse.executeScript("document.getElementsByName('email')[0].value ='Test@test'");
		jse.executeScript("document.getElementsByName('url')[0].value ='Test'");
		jse.executeScript("document.getElementsByName('submit')[0].click()");
		assertEquals(app.returnElement(app.galleryFormatPage.commentText).getText(), "Your comment is awaiting moderation.");
	}

}
