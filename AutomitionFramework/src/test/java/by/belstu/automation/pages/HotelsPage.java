package by.belstu.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelsPage extends AbstractPage{
	
	private WebElement hotelsSearchButton;
	private WebElement destinationTo;

	public HotelsPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
		throw new UnsupportedOperationException();
	}

	public WebElement findSearchHotelButton() {
		hotelsSearchButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[3]/form/div[6]/a/span/span"));
		return hotelsSearchButton;
		
	}
	
	public void fillInHotelsForm(String to) {
		destinationTo = driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[3]/form/div[3]"));
		destinationTo.click();
		destinationTo.sendKeys(to);
		WebElement tickButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[3]/form/div[4]/label/a/input"));
		tickButton.click();
		hotelsSearchButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[3]/form/div[6]/a/span/span"));
		hotelsSearchButton.click();
	}
	
	public boolean checkCurrentHotel(String city) {
		WebElement nameCity = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[5]/div[2]/div[1]/h1"));
		return city.equals(nameCity.getText()) ? false : true;
	}

}
