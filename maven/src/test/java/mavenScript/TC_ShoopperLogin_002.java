package mavenScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import primarydata.ClassBase;

public class TC_ShoopperLogin_002    extends ClassBase {

	public WebDriver driver;
	
	@Test
	public void wishList() {
	WebElement profile = driver.findElement(By.xpath("//*[text()='Wish List']"));
	profile.click();
	Reporter.log(profile.getText());
	}
	
	@Test
	public void  item() {
		Actions action = new Actions(driver) ;
		WebElement item = driver.findElement(By.xpath("//*[@alt='Men Woven Design Silk Blend Straight Kurta']"));
		action.doubleClick(item);
	}
}
