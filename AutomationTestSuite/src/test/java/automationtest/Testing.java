package automationtest;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing {
  private WebDriver driver;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get("http://test.per.smartfocus.com/#/");
    driver.findElement(By.xpath("//div[@id='site-wrapper']/header/nav/ul/li[3]/ul/li[8]/a/span")).click();
    driver.findElement(By.cssSelector("button.dropdown-toggle.btn")).click();
    driver.findElement(By.linkText("Message")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("button.close")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("New Message", driver.findElement(By.cssSelector("h4.modal-title")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Name", driver.findElement(By.cssSelector("label.form-field-label > span")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.name("name")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Description", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div/div/form/section/div[2]/label/span")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.name("description")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Content", driver.findElement(By.cssSelector("h3.form-section-title > span")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Canvas Width", driver.findElement(By.cssSelector("div.form-field-group.col-2 > div.form-field > label.form-field-label > span")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.name("width")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//section[2]/div/div/div/span")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Canvas Height", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div/div/form/section[2]/div/div[2]/label/span")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.name("height")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//div/div[2]/div/span")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Cancel", driver.findElement(By.xpath("//div/button[2]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Create", driver.findElement(By.xpath("//footer/div/button")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
}
