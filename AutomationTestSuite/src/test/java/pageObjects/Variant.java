package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Variant {

private static WebElement element = null;


//Launch Variant Default Window

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


}



  