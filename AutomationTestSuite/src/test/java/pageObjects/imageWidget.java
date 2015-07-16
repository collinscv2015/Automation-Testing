package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class imageWidget {

private static WebElement element = null;



//Image Icon
public static WebElement Image_Icon(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("span.element-icon.type-image"));
Thread.sleep(2000);
return element;
}

//Widget Name
public static WebElement Widget_Name(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("span.element-name"));
Thread.sleep(2000);
return element;
}

//Image Appear in Objects Direcotory Items Panel
public static WebElement Img_Obj_Dir(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("a.directory-item-title.type-layer > span"));
Thread.sleep(2000);
return element;
}

//Image Widget Name In Panel Header
public static WebElement Widget_Name_Panel_Header(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("h2.panel-header-title"));
Thread.sleep(2000);
return element;
}

//Hint and Information about the widget
public static WebElement Hint_Header(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("div.hint"));
Thread.sleep(2000);
return element;
}

//Contents Section UI Element
public static WebElement Contents_Section(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("h3.form-section-title"));
Thread.sleep(2000);
return element;
}

//Image Form Field Label
public static WebElement Image_UI_Text(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("label.form-field-label"));
Thread.sleep(2000);
return element;
}

//Default Image Icon
public static WebElement Default_Image_Icon(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("div.image > img"));
Thread.sleep(2000);
return element;
}

//Link Section UI Element
public static WebElement Link_UI_Text(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/header/h3"));
Thread.sleep(2000);
return element;
}

//Show Link
public static WebElement Show_Link(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div/div/div/label/span[2]"));
Thread.sleep(2000);
return element;
}

//Click Show Link Checkbox
public static WebElement Show_Link_Checkbox(WebDriver driver) throws Exception{
element = driver.findElement(By.name("isClickable"));
Thread.sleep(2000);
return element;
}

//Website Link
public static WebElement Website_Link_Text(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[2]/div[2]/div/label"));
Thread.sleep(2000);
return element;
}

//URL Text box 
public static WebElement URL_Textbox(WebDriver driver) throws Exception{
element = driver.findElement(By.name("url"));
Thread.sleep(2000);
return element;
}

//Border Style 
public static WebElement Border_Style_Text(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[3]/div/div/label"));
Thread.sleep(2000);
return element;
}

//Border Style Drop Down Menu
public static WebElement Border_Style_Menu(WebDriver driver) throws Exception{
element = driver.findElement(By.name("borderStyle"));
Thread.sleep(2000);
return element;
}

//Click Background Color
public static WebElement Click_Background_Color(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("div.color-preview"));
Thread.sleep(2000);
return element;
}

//Colour Picker Present
public static WebElement Colour_Picker(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("div.background"));
Thread.sleep(2000);
return element;
}

//Border Width
public static WebElement BorderWidth(WebDriver driver) throws Exception{
element = driver.findElement(By.name("borderWidth"));
Thread.sleep(2000);
return element;
}

//Color Picker Slider
public static WebElement Colour_Picker_Slider(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("div.track"));
Thread.sleep(2000);
return element;
}

//Layout Section UI Element
public static WebElement Section_UI_Text(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/header/h3"));
Thread.sleep(2000);
return element;
}

//Left
public static WebElement Left_UI_Text(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("div.form-field-group.col-2 > div.form-field > label.form-field-label"));
Thread.sleep(2000);
return element;
}

//Left Positioning Text Box
public static WebElement Left_Text_Box(WebDriver driver) throws Exception{
element = driver.findElement(By.name("positionX"));
Thread.sleep(2000);
return element;
}

//Top
public static WebElement Top_UI_Text(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/div/div[2]/label"));
Thread.sleep(2000);
return element;
}

//Top Positioning Text Box
public static WebElement Top_Text_Box(WebDriver driver) throws Exception{
element = driver.findElement(By.name("positionY"));
Thread.sleep(2000);
return element;
}

//Width
public static WebElement Width_UI_Text (WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/div[2]/div/label"));
Thread.sleep(2000);
return element;
}

//Width Positioning Text Box
public static WebElement Width_Text_Box(WebDriver driver) throws Exception{
element = driver.findElement(By.name("sizeX"));
Thread.sleep(2000);
return element;
}

//Height
public static WebElement Height_UI_Text(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[4]/div[2]/div[2]/label"));
Thread.sleep(2000);
return element;
}

//Height Positioning Text Box
public static WebElement Height_Text_Box(WebDriver driver) throws Exception{
element = driver.findElement(By.name("sizeY"));
Thread.sleep(2000);
return element;
}

//Element Section UI Element
public static WebElement Element_UI_Text(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[5]/header/h3"));
Thread.sleep(2000);
return element;
}

//Element Name
public static WebElement Element_Name(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/form/section[5]/div/div/label"));
Thread.sleep(2000);
return element;
}

//Element Text Box With Default Value Image
public static WebElement Image_Name(WebDriver driver) throws Exception{
element = driver.findElement(By.name("name"));
Thread.sleep(2000);
return element;
}

//Canvas UI
public static WebElement Canvas(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div"));
Thread.sleep(2000);
return element;
}


}




  