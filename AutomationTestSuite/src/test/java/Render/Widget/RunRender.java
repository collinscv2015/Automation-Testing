package Render.Widget;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunRender {
	protected WebDriver driver;


	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(EnviromentURL.ImageContent_URL);
	}

	@Test
	public void ExecuteTestCase() throws Exception {

	imagerender.imageWidget(driver);
	System.out.println("Successfully, Created New Message and Variant.");

	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();

	}
}
