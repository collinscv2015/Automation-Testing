package Render.Widget;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screencapture {

	public static void screencapturecompare(WebDriver driver) throws Exception {

	
	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    String current = "C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\Actual.png";
	    FileUtils.copyFile(scrFile, new File(current));
	    Thread.sleep(5000);
	    
	    File fileInput = new File("C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\Expected.png");
	    Thread.sleep(5000);
	    
	    File fileOutPut = new File("C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\Actual.png");
	    Thread.sleep(5000);

	    
	    BufferedImage image = ImageIO.read(new File("C:\\Users\\collins.obasuyi\\Desktop\\Screenshots\\Actual.png"));
	    String size = image.getWidth() + "x" + image.getHeight();
	    
	    System.out.print(size);
	    
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

	}
}


