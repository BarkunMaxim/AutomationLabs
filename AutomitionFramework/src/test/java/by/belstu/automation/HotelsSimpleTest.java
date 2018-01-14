package by.belstu.automation;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import by.belstu.automation.driver.DriverSingelton;
import by.belstu.automation.pages.HotelsPage;
import by.belstu.automation.pages.LoginPage;
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
		hotelsPage.fillInHotelsForm("Minsk, Belarus");
		
		Assert.assertTrue(hotelsPage.checkCurrentHotel("Minsk"));
	}
	
	@Test
	public void testNegativeLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openPage();
		loginPage.login("maksim", "12345678q");
		Assert.assertTrue(loginPage.isLogin("maksim_barkun@mail.ru"));
	}
	
	@Test
	public void testChangeLanguage() {
		mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.changeLanguage();
		String flagCa = driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/header/div/div/div/div/div[2]/div/div[1]/a/div[2]/span")).getAttribute("class");
		
		Assert.assertEquals("flag ca", flagCa);
	}
	
	@Test
	public void testLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openPage();
		loginPage.login("maksim_barkun@mail.ru", "12345678q");
		Assert.assertTrue(loginPage.isLogin("maksim_barkun@mail.ru"));
	}
	
}
