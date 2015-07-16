package Render.Widget;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import Render.Widget.screencapture;

public class imagerender {
	
	

	public static void imageWidget(WebDriver driver) throws Exception {


		
		WebElement elementToMoveImage = imagepageObjects.imagewidget(driver);
		Thread.sleep(3000);

		WebElement moveToImage = globalpageObjects.Canvas(driver);
		
		Actions dragAndDropImage = new Actions(driver);
		Action actionImage = dragAndDropImage.dragAndDrop(elementToMoveImage, moveToImage).build();
		actionImage.perform();

		imagepageObjects.upload(driver).click();


		Thread.sleep(2000);
		setClipboardData("C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\imagesfolder\\Targ.jpg");
		Thread.sleep(3000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);

		imagepageObjects.showlink(driver).click();
		globalpageObjects.websitelink(driver).sendKeys("http://test.per.smartfocus.com/?#/");
		new Select(globalpageObjects.borderstyle(driver)).selectByVisibleText("Solid");
		globalpageObjects.bordercolor(driver).click();
		new Select(globalpageObjects.hex(driver)).selectByVisibleText("HEX");
		Thread.sleep(3000);
		globalpageObjects.addcolor(driver).clear();
		globalpageObjects.addcolor(driver).sendKeys("#0d94f5");
		Thread.sleep(3000);
		globalpageObjects.closecolorpicker(driver).click();

		globalpageObjects.borderwidth(driver).clear();
		globalpageObjects.borderRadius(driver).clear();
		globalpageObjects.left(driver).clear();
		globalpageObjects.top(driver).clear();
		globalpageObjects.width(driver).clear();
		globalpageObjects.height(driver).clear();
		globalpageObjects.elementangle(driver).clear();
		globalpageObjects.borderwidth(driver).clear();
		globalpageObjects.borderwidth(driver).sendKeys("4");
		globalpageObjects.borderRadius(driver).sendKeys("2");
		globalpageObjects.left(driver).sendKeys("60");
		globalpageObjects.top(driver).sendKeys("10");
		globalpageObjects.width(driver).sendKeys("400");
		globalpageObjects.height(driver).sendKeys("240");
		globalpageObjects.elementangle(driver).sendKeys("0");
		
		
		
		////////////////////////////////////////////
		
		
		WebElement elementToMoveImage1 = imagepageObjects.imagewidget(driver);
		Thread.sleep(3000);

		WebElement moveToImage1 = globalpageObjects.Canvas(driver);
		Actions dragAndDropImage1 = new Actions(driver);
		Action actionImage1 = dragAndDropImage1.dragAndDrop(elementToMoveImage1, moveToImage1).build();
		actionImage1.perform();

		imagepageObjects.upload(driver).click();


		Thread.sleep(2000);
		setClipboardData("C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\imagesfolder\\summer.jpg");
		Thread.sleep(3000);

		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);

		imagepageObjects.showlink(driver).click();
		//globalpageObjects.websitelink(driver).sendKeys("http://test.per.smartfocus.com/?#/");
		new Select(globalpageObjects.borderstyle(driver)).selectByVisibleText("Dashed");
		globalpageObjects.bordercolor(driver).click();
		new Select(globalpageObjects.hex(driver)).selectByVisibleText("HEX");
		Thread.sleep(3000);
		globalpageObjects.addcolor(driver).clear();
		globalpageObjects.addcolor(driver).sendKeys("#f18a04");
		Thread.sleep(3000);
		globalpageObjects.closecolorpicker(driver).click();

		globalpageObjects.borderwidth(driver).clear();
		globalpageObjects.borderRadius(driver).clear();
		globalpageObjects.left(driver).clear();
		globalpageObjects.top(driver).clear();
		globalpageObjects.width(driver).clear();
		globalpageObjects.height(driver).clear();
		globalpageObjects.elementangle(driver).clear();
		globalpageObjects.borderwidth(driver).clear();
		globalpageObjects.borderwidth(driver).sendKeys("5");
		globalpageObjects.borderRadius(driver).sendKeys("0");
		globalpageObjects.left(driver).sendKeys("60");
		globalpageObjects.top(driver).sendKeys("260");
		globalpageObjects.width(driver).sendKeys("400");
		globalpageObjects.height(driver).sendKeys("230");
		globalpageObjects.elementangle(driver).sendKeys("0");
		
