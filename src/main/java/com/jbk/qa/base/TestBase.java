package com.jbk.qa.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase extends Base {
	
	/*
	@BeforeSuite
	public void initialiseExtentReport() {
		
	}
	*/

	public static WebDriver driver;
//logger
	@BeforeMethod
	public void openBrowser() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",currDir+"/src/main/java/com/driver/chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "");

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(WebEventListener.page_Load_Time, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(WebEventListener.implicit_Wait, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
		System.out.println();
	}

	@AfterMethod
	public void closeBrowser() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}

}
