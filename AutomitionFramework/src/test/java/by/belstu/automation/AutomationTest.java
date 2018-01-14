package by.belstu.automation;

import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import by.belstu.automation.driver.DriverSingelton;
import by.belstu.automation.pages.MainPage;


public class AutomationTest {
	
	private WebDriver driver;
	
	@BeforeClass
	public void getDriver() {
		driver = DriverSingelton.getDriver();
	}
	@Ignore
	@Test
	public void testFindTicketsOne() throws InterruptedException {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.findTickets("Moscow", "London", "01/20/2018", "01/25/2018", "One-way");
		
		//assertTrue(!mainPage.isWork());
	}
	
	@Ignore
	@Test
	public void testFindTicketsTwo() {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		
		assertTrue(!mainPage.isWork());
	}
	@Ignore
	@Test
	public void testFindTicketsTree() {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
	//	mainPage.findTickets("Moscow", "London", "01/20/2018-02/14/2018" , "Roud-trip", "Bissnes");
		
		assertTrue(!mainPage.isWork());
	}
	@Ignore
	@Test
	public void testFindTicketsFour() {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
	//	mainPage.findTickets("Moscow", "", "02/13/2018" , "One-way", "Bissnes");
		
		assertTrue(!mainPage.isWork());
	}
	@Ignore
	@Test
	public void testFindTicketsFive() {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
	//	mainPage.findTickets("", "London", "01/20/2018" , "One-way", "Bissnes");
		
		assertTrue(!mainPage.isWork());
	}
	@Ignore
	@Test
	public void testFindTicketsSix() {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		//mainPage.findTickets("Moscow", "London", "01/20/2018 - 01/19/2018" , "Roud-trip", "Bissnes");
		
		assertTrue(!mainPage.isWork());
	} 
	@Ignore
	@Test
	public void testFindTicketsSeven() {
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		//mainPage.findTickets("Moscow", "Moscow", "01/20/2018" , "One-way", "Bissnes");
		
		assertTrue(!mainPage.isWork());
	}
}