		//////////////////////////////////////////////
		
		WebElement elementToMoveImage11 = imagepageObjects.imagewidget(driver);
		Thread.sleep(3000);

		WebElement moveToImage11 = globalpageObjects.Canvas(driver);
		Actions dragAndDropImage11 = new Actions(driver);
		Action actionImage11 = dragAndDropImage11.dragAndDrop(elementToMoveImage11, moveToImage11).build();
		actionImage11.perform();

		imagepageObjects.upload(driver).click();


		Thread.sleep(2000);
		setClipboardData("C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\imagesfolder\\london.jpg");
		Thread.sleep(3000);

		Robot robot11= new Robot();
		robot11.keyPress(KeyEvent.VK_CONTROL);
		robot11.keyPress(KeyEvent.VK_V);
		robot11.keyRelease(KeyEvent.VK_V);
		robot11.keyRelease(KeyEvent.VK_CONTROL);
		robot11.keyPress(KeyEvent.VK_ENTER);
		robot11.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);

//		globalpageObjects.showlink(driver).click();
//		globalpageObjects.websitelink(driver).sendKeys("http://test.per.smartfocus.com/?#/");
//		new Select(globalpageObjects.borderstyle(driver)).selectByVisibleText("None");
//		globalpageObjects.bordercolor(driver).click();
//		new Select(globalpageObjects.hex(driver)).selectByVisibleText("HEX");
//		Thread.sleep(3000);
//		globalpageObjects.addcolor(driver).clear();
//		globalpageObjects.addcolor(driver).sendKeys("#f18a04");
//		Thread.sleep(3000);
//		globalpageObjects.closecolorpicker(driver).click();

//		globalpageObjects.borderwidth(driver).clear();
//		globalpageObjects.borderRadius(driver).clear();
		globalpageObjects.left(driver).clear();
		globalpageObjects.top(driver).clear();
		globalpageObjects.width(driver).clear();
		globalpageObjects.height(driver).clear();
		globalpageObjects.elementangle(driver).clear();
//		globalpageObjects.borderwidth(driver).clear();
//		globalpageObjects.borderwidth(driver).sendKeys("5");
//		globalpageObjects.borderRadius(driver).sendKeys("0");
		globalpageObjects.left(driver).sendKeys("20");
		globalpageObjects.top(driver).sendKeys("560");
		globalpageObjects.width(driver).sendKeys("170");
		globalpageObjects.height(driver).sendKeys("90");
		globalpageObjects.elementangle(driver).sendKeys("24");
		
         //////////////////////////////////////////////
		
		globalpageObjects.publish(driver).click();
		
		Thread.sleep(1000);
		driver.get(EnviromentURL.ImageRender_URL);
	    Thread.sleep(3000);
	    
	    
	    // Start Screen Capture //

	    screencapture.screencapturecompare(driver);
	    
	    // End Screen Capture //
	    
		Thread.sleep(1000);
		driver.get(EnviromentURL.ImageContent_URL);
	    Thread.sleep(3000);
	    
	    // Delete First Image
	    imagepageObjects.deleteicon(driver).click();
	    imagepageObjects.delete(driver).click();
	    
	    // Delete Second Image
	    imagepageObjects.deleteicon(driver).click();
	    imagepageObjects.delete2(driver).click();
	    
	    // Delete Third Image
	    imagepageObjects.deleteicon(driver).click();
	    imagepageObjects.delete(driver).click();
	    
	    
	    globalpageObjects.update(driver).click();
	    globalpageObjects.Continue(driver).click();
	    globalpageObjects.unpublished(driver).click();
	    

	}

	private static void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

}