package Render.Widget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class imagepageObjects {

private static WebElement element = null;




//Upload
public static WebElement upload(WebDriver driver) throws Exception{
element = driver.findElement(By.name("qqfile"));
Thread.sleep(1000);
return element;
}

//Image Icon
public static WebElement imagewidget(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("span.element-icon.type-image"));
Thread.sleep(1000);
return element;
}

//Show Link 
public static WebElement showlink(WebDriver driver) throws Exception{
element = driver.findElement(By.name("isClickable"));
Thread.sleep(1000);
return element;
}




//Delete Icon
public static WebElement deleteicon(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
Thread.sleep(1000);
return element;
}

//Delete Text Link 
public static WebElement delete(WebDriver driver) throws Exception{
element = driver.findElement(By.linkText("Delete"));
Thread.sleep(1000);
return element;
}


//Delete Text Link 2
public static WebElement delete2(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("a[name=\"delete\"] > span"));
Thread.sleep(1000);
return element;
}




}




  