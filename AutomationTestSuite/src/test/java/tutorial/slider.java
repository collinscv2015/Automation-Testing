

package tutorial;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

public class slider {
  private WebDriver driver;
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled3() throws Exception {
     
	   driver.get("http://jqueryui.com/slider/");
	   Thread.sleep(5000);

		    WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
		       Actions move = new Actions(driver);
		        Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
		        action.perform();

		}
  

  @After
  public void tearDown() throws Exception {
    driver.quit();

  }
}
