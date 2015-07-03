package appModule;

       import org.openqa.selenium.WebDriver;

import pageObjects.Variant;
 
 public class CreateVariant{
 
	 
       public static void NewVariant(WebDriver driver) throws Exception{
    	   
      		Variant.Create_New_Variant(driver).click();
       		Variant.New_Variant(driver).click();
      	
}
       
 }