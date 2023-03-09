package primarydata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.Assertion;

import POM.Login;

public class ClassBase {

	public  WebDriver driver;

	@BeforeClass
	public void chrome() {
		Reporter.log("Browser is Launched", true);
		System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait explicitwait = new WebDriverWait(driver, 50);

	}

	@BeforeMethod
	public void loginToApp() {
		//driver.get("https://www.shoppersstack.com/");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Login  login = new Login(driver);
		login.getLoginButton().click();
		login.getEmailTextFeild().sendKeys("dinga01@gmail.com");
		login.getPasswordTextFeild().sendKeys("Dinga@1254");
		login.getSubmitButton().click();
	}

	
	/*@AfterClass
	public void logout() {
		driver.findElement(By.xpath("//button[@aria-label='Account settings']")).click();
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		driver.close();
	}*/
}
