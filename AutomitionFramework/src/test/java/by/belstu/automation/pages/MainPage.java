package by.belstu.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends AbstractPage {

	private final String BASE_URL = "https://global.cheapflights.com";

	private WebElement changeLanguage;
	private WebElement textBoxFrom;
	private WebElement textBoxTo;
	private List<WebElement> radioButtonOneWayList;
	private WebElement radioButtonOneWay;
	private List<WebElement> radionButtonRoundTripList;
	private WebElement radionButtonRoundTrip;
	private WebElement textBoxDateStart;
	private WebElement textBoxDateEnd;
	
	private WebElement hotelsLink;
	
	@FindBy(xpath = "//a[@id='kwGh-travelers']//div[@class='label']")
	private WebElement classTrevels;
	
	private WebElement buttonSearch;

	public MainPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
	}
	
	public void openHotelsPage() {
		
		hotelsLink = driver.findElement(By.xpath("/html/body/div/div[1]/div[5]/div[2]/div/div[1]/div[2]/div/div/div/div/div[1]/div[2]/a"));
		hotelsLink.click();
	}

	////*[@id="V5tV-oneway-label"]
	public void findTickets(String from, String to, String dateStart, String dateEnd, String typeTrip) throws InterruptedException {
		textBoxFrom = driver.findElement(By.name("origin"));
		textBoxTo = driver.findElement(By.name("destination"));
		//radioButtonOneWay = driver.findElement(By.id("EhWF-oneway-label"));
		//radioButtonOneWayList = driver.findElements(By.xpath("//*[@id='V5tV-oneway-label']"));
		//radioButtonOneWay = radioButtonOneWayList.get(0);
		
		//radionButtonRoundTrip = driver.findElement(By.id("EhWF-roundtrip-label"));
		//radionButtonRoundTripList = driver.findElements(By.xpath("//*[@id=\'V5tV-roundtrip-label\']/span"));
		//radionButtonRoundTrip = radionButtonRoundTripList.get(0);
		
		//textBoxDate = driver.findElement(By.id("EhWF-depart-input"));
		textBoxDateStart = driver.findElement(By.xpath("//div[@class='col-start']/div/div[@aria-label='Departure date input']"));
		textBoxDateEnd = driver.findElement(By.xpath("//div[@class='col-end']/div/div/div[@aria-label='Return date input']"));
		//buttonSearch = driver.findElement(By.id("EhWF-submit"));
		buttonSearch = driver.findElement(By.xpath("//div[@class='fieldBlock buttonBlock']/button"));

		textBoxFrom.clear();
		textBoxFrom.sendKeys(from);
		textBoxTo.clear();
		textBoxTo.sendKeys(to);
		//addCharacter(textBoxFrom, from);
		//addCharacter(textBoxTo, to);
		
		if (typeTrip.equals("One-way")) {
	//		radioButtonOneWay.isSelected();
		} else {
			//radionButtonRoundTrip.isSelected();
		}
		textBoxDateStart.click();
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("document.documentElement.value=" + dateStart, textBoxDateStart);
		//js.executeScript("alert('Hello');");
		//textBoxDateStart.click();
		//textBoxDateStart.sendKeys(dateStart);
		//JavascriptExecutor js2 =  (JavascriptExecutor)driver;
		//textBoxDateEnd.click();
	//	js.executeScript("document.documentElement.value=" + dateEnd, textBoxDateEnd);
		//textBoxDateEnd.click();
		//textBoxDateEnd.sendKeys(dateEnd);

		//Thread.sleep(50000);
		
		WebElement el = driver.findElement(By.className("flightsVisible"));
		el.click();
		//WebDriverWait waitClicable = new WebDriverWait(driver, 10); 
	//	waitClicable.until(ExpectedConditions.elementToBeClickable(buttonSearch));
		buttonSearch.click();
		
	}
	
	protected void addCharacter(WebElement element, String keys) {
	    for (int i = 0; i < keys.length(); i++){
	        element.sendKeys(Character.toString(keys.charAt(i)));
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.attributeContains(element, "value", keys.substring(0, i)));
	    }
	}

	/*public void findTickets(String from, String to, String date, String typeTrip, String typeFly) {
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
	}*/

	public void changeLanguage() {
		changeLanguage = driver.findElement(By.xpath("//*[@class=\"Common-Widgets-Dropdown-DropdownDialog CountryPicker-dropdown DropDown size-m\"]"));
		changeLanguage.click();
		WebElement chooseLanguage = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/a[2]"));
		chooseLanguage.click();
	}

	public boolean isWork() {
		String url = driver.getCurrentUrl();
		return BASE_URL.equals(url) ? false : true;
	}
}
