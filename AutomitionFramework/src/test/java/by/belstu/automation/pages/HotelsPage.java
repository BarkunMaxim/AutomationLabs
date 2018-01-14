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
		
	}

}
