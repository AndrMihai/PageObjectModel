package utils;

import pages.*;

public class BasePage extends SeleniumWrappers {

	public MenuPage menu = new MenuPage(driver);
	public LoginPage login  = new LoginPage(driver);
	public ShopPage shop =  new ShopPage(driver);
	public ContactsPage contacts =  new ContactsPage(driver);
	public EventsPage events = new EventsPage(driver);
	public SingleEventPage singleEvent = new SingleEventPage(driver);
	public HomePage home = new HomePage(driver);
	public ShippingAddressPage shippingPage = new ShippingAddressPage(driver);
	public PostFormatsPage postFormatsPage = new PostFormatsPage(driver);
	public GalleryFormatPage galleryFormatPage = new GalleryFormatPage(driver);
	public BookTemplate bookTemplate = new BookTemplate(driver);
	
}
