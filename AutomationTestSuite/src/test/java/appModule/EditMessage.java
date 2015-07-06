package appModule;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import pageObjects.Content;

public class EditMessage {
    public static void NewMessage(WebDriver driver) throws Exception{
 	   
   	// Create a New Message with no data, to throw validation error

		Content.Open_Content(driver).click();
		
		Content.Create_Edit_Message(driver).click();
		Content.MessageEdit_Settings(driver).click();
	


		// Validating Name, Width and Height Page ERROR!!




		// Validating Width and Height Page ERROR!!
		Content.NameByXpath(driver).clear();
		Content.NameByXpath(driver).sendKeys(" ");;

   		
		Content.Save_Button(driver).click();
	    String Page_Errors1 = Content.Edit_Page_Errors(driver).getText();
		assertEquals("Your form has 1 error", Page_Errors1);
		System.out.println("Expected Number Of Page Validation Errors is: "+Page_Errors1);
		
		
		String Name_Error = Content.Edit_Name_Error(driver).getText();
   		assertEquals("Please provide a valid name", Name_Error);
   		System.out.println("Expected Validation Name Error is: "+Name_Error);  
   		
		Content.NameByXpath_New(driver).sendKeys("Automation New Message-Anil");
		
		
		
		Content.Width(driver).clear();
		Content.Width(driver).sendKeys("700");
		
		Content.Height(driver).clear();
		Content.Height(driver).sendKeys("700");
		Content.Save_Button(driver).click();

}


}
