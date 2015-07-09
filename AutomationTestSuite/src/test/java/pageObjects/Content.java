package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Content {

private static WebElement element = null;


// Message UI ELEMENTS Presents


//Launch content Page

public static WebElement Open_Content(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//li[8]/a/span"));
Thread.sleep(2000);
return element;
}

public static WebElement Create_New_Message(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("button.dropdown-toggle.btn"));
Thread.sleep(2000);
return element;
}

public static WebElement Create_New_Content(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("a.directory-action.type-message > span"));
Thread.sleep(2000);
return element;
}


// New Message UI Elements


public static WebElement Name(WebDriver driver) throws Exception{
element = driver.findElement(By.name("name"));
Thread.sleep(2000);
return element;
}

public static WebElement Description(WebDriver driver) throws Exception{
element = driver.findElement(By.name("description"));
Thread.sleep(2000);
return element;
}

public static WebElement Width(WebDriver driver) throws Exception{
element = driver.findElement(By.name("width"));
Thread.sleep(2000);
return element;
}

public static WebElement Height(WebDriver driver) throws Exception{
element = driver.findElement(By.name("height"));
Thread.sleep(2000);
return element;
}

public static WebElement Create_Button(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//footer/div/button"));
Thread.sleep(2000);
return element;
}

public static WebElement Cancel_Button(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div/button[2]"));
Thread.sleep(2000);
return element;
}


// Page Validation Error Messages 

public static WebElement Page_Errors(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//*[@id='site-wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div/div/form/section[1]/div/strong"));
Thread.sleep(2000);
return element;
}

public static WebElement Name_Error(WebDriver driver) throws Exception{
element = driver.findElement (By.xpath("//div[@id='site-wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div/div/form/section/div/ul/li"));
Thread.sleep(2000);
return element;
}

public static WebElement Width_Error(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div/div/form/section/div/ul/li[2]"));
Thread.sleep(2000);
return element;
}

public static WebElement Width2_Error(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("li.error-list-item"));
Thread.sleep(2000);
return element;
}

public static WebElement Height_Error(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div/div/form/section/div/ul/li[3]"));
Thread.sleep(2000);
return element;
}

public static WebElement Height2_Error(WebDriver driver) throws Exception{
element = driver.findElement(By.xpath("//div[@id='site-wrapper']/div/div[3]/div/div[2]/div/div/div[2]/div/div/form/section/div/ul/li[2]"));
Thread.sleep(2000);
return element;
}

public static WebElement Height3_Error(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("li.error-list-item"));
Thread.sleep(2000);
return element;
}


// Creating New Variant

public static WebElement Create_New_Variant(WebDriver driver) throws Exception{
element = driver.findElement(By.cssSelector("button.dropdown-toggle.btn"));
Thread.sleep(2000);
return element;
}

public static WebElement New_Variant(WebDriver driver) throws Exception{
element = driver.findElement(By.linkText("Variant"));
Thread.sleep(2000);
return element;
}

public static WebElement Name_Variant(WebDriver driver) throws Exception{
element = driver.findElement(By.name("name"));
Thread.sleep(2000);
return element;
}

public static WebElement Description_Variant(WebDriver driver) throws Exception{
element = driver.findElement(By.name("name"));
Thread.sleep(2000);
return element;
}




}



  