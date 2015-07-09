package automationtest;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demod {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testImage() throws Exception {
    driver.get("http://test.per.smartfocus.com//#/content/sIMcGgkorOcKYi1nNozF/IjbfX122bQHICK1SlaHd");
    // Image Icon
    try {
      assertTrue(isElementPresent(By.cssSelector("span.element-icon.type-image")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Widget Name
    try {
      assertEquals("Image", driver.findElement(By.cssSelector("span.element-name")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    
    Thread.sleep(2000);
    
    WebElement elementToMoveImage =driver.findElement(By.cssSelector("span.element-icon.type-image"));
    Thread.sleep(3000);

    WebElement moveToImage =     driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div"));
    Actions dragAndDropImage = new Actions(driver);
    Action actionImage = dragAndDropImage.dragAndDrop(elementToMoveImage, moveToImage).build();
    actionImage.perform();
    
    Thread.sleep(2000);
    
    // Image Appear in Objects Direcotory Items Panel
    try {
      assertEquals("Image", driver.findElement(By.cssSelector("a.directory-item-title.type-layer > span")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Image Widget Name In Panel Header
    try {
      assertEquals("Image", driver.findElement(By.cssSelector("h2.panel-header-title")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Hint and Information about the widget
    try {
      assertEquals("The 'Image' widget allows you to add an image to your content.", driver.findElement(By.cssSelector("div.hint")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Contents Section UI Element
    try {
      assertEquals("Content", driver.findElement(By.cssSelector("h3.form-section-title")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Image Form Field Label
    try {
      assertEquals("Image", driver.findElement(By.cssSelector("label.form-field-label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Default Image Icon
    try {
      assertTrue(isElementPresent(By.cssSelector("div.image > img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Link Section UI Element
    try {
      assertEquals("Link", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/header/h3")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Show Link
    try {
      assertEquals("Show Link", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div/div/div/label/span[2]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Click Show Link Checkbox
    driver.findElement(By.name("isClickable")).click();
    // Website Link
    try {
      assertEquals("Website Link", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[2]/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // URL Text box 
    try {
      assertTrue(isElementPresent(By.name("url")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Style Section UI Element
    try {
      assertEquals("Style", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/header/h3")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Border Style
    
    new Select(driver.findElement(By.name("borderStyle"))).selectByVisibleText("Dotted");
    new Select(driver.findElement(By.name("borderStyle"))).selectByVisibleText("None");
    new Select(driver.findElement(By.name("borderStyle"))).selectByVisibleText("Dashed");
    new Select(driver.findElement(By.name("borderStyle"))).selectByVisibleText("Solid");
    
    
    // Click Background Color
    driver.findElement(By.cssSelector("div.color-preview")).click();
    // Colour Picker Present
    try {
      assertTrue(isElementPresent(By.cssSelector("div.background")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    
    
    //Border Width
    try {
        assertEquals("1", driver.findElement(By.name("borderWidth")).getAttribute("value"));
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }
    
    
    // Color Picker Slider
    try {
      assertTrue(isElementPresent(By.cssSelector("div.track")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Type", driver.findElement(By.cssSelector("div.c-form > div.form-field-group > div.form-field > label.form-field-label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    
    try {
      assertEquals("H", driver.findElement(By.cssSelector("div.form-field-group.col-3 > div.form-field > label.form-field-label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.cssSelector("div.form-field-group.col-3 > div.form-field > input.form-control.input")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("S", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div[2]/div[4]/div/div[2]/div/div[3]/div[2]/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("(//input[@value='0'])[2]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("V", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div[2]/div[4]/div/div[2]/div/div[3]/div[3]/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertTrue(isElementPresent(By.xpath("(//input[@value='0'])[3]")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Layout Section UI Element
    try {
      assertEquals("Layout", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/header/h3")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Left
    try {
      assertEquals("Left", driver.findElement(By.cssSelector("div.form-field-group.col-2 > div.form-field > label.form-field-label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Left Positioning Text Box
    try {
      assertTrue(isElementPresent(By.name("positionX")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Top
    try {
      assertEquals("Top", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/div/div[2]/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Top Positioning Text Box
    try {
      assertTrue(isElementPresent(By.name("positionY")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Width
    try {
      assertEquals("Width", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/div[2]/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Width Positioning Text Box
    try {
      assertTrue(isElementPresent(By.name("sizeX")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Height
    try {
      assertEquals("Height", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/div[2]/div[2]/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Height Positioning Text Box
    try {
      assertTrue(isElementPresent(By.name("sizeY")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Element Section UI Element
    try {
      assertEquals("Element", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[5]/header/h3")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Element Name
    try {
      assertEquals("Element Name", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[5]/div/div/label")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    // Element Text Box With Default Value Image
    try {
      assertEquals("Image", driver.findElement(By.name("name")).getAttribute("value"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("h2.panel-header-title")).getText();
    driver.findElement(By.name("name")).getText();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
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
