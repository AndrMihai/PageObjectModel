package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.beust.ah.A;

import utils.BaseTest;

public class WindowHandle extends BaseTest {
	
	@Test
	public void windowHandleTest() {
		
		/*app.menu.navigateTo(app.menu.eventsLink);
		app.events.clickOnEvent(app.events.timeForBookLink);*/
		
		app.click(app.menu.eventsLink);
		app.click(app.events.timeForBookLink);
		app.scrollByPixels(0, 800);
		app.singleEvent.clickMap();
		
		System.out.println("current window:" + driver.getWindowHandle());
		List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
		System.out.println("Get all open active sessions: " + browserTabs);
		driver.switchTo().window(browserTabs.get(1));
		driver.findElement(By.xpath("(//span[text()='Accept all'])[1]")).click();
		driver.close();
	}

}
