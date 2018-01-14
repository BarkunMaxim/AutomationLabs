package by.belstu.automation;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import by.belstu.automation.driver.DriverSingelton;
import by.belstu.automation.pages.HotelsPage;
import by.belstu.automation.pages.MainPage;

public class HotelsSimpleTest {

	private WebDriver driver;
	private MainPage mainPage;
	private HotelsPage hotelsPage;

	@BeforeTest
	public void getDriver() {
		driver = DriverSingelton.getDriver();
	}

	
	@Test
	public void testHotelsSearchPageExists() {
		mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.openHotelsPage();

		hotelsPage = new HotelsPage(driver);
		WebElement el = hotelsPage.findSearchHotelButton();
		assertNotNull(el, "Hotels Page not found");

	}

	@Test
	public void testHotelSearchCorrectData() {
		mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.openHotelsPage();

		hotelsPage = new HotelsPage(driver);
		hotelsPage.fillInHotelsForm("Minsk");
		
	}
}
