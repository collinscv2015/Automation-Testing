package content.Widget;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class VariantWindow {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled4() throws Exception {
    driver.get("http://qa.per.smartfocus.com/#/content/2pf4hqzRLr7J1RooXMY3");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("button.dropdown-toggle.btn")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Variant")).click();
    Thread.sleep(3000);
    
    Thread.sleep(3000);
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
    String current = "C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\ActualVariantWindow.png";
    FileUtils.copyFile(scrFile, new File(current));
    Thread.sleep(3000);
    
    File fileInput = new File("C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\ExpectedVariantWindow.png");
    Thread.sleep(2000);
    File fileOutPut = new File("C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\ActualVariantWindow.png");
    Thread.sleep(2000);

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
    Assert.assertTrue(matchFlag, "Images are not same");    
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
