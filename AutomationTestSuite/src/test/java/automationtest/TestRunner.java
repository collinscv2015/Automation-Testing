package automationtest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModule.Create_Content;
import appModule.addImageToCanvas;
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

	Create_Content.New_Content(driver);
	System.out.println("Successfully, Created New Message and Variant.");

	addImageToCanvas.imageWidget(driver);
	System.out.println("Successfully, Added Image.");

	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();

	}
}
