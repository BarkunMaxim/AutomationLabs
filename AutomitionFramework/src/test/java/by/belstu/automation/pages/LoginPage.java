package by.belstu.automation.pages;

import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {

	private final String BASE_URL = "https://global.cheapflights.com";

	private WebElement buttonSignIn;
	private WebElement inputLogin;
	private WebElement inputPassword;
	private WebElement buttonSubmit;

	private WebElement hotelsLink;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void login(String login, String password) {
		inputLogin = driver.findElement(By.xpath("//*[@id='loginUsername']"));
		inputLogin.sendKeys(login);
		inputPassword = driver.findElement(By.xpath("//*[@id=\"loginPassword\"]"));
		inputPassword.sendKeys(password);
		buttonSubmit = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/form/button"));
		buttonSubmit.click();
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
		hotelsLink = driver.findElement(By.xpath("/html/body/div/div[1]/div[5]/div[2]/div/div[1]/div[2]/div/div/div/div/div[1]/div[2]/a"));
		hotelsLink.click();
		buttonSignIn = driver.findElement(By.xpath("/html/body/div[4]/div[1]/header/div[1]/div/div/section[2]/a[2]"));
		buttonSignIn.click();
	}

	public boolean isLogin(String userName) {
		WebElement myAccountElement = driver.findElement(By.xpath("//*[@id=\"my-account-menu\"]"));
		myAccountElement.click();
		WebElement userNameElement = driver.findElement(By.xpath("/html/body/div[18]/div/div/div/div/div[2]/span/span[2]"));
		String tempName = userNameElement.getText();
		WebElement logOut = driver.findElement(By.xpath("/html/body/div[17]/div/div/div/div/div[2]/a"));
		logOut.click();
		return userName.equals(tempName) ? false : true;
	}
}
