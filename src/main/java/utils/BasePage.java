package utils;

import pages.ContactsPage;
import pages.EventsPage;
import pages.LoginPage;
import pages.MenuPage;
import pages.ShippingAddressPage;
import pages.ShopPage;
import pages.SingleEventPage;

public class BasePage extends SeleniumWrappers {
	
	public MenuPage menu = new MenuPage(driver);
	public LoginPage login = new LoginPage(driver);
	public ContactsPage contacts = new ContactsPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public EventsPage events = new EventsPage(driver);
	public SingleEventPage singleEvent = new SingleEventPage(driver);
	public ShippingAddressPage shippingPage= new ShippingAddressPage(driver);

}
