package by.belstu.automation.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSingelton {
	
	private static WebDriver driver;

	//private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    //private static final String CHROMEDRIVER_CHROMEDRIVER_EXE_PATH = ".\\src\\test\\ChromeDriver\\chromedriver.exe";
    private static final String WEBDRIVER_NAME = "webdriver.gecko.driver";
    private static final String WEBDRIVER_PATH = ".\\src\\test\\resourses\\geckodriver\\geckodriver.exe";
    private static final int TIMEOUT = 10;
    
   private DriverSingelton() {}
   
   public static WebDriver getDriver() {
	   if(null == driver) {
		   System.setProperty(WEBDRIVER_NAME, WEBDRIVER_PATH);
		   driver = new FirefoxDriver();
		   driver.manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		 //  driver.manage().window().maximize();
	   }
	   return driver;
   }
   
   public static void closeDriver() { 
	   driver.quit();
   }
    
}
