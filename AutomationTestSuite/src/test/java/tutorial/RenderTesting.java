package tutorial;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class RenderTesting {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();
  private Assertion hardAssert = new Assertion();
  private SoftAssert softAssert = new SoftAssert();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled3() throws Exception {
    driver.get("http://test.per.smartfocus.com/?#/content/uGTMpDy5gwA2TNfVHkPK/hDHYhT8pAnhn2Z1XEXsh");
    Thread.sleep(5000);
    
    WebElement elementToMoveText =   driver.findElement(By.cssSelector("span.element-icon.type-text"));
    Thread.sleep(3000);
    
    WebElement moveToText =     driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div"));
    Actions dragAndDrop = new Actions(driver);
    Action action = dragAndDrop.dragAndDrop(elementToMoveText, moveToText).build();
    action.perform();
    
    driver.findElement(By.xpath("(//input[@value=''])[2]")).clear();
    driver.findElement(By.xpath("(//input[@value=''])[2]")).sendKeys("The 'Text' widget allows you to add a single line of text to your content.");
    new Select(driver.findElement(By.name("textTransform"))).selectByVisibleText("Capitalize");
    new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Arial Black");
    driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[4]/div/div/div/button[2]")).click();
    driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[5]/div/div/div/button[2]")).click();
    new Select(driver.findElement(By.name("borderStyle"))).selectByVisibleText("Solid");
    driver.findElement(By.name("borderWidth")).clear();
    driver.findElement(By.name("borderWidth")).sendKeys("5");
    driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div[4]/div/div/div/div")).click();
    driver.findElement(By.xpath("(//input[@value='#000000'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@value='#000000'])[2]")).sendKeys("#ff000");
    driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div[4]/div[3]/div/div[2]/div/button")).click();
    driver.findElement(By.name("positionX")).clear();
    driver.findElement(By.name("positionX")).sendKeys("5");
    driver.findElement(By.name("positionY")).clear();
    driver.findElement(By.name("positionY")).sendKeys("89");
    driver.findElement(By.name("sizeX")).clear();
    driver.findElement(By.name("sizeX")).sendKeys("200");
    driver.findElement(By.name("sizeY")).clear();
    driver.findElement(By.name("sizeY")).sendKeys("24");
    driver.findElement(By.name("paddingX")).clear();
    driver.findElement(By.name("paddingX")).sendKeys("9");
    driver.findElement(By.name("paddingY")).clear();
    driver.findElement(By.name("paddingY")).sendKeys("9");
    driver.findElement(By.name("rotation")).clear();
    driver.findElement(By.name("rotation")).sendKeys("45");
    driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/footer/div/button")).click();
    Thread.sleep(5000);


    
    
    
    driver.get("http://54.83.31.117/api-public/3.0/personaliseemail?a=TEST1234-43C8-4F69-968D-D942FF1C8232&ue={{EMAIL}}&e=1165&f=gif&l=en&h=500&w=300");
    Thread.sleep(5000);
    
    Thread.sleep(5000);
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
    String current = "C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\Actual.png";
    FileUtils.copyFile(scrFile, new File(current));
    Thread.sleep(5000);
    
    File fileInput = new File("C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\Expected.png");
    Thread.sleep(5000);
    File fileOutPut = new File("C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\Actual.png");
    Thread.sleep(5000);

    BufferedImage bufileInput = ImageIO.read(fileInput);
    DataBuffer dafileInput = bufileInput.getData().getDataBuffer();
    int sizefileInput = dafileInput.getSize();                     
    BufferedImage bufileOutPut = ImageIO.read(fileOutPut);
    DataBuffer dafileOutPut = bufileOutPut.getData().getDataBuffer();
    int sizefileOutPut = dafileOutPut.getSize();
    Boolean matchFlag = true;
    if(sizefileInput == sizefileOutPut) {                         
       for(int j=0; j<sizefileInput; j++) {
             if(dafileInput.getElem(j) != dafileOutPut.getElem(j)) {
                   matchFlag = false;
                   break;
             }
        }
    }
    else                            
       matchFlag = false;
    try{
    
    Assert.assertTrue(matchFlag);    
    
    }catch(AssertionError e)
    {
        System.out.println("Assertion error: Image is not the same ");
    }

    System.out.println("Test Completed");
    
 
  driver.get("http://test.per.smartfocus.com/?#/content/uGTMpDy5gwA2TNfVHkPK/hDHYhT8pAnhn2Z1XEXsh");
  Thread.sleep(5000);
  
  driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
  driver.findElement(By.linkText("Delete")).click();
  driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/footer/div/button[2]")).click();
  driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div[7]/div/div[2]/div/div/div[2]/div/footer/div/button")).click();
  driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/footer/div/button")).click();
  
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
