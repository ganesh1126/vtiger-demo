package DWS_Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POM2.Register_to_DWS;

public class DSW_BaseClass {
 public WebDriver driver;
 
 @BeforeClass
 public void browser() {
	 
	 System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	 Reporter.log("Browser launched Successfully",true);
	 driver.manage().window().maximize();
	 Reporter.log("Browser is Maximized",true);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://demowebshop.tricentis.com/");
	 WebDriverWait explicitWait  = new WebDriverWait(driver, 10);
	
	 
 }
 
 @BeforeMethod
 public void regToApp() {
	Register_to_DWS reg = new Register_to_DWS(driver);
	 reg.getRegisterLink().click();
	 reg.getRadioButton().click();
	 reg.getFirstNameTextFeild().sendKeys("guabauru");
	 reg.getLastNameTextFeild().sendKeys("manabhaahhh");
	 reg.getEmailTextFeild().sendKeys("mahhhabhaa1244@gmail.com");
	 reg.getPasswordTextFeild().sendKeys("Mahbevverar@989");
	 reg.getConfirmPasswordTextFeild().sendKeys("Mahbevverar@989");
	 reg.getRegisterButton().click();
	 reg.getContinueButton().click();
	 
 }
 
 @AfterMethod
 public void logout() {
	 driver.findElement(By.partialLinkText("Log out")).click();
	 
	 
 }
}
