package content.Widget;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class paragraphWidget {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testParagraph() throws Exception {
    driver.get("http://test.per.smartfocus.com/#/content/xkOU20EpE6LSS3CNSeFb/OaAGnDRGDZED9irxZHlo");
	
		Thread.sleep(2000);
	    WebElement elementToMoveText =   driver.findElement(By.cssSelector("span.element-icon.type-textblock"));
	    Thread.sleep(3000);
	    
	    WebElement moveToText =     driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div"));
	    Actions dragAndDrop = new Actions(driver);
	    Action action = dragAndDrop.dragAndDrop(elementToMoveText, moveToText).build();
	    action.perform();
	    Thread.sleep(5000);   
	
	
    // Paragraph Widget Icon
    try {
      assertTrue(isElementPresent(By.cssSelector("span.element-icon.type-textblock")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Paragraph Widget Name
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[3]/div/div/div/div/div/div/span[3]/span/span[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Paragraph Widget Name In Object Panel
    try {
      assertEquals("Paragraph", driver.findElement(By.cssSelector("a.directory-item-title.type-layer > span")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Veriy Paragraph Widget Name Appear In Property Header Section
    try {
      assertEquals("Paragraph", driver.findElement(By.cssSelector("h2.panel-header-title")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Paragraph Widget Hint
    try {
      assertEquals("The 'Paragraph' widget allows you to add multiple lines of text to your content.", driver.findElement(By.cssSelector("div.hint")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // 'Content Section'
    try {
      assertEquals("Content", driver.findElement(By.cssSelector("h3.form-section-title")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Veify "Flag Icon" Present
    try {
      assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[3]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Verify "Text" Present in content 'section'
    try {
      assertEquals("Text", driver.findElement(By.cssSelector("label.form-field-label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Input Text Data Intp Text Box
    driver.findElement(By.name("text")).clear();
    driver.findElement(By.name("text")).sendKeys("The 'Paragraph' widget allows you to add multiple lines of text to your content.");
    try {
      assertEquals("The 'Paragraph' widget allows you to add multiple lines of text to your content.", driver.findElement(By.name("text")).getAttribute("value"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Verify "Text Transform" Present in content 'section'
    try {
      assertEquals("Text Transform", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section/div[3]/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Verify "Text Transform" Drop Down Present
    try {
      assertTrue(isElementPresent(By.name("textTransform")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    new Select(driver.findElement(By.name("textTransform"))).selectByVisibleText("Capitalize");
    new Select(driver.findElement(By.name("textTransform"))).selectByVisibleText("Uppercase");
    new Select(driver.findElement(By.name("textTransform"))).selectByVisibleText("Lowercase");
    new Select(driver.findElement(By.name("textTransform"))).selectByVisibleText("None");
    // 'Typography Section'
    try {
      assertEquals("Typography", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/header/h3")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Verify "Typeface" Present in Typography 'section'
    try {
      assertEquals("Typeface", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Verify "Typeface" Drop Down Present
    try {
      assertTrue(isElementPresent(By.name("fontFamily")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Arial");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Arial Black");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Comic Sans MS");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Courier New");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Georgia");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Helvetica");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Impact");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Lato");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Lucida Console");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Lucida Sans");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Palatino Linotype");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Proxima Nova");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Source Sans Pro");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Tahoma");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Times");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Trebuchet");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Verdana");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Aller");
    // Verify "Size" Present in Typography 'section'
    try {
      assertEquals("Size", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[2]/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Verify "size" Text Box Present with default Value 14
    try {
      assertEquals("14", driver.findElement(By.name("fontSize")).getAttribute("value"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Verify "Line Height" Present in Typography 'section'
    try {
      assertEquals("Line Height", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[3]/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Verify "Line Height" Text Box Present with default Value 14
    try {
      assertEquals("14", driver.findElement(By.name("lineHeight")).getAttribute("value"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Verify "Font Style" Present in Typography 'section'
    try {
      assertEquals("Font Style", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[4]/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("button.btn.btn-default")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[4]/div/div/div/button[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[4]/div/div/div/button[3]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[4]/div/div/div/button[4]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Verify "Horizontal Alignment" Present in Typography 'section'
    try {
      assertEquals("Horizontal Alignment", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[5]/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[5]/div/div/div/button")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[5]/div/div/div/button[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[5]/div/div/div/button[3]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[5]/div/div/div/button[4]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // 'Style Section'
    try {
      assertEquals("Style", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/header/h3")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Background Color", driver.findElement(By.cssSelector("div.form-field-group.col-2 > div.form-field > label.form-field-label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("div.color-preview")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Transparency", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div/div[2]/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div/div[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("div.handle.handle-0")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Text Color", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div[2]/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div[2]/div/div/div/div")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Transparency", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div[2]/div[2]/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div[2]/div[2]/div")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div[2]/div[2]/div/div")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // 'Border Style Section'
    try {
      assertTrue(isElementPresent(By.name("borderStyle")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    new Select(driver.findElement(By.name("borderStyle"))).selectByVisibleText("Dotted");
    new Select(driver.findElement(By.name("borderStyle"))).selectByVisibleText("Dashed");
    new Select(driver.findElement(By.name("borderStyle"))).selectByVisibleText("None");
    new Select(driver.findElement(By.name("borderStyle"))).selectByVisibleText("Solid");
    try {
      assertEquals("Border Color", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div[4]/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div[4]/div/div/div/div")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Border Width", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div[4]/div[2]/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("1", driver.findElement(By.name("borderWidth")).getAttribute("value"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Border Radius", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div[5]/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("0", driver.findElement(By.name("borderRadius")).getAttribute("value"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Layout section
    try {
      assertEquals("Layout", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/header/h3")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Left", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/div/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.name("positionX")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Top", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/div/div[2]/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.name("positionY")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Width", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/div[2]/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.name("sizeX")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Height", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/div[2]/div[2]/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.name("sizeY")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Horizontal Padding", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/div[3]/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.name("paddingX")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Vertical Padding", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/div[3]/div[2]/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.name("paddingY")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Element Angle", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/div[4]/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.name("rotation")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Element session
    try {
      assertEquals("Element", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[5]/header/h3")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Paragraph", driver.findElement(By.name("name")).getAttribute("value"));
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