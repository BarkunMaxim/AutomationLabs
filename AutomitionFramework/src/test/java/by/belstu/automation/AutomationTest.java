package by.belstu.automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.belstu.automation.driver.DriverSingelton;
import by.belstu.automation.pages.MainPage;
import junit.framework.Assert;

public class AutomationTest {
	
	private WebDriver driver;
	
	@BeforeClass
	public void getDriver() {
		driver = DriverSingelton.getDriver();
	}
	
	@Test
	public void testFindTicketsOne() {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.findTickets("Moscow", "London", "01/20/2018" , "One-way");
		
		Assert.assertTrue(!mainPage.isWork());
	}
	
	@Test
	public void testFindTicketsTwo() {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.findTickets("Moscow", "London", "01/20/2018" , "One-way", "Bissnes");
		
		Assert.assertTrue(!mainPage.isWork());
	}
	
	@Test
	public void testFindTicketsTree() {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.findTickets("Moscow", "London", "01/20/2018-02/14/2018" , "Roud-trip", "Bissnes");
		
		Assert.assertTrue(!mainPage.isWork());
	}
	
	@Test
	public void testFindTicketsFour() {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.findTickets("Moscow", "", "02/13/2018" , "One-way", "Bissnes");
		
		Assert.assertTrue(!mainPage.isWork());
	}
	
	@Test
	public void testFindTicketsFive() {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.findTickets("", "London", "01/20/2018" , "One-way", "Bissnes");
		
		Assert.assertTrue(!mainPage.isWork());
	}
	
	@Test
	public void testFindTicketsSix() {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.findTickets("Moscow", "London", "01/20/2018 - 01/19/2018" , "Roud-trip", "Bissnes");
		
		Assert.assertTrue(!mainPage.isWork());
	} 
	
	@Test
	public void testFindTicketsSeven() {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.findTickets("Moscow", "Moscow", "01/20/2018" , "One-way", "Bissnes");
		
		Assert.assertTrue(!mainPage.isWork());
	}
}
