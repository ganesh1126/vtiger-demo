package Revision;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import DWS_Base.DSW_BaseClass;

public class TC_DSW_001 extends  DSW_BaseClass{

	public WebDriver driver;
	
	@Test
	public void homePage() { 
		Reporter.log("Home Page Landed Successfully",true);
		
	}


	
}
