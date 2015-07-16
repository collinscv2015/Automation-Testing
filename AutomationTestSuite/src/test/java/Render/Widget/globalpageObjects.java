package Render.Widget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class globalpageObjects {

private static WebElement element = null;

//Canvas UI
public static WebElement Canvas(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div"));
Thread.sleep(1000);
return element;
}

//Website Link 
public static WebElement websitelink(WebDriver driver) throws Exception{
element = driver.findElement(By.name("url"));
Thread.sleep(1000);
return element;
}

//Border Style
public static WebElement borderstyle(WebDriver driver) throws Exception{
element = driver.findElement(By.name("borderStyle"));
Thread.sleep(1000);
return element;
}


//Border Color
public static WebElement bordercolor(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("div.color-preview"));
Thread.sleep(1000);
return element;
}

//Add color
public static WebElement addcolor(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("div.c-form > div.form-field-group > div.form-field > input.form-control.input"));
Thread.sleep(1000);
return element;
}

//HEX color
public static WebElement hex(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[2]/div/select"));
Thread.sleep(1000);
return element;
}

//Close Color Picker
public static WebElement closecolorpicker(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("div.c-form > button.btn.btn-primary"));
Thread.sleep(1000);
return element;
}

//Border Width
public static WebElement borderwidth(WebDriver driver) throws Exception{
element = driver.findElement(By.name("borderWidth"));
Thread.sleep(1000);
return element;
}

//Border Radius
public static WebElement borderRadius(WebDriver driver) throws Exception{
element = driver.findElement(By.name("borderRadius"));
Thread.sleep(1000);
return element;
}

//Left
public static WebElement left(WebDriver driver) throws Exception{
element = driver.findElement(By.name("positionX"));
Thread.sleep(1000);
return element;
}

//Top
public static WebElement top(WebDriver driver) throws Exception{
element = driver.findElement(By.name("positionY"));
Thread.sleep(1000);
return element;
}

//Width
public static WebElement width(WebDriver driver) throws Exception{
element = driver.findElement(By.name("sizeX"));
Thread.sleep(1000);
return element;
}

//Height
public static WebElement height(WebDriver driver) throws Exception{
element = driver.findElement(By.name("sizeY"));
Thread.sleep(1000);
return element;
}

//Element Angle
public static WebElement elementangle(WebDriver driver) throws Exception{
element = driver.findElement(By.name("rotation"));
Thread.sleep(1000);
return element;
}

//Save and publish 
public static WebElement publish(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/footer/div/button"));
Thread.sleep(1000);
return element;
}



//Update Content
public static WebElement update(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/footer/div/button[2]"));
Thread.sleep(1000);
return element;
}

//Continue
public static WebElement Continue(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div[7]/div/div[2]/div/div/div[2]/div/footer/div/button"));
Thread.sleep(1000);
return element;
}

//unpublished
public static WebElement unpublished(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/footer/div/button"));
Thread.sleep(1000);
return element;
}

//Input Text Box
public static WebElement text(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("(//input[@value=''])[2]"));
Thread.sleep(1000);
return element;
}

//Text Transform
public static WebElement texttransform(WebDriver driver) throws Exception{
element = driver.findElement(By.name("textTransform"));
Thread.sleep(1000);
return element;
}

//Text Typeface
public static WebElement typefacefont(WebDriver driver) throws Exception{
element = driver.findElement(By.name("fontFamily"));
Thread.sleep(1000);
return element;
}

//Text Size
public static WebElement fontsize(WebDriver driver) throws Exception{
element = driver.findElement(By.name("fontSize"));
Thread.sleep(1000);
return element;
}


//lineHeight
public static WebElement lineHeight(WebDriver driver) throws Exception{
element = driver.findElement(By.name("lineHeight"));
Thread.sleep(1000);
return element;
}


//Bold
public static WebElement bold(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("button.btn.btn-default"));
Thread.sleep(1000);
return element;
}

//Italic
public static WebElement italic(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[4]/div/div/div/button[2]"));
Thread.sleep(1000);
return element;
}

//Underline
public static WebElement underline(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[4]/div/div/div/button[3]"));
Thread.sleep(1000);
return element;
}

//Strike Through
public static WebElement strikethrough(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[4]/div/div/div/button[4]"));
Thread.sleep(1000);
return element;
}

//left 	Aligns
public static WebElement leftalign(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[4]/div/div/div/button"));
Thread.sleep(1000);
return element;
}

//right 	Aligns
public static WebElement rightalign(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[5]/div/div/div/button[2]"));
Thread.sleep(1000);
return element;
}

//center 	Aligns
public static WebElement centeralign(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[5]/div/div/div/button[3]"));
Thread.sleep(1000);
return element;
}

//justify 	Aligns
public static WebElement justifyalign(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[5]/div/div/div/button[4]"));
Thread.sleep(1000);
return element;
}


//Background Color
public static WebElement bgcolor(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("div.color-preview"));
Thread.sleep(1000);
return element;
}


//Text Color
public static WebElement textcolor(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div[2]/div/div/div/div"));
Thread.sleep(1000);
return element;
}

//Horizontal Padding
public static WebElement hpadding(WebDriver driver) throws Exception{
element = driver.findElement(By.name("paddingX"));
Thread.sleep(1000);
return element;
}

//Vertical Padding
public static WebElement vpadding(WebDriver driver) throws Exception{
element = driver.findElement(By.name("paddingY"));
Thread.sleep(1000);
return element;
}


//Vertical Padding
public static WebElement booth(WebDriver driver) throws Exception{
element = driver.findElement(By.name("paddingY"));
Thread.sleep(1000);
return element;
}


}




  