package appModule;

       import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import pageObjects.Content;
 
 public class CreateMessage{
 
	 
       public static void NewMessage(WebDriver driver) throws Exception{
    	   
      	// Create a New Message with no data, to throw validation error

   		Content.Open_Content(driver).click();
   		Content.Create_New_Message(driver).click();
   		Content.Create_New_Content(driver).click();
   		Content.Create_Button(driver).click();
 

   		// Validating Name, Width and Height Page ERROR!!

   		String Page_Errors = Content.Page_Errors(driver).getText();
   		assertEquals("Your form has 3 errors", Page_Errors);
   		System.out.println("Expected Number Of Page Validation Errors is: "+Page_Errors);

   		String Name_Error = Content.Name_Error(driver).getText();
   		assertEquals("Please provide a valid name", Name_Error);
   		System.out.println("Expected Validation Name Error is: "+Name_Error);  

   		String Width_Error = Content.Width_Error(driver).getText();
   		assertEquals("Please provide a valid width", Width_Error);
   		System.out.println("Expected Validation Width Error is: "+Width_Error);

   		String Height_Error = Content.Height_Error(driver).getText();
   		assertEquals("Please provide a valid height", Height_Error);
   		System.out.println("Expected Validation Height Error is: "+Height_Error);


   		// Validating Width and Height Page ERROR!!

   		Content.Name(driver).sendKeys("Automation New Message");
   		
   		Content.Description(driver).sendKeys("Automation New Message\n\nAutomation New Message\n\nAutomation New Message");
   		Content.Create_Button(driver).click();
   		
   		String Page_Errors1 = Content.Page_Errors(driver).getText();
   		assertEquals("Your form has 2 errors", Page_Errors1);
   		System.out.println("Expected Number Of Page Validation Errors is: "+Page_Errors1);

   	 
   		String Width2_Error = Content.Width2_Error(driver).getText();
   		assertEquals("Please provide a valid width", Width2_Error);
   		System.out.println("Expected Validation Width Error is: "+Width2_Error);

   		String Height2_Error = Content.Height2_Error(driver).getText();
   		assertEquals("Please provide a valid height", Height2_Error);
   		System.out.println("Expected Validation Height Error is: "+Height2_Error);
   		
   		Content.Width(driver).sendKeys("700");
   		Content.Create_Button(driver).click();
   		
   		String Height3_Error = Content.Height3_Error(driver).getText();
   		assertEquals("Please provide a valid height", Height3_Error);
   		System.out.println("Expected Validation Height Error is: "+Height3_Error);
   		
   		Content.Height(driver).sendKeys("700");
   		Content.Create_Button(driver).click();
 
   }
 
}