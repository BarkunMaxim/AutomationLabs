package by.belstu.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {

	private final String BASE_URL = "https://global.cheapflights.com";

	private WebElement changeLanguage;
	private WebElement textBoxFrom;
	private WebElement textBoxTo;
	private WebElement radioButtonOneWay;
	private WebElement radionButtonRoundTrip;
	private WebElement textBoxDate;
	@FindBy(xpath = "//a[@id='kwGh-travelers']//div[@class='label']")
	private WebElement classTrevels;
	private WebElement buttonSearch;

	public MainPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void findTickets(String from, String to, String date, String typeTrip) {
		textBoxFrom = driver.findElement(By.name("origin"));
		textBoxTo = driver.findElement(By.name("destination"));
		radioButtonOneWay = driver.findElement(By.id("EhWF-oneway-label"));
		radionButtonRoundTrip = driver.findElement(By.id("EhWF-roundtrip-label"));
		textBoxDate = driver.findElement(By.id("EhWF-depart-input"));
		buttonSearch = driver.findElement(By.id("EhWF-submit"));

		textBoxFrom.sendKeys(from);
		textBoxTo.sendKeys(to);
		if (typeTrip.equals("One-way")) {
			radioButtonOneWay.isSelected();
		} else {
			radionButtonRoundTrip.isSelected();
		}
		textBoxDate.sendKeys(date);

		buttonSearch.click();
	}

	public void findTickets(String from, String to, String date, String typeTrip, String typeFly) {
		textBoxFrom = driver.findElement(By.name("origin"));
		textBoxTo = driver.findElement(By.name("destination"));
		radioButtonOneWay = driver.findElement(By.id("EhWF-oneway-label"));
		radionButtonRoundTrip = driver.findElement(By.id("EhWF-roundtrip-label"));
		textBoxDate = driver.findElement(By.id("EhWF-depart-input"));
		buttonSearch = driver.findElement(By.id("EhWF-submit"));

		textBoxFrom.sendKeys(from);
		textBoxTo.sendKeys(to);
		if (typeTrip.equals("One-way")) {
			radioButtonOneWay.isSelected();
		} else {
			radionButtonRoundTrip.isSelected();
		}
		textBoxDate.sendKeys(date);
		classTrevels.sendKeys(typeFly);

		buttonSearch.click();
	}

	public void changeLanguage() {
		changeLanguage = driver.findElement(By.id("HYot-CountryPicker-dropdown"));

	}

	public boolean isWork() {
		String url = driver.getCurrentUrl();
		return BASE_URL.equals(url) ? false : true;
	}
}
