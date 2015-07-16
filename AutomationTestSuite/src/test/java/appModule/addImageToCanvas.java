package appModule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import pageObjects.imageWidget;

public class addImageToCanvas {
	
	  public static void imageWidget(WebDriver driver) throws Exception{
	
	
    WebElement elementToMoveImage =imageWidget.Image_Icon(driver);
    Thread.sleep(3000);

    WebElement moveToImage = imageWidget.Canvas(driver);
    Actions dragAndDropImage = new Actions(driver);
    Action actionImage = dragAndDropImage.dragAndDrop(elementToMoveImage, moveToImage).build();
    actionImage.perform();
    

    assertTrue(isElementPresent(imageWidget.Image_Icon(driver)));
		String imagename = imageWidget.Widget_Name(driver).getText();
		assertEquals("Image", imagename);
		System.out.println("Widget Name is: "+imagename);

    
//    driver.findElement(By.name("positionX")).clear();
//    driver.findElement(By.name("positionX")).sendKeys("10");
//    driver.findElement(By.name("positionY")).clear();
//    driver.findElement(By.name("positionY")).sendKeys("10");
//    driver.findElement(By.name("sizeX")).clear();
//    driver.findElement(By.name("sizeX")).sendKeys("300");
//    driver.findElement(By.name("sizeY")).clear();
//    driver.findElement(By.name("sizeY")).sendKeys("200");
//   
//    driver.findElement(By.name("qqfile")).click();
//  
//    Thread.sleep(3000);
//    
//  setClipboardData("C:\\Users\\collins.obasuyi\\Desktop\\images\\profile_1_1.jpg");
//  Thread.sleep(9000);
// 
//  Robot robot = new Robot();
//  robot.keyPress(KeyEvent.VK_CONTROL);
//  robot.keyPress(KeyEvent.VK_V);
//  robot.keyRelease(KeyEvent.VK_V);
//  robot.keyRelease(KeyEvent.VK_CONTROL);
//  robot.keyPress(KeyEvent.VK_ENTER);
//  robot.keyRelease(KeyEvent.VK_ENTER);
//  Thread.sleep(6000);
 
}

 private static boolean isElementPresent(WebElement image_Icon) {
		return false;
	}

private static void setClipboardData(String string) {
 StringSelection stringSelection = new StringSelection(string);
 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			
		}
		
		
	}

