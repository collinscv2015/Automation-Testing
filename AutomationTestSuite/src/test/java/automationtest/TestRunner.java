package automationtest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModule.CreateMessage;
import appModule.CreateVariant;
import appModule.EditMessage;
import utility.EnviromentURL;


public class TestRunner {
	protected WebDriver driver;


	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(EnviromentURL.QA_URL);
		driver.getTitle();
		driver.getCurrentUrl();
	}

	@Test
	public void ExecuteTestCase() throws Exception {

//	CreateMessage.NewMessage(driver);
//	System.out.println("Successfully, Created New Message.");
//	
//	CreateVariant.NewVariant(driver);
//	System.out.println("Successfully, Created New Variant.");
	
	EditMessage.NewMessage(driver);
	System.out.println("Successfully, Created New Message.");

	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();

	}
}
