package automationtest;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.testng.Assert;

public class dom {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

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
    
//    String bgcolor = driver.findElement(By.cssSelector("#f3d7353d-d158-4b88-8f7d-779ed7e6869d > #f3d7353d-d158-4b88-8f7d-779ed7e6869d")).getCssValue("background-color");
//    Thread.sleep(5000);
//    System.out.println(bgcolor);
//    
//    String textcolor = driver.findElement((By.cssSelector("#f3d7353d-d158-4b88-8f7d-779ed7e6869d > #f3d7353d-d158-4b88-8f7d-779ed7e6869d"))).getCssValue("color");
//    Thread.sleep(15000);
//    System.out.println(textcolor);
    
    
    Thread.sleep(10000);
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 // Now you can do whatever you need to do with it, for example copy somewhere
    
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
    Assert.assertTrue(matchFlag, "Images are not same");    
 }
    
    
 // Compare the images
    //boolean compareSuccess = dom2.compareImages("C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\screenshot.png", current, "C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\screenshot.png");
   // System.out.println(compareSuccess);
 //FileUtils.copyFile(scrFile, new File("C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\screenshot.png"));
    
    
    
  

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
