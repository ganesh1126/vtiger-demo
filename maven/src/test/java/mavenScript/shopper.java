package mavenScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import primarydata.ClassBase;

public class shopper extends ClassBase {

	@Test
	public void  account() {
		WebElement account = driver.findElement(By.xpath("//button[@aria-label='Account settings']"));
		account.click();
		WebElement remove = driver.findElement(By.xpath("//*[text()='remove from wishlist?']"));
		remove.click();

	}
	
	/*@Test
	public void address() {
		WebElement address = driver.findElement(By.xpath("//*[text()='My Addresses']"));
		address.click();
		
	}*/


}
