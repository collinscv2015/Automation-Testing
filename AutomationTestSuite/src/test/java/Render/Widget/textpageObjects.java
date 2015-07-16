package Render.Widget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class textpageObjects {

private static WebElement element = null;




//Vertical Padding
public static WebElement vpadding(WebDriver driver) throws Exception{
element = driver.findElement(By.name("paddingY"));
Thread.sleep(1000);
return element;
}

}




  