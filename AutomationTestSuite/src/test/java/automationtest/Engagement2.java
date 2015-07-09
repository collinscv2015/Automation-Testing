package automationtest;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

public class Engagement2 {
	protected WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
    @Test
    public void test() throws InterruptedException, AWTException{

		 
        driver.get("http://test.per.smartfocus.com/?#/");
        driver.findElement(By.xpath("//li[8]/a/span")).click();
        driver.findElement(By.cssSelector("button.dropdown-toggle.btn")).click();
        driver.findElement(By.cssSelector("a.directory-action.type-message > span")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("E2E Engagement");
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("description")).sendKeys("E2E Engagement New Message Description");
        driver.findElement(By.name("width")).clear();
        driver.findElement(By.name("width")).sendKeys("400");
        driver.findElement(By.name("height")).clear();
        driver.findElement(By.name("height")).sendKeys("400");
        driver.findElement(By.xpath("//footer/div/button")).click();
        
        
        
        driver.findElement(By.cssSelector("button.dropdown-toggle.btn")).click();
        driver.findElement(By.cssSelector("a.directory-action.type-variant > span")).click();
        driver.findElement(By.cssSelector("h4.modal-title")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("E2E Engagement New Variant");
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("description")).sendKeys("E2E Engagement New Variant Description");
        
        
//        Select dropdown = new Select(driver.findElement(By.name("algorithm")));
//        dropdown.selectByVisibleText("Brand affinity");
//        new Select(driver.findElement(By.name("algorithm"))).selectByVisibleText("Last viewed");
//        new Select(driver.findElement(By.name("algorithm"))).selectByVisibleText("Product affinity");
//
Thread.sleep(2000);
        
driver.findElement(By.xpath("//div[2]/div/div/div[2]/div/footer/div/button")).click();
Thread.sleep(2000);
 
        WebElement elementToMoveImage =driver.findElement(By.cssSelector("span.element-icon.type-image"));
        Thread.sleep(3000);

        WebElement moveToImage =     driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div"));
        Actions dragAndDropImage = new Actions(driver);
        Action actionImage = dragAndDropImage.dragAndDrop(elementToMoveImage, moveToImage).build();
        actionImage.perform();
        

       // driver.findElement(By.xpath("//img")).click();
        
        driver.findElement(By.name("positionX")).clear();
        driver.findElement(By.name("positionX")).sendKeys("10");
        driver.findElement(By.name("positionY")).clear();
        driver.findElement(By.name("positionY")).sendKeys("10");
        driver.findElement(By.name("sizeX")).clear();
        driver.findElement(By.name("sizeX")).sendKeys("300");
        driver.findElement(By.name("sizeY")).clear();
        driver.findElement(By.name("sizeY")).sendKeys("200");
       
        driver.findElement(By.name("qqfile")).click();
      
        Thread.sleep(3000);
        
      setClipboardData("C:\\Users\\collins.obasuyi\\Desktop\\images\\profile_1_1.jpg");
      Thread.sleep(9000);
     
      Robot robot = new Robot();
      robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);
      Thread.sleep(6000);
   
      /////////
      WebElement elementToMoveText =   driver.findElement(By.cssSelector("span.element-icon.type-text"));
      Thread.sleep(3000);
      
      WebElement moveToText =     driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div"));
      Actions dragAndDrop = new Actions(driver);
      Action action = dragAndDrop.dragAndDrop(elementToMoveText, moveToText).build();
      action.perform();
      
      driver.findElement(By.xpath("(//input[@value=''])[2]")).sendKeys("E2E Engagement Test Text Drag");
      Thread.sleep(3000);
      
      
      new Select(driver.findElement(By.name("fontFamily"))).selectByVisibleText("Verdana");
      driver.findElement(By.name("positionX")).clear();
      driver.findElement(By.name("positionX")).sendKeys("20");
      Thread.sleep(3000);
      
      driver.findElement(By.name("positionY")).clear();
      driver.findElement(By.name("positionY")).sendKeys("220");
      Thread.sleep(3000);
      
      driver.findElement(By.name("sizeX")).clear();
      driver.findElement(By.name("sizeX")).sendKeys("240");
      Thread.sleep(3000);
      
      driver.findElement(By.name("sizeY")).clear();
      driver.findElement(By.name("sizeY")).sendKeys("24");
      Thread.sleep(3000);
      
      driver.findElement(By.xpath("//footer/div/button")).click();
      Thread.sleep(3000);
      
      
      
      /////////////////

    {
        driver.get("http://qa.per.smartfocus.com/#/filters/segment");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button.dropdown-toggle.btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Audience")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("h4.modal-title")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("E2E New Audience");
        new Select(driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div/div/form/section[2]/div/table/tbody/tr/td/div/select"))).selectByVisibleText("Gender");
        new Select(driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div/div/form/section[2]/div/table/tbody/tr/td[2]/div/select"))).selectByVisibleText("Equal To");
        new Select(driver.findElement(By.name("value"))).selectByVisibleText("Female");
        new Select(driver.findElement(By.name("value"))).selectByVisibleText("Male");
        driver.findElement(By.xpath("//footer/div/button")).click();
        Thread.sleep(3000);
      }
      
      
      /////////////////////////////
    
    
    //////////////////////////////////////////
    
    {
        driver.get("http://qa.per.smartfocus.com/#/campaigns");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button.dropdown-toggle.btn")).click();
        driver.findElement(By.cssSelector("a.directory-action.type-campaign > span")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("E2E New Engagement");
        driver.findElement(By.xpath("//footer/div/button")).click();
        driver.findElement(By.cssSelector("button.dropdown-toggle.btn")).click();
        driver.findElement(By.linkText("Email Event")).click();
        driver.findElement(By.cssSelector("h4.modal-title")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("E2E New Email Event");
        new Select(driver.findElement(By.name("advisorMessageId"))).selectByVisibleText("E2E Engagement");
        driver.findElement(By.xpath("//footer/div/button")).click();
        driver.findElement(By.cssSelector("button.btn.node-criteria-groups-action")).click();
        driver.findElement(By.linkText("E2E Engagement New Variant")).click();
        driver.findElement(By.cssSelector("div.modal-body > div[name=\"surface\"] > footer.surface-footer > div.surface-footer-actions > button.btn.surface-footer-action")).click();
      
          assertEquals("E2E Engagement", driver.findElement(By.cssSelector("span.message > strong")).getText());
     
          assertEquals("E2E Engagement New Variant", driver.findElement(By.cssSelector("span.variant")).getText());
    
          assertEquals("Please publish this event to get the HTML snippet", driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/span[2]")).getText());
   
        driver.findElement(By.xpath("//footer/div/button")).click();
        driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div/div/div/div/div/div/button")).click();
        String HTMLSNIPPET = driver.findElement(By.name("html")).getAttribute("value");
        System.out.print(HTMLSNIPPET);
      }
    
    ////////////////////////////////


    }

	private void setClipboardData(String string) {
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
	}
	
	
	
	
	@After
	public void tearDown1() throws Exception {
	 // driver.quit();
	
}
}
