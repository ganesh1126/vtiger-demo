package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;

	public Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}

	@FindBy()
	private WebElement loginButton;


	@FindBy(id="Email")
	private WebElement emailTextFeild;

	@FindBy(id="Password")
	private WebElement passwordTextFeild;

	@FindBy(xpath="//span[text()='Login']")
	private WebElement submitButton;


	

	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getEmailTextFeild() {
		return emailTextFeild;
	}

	public WebElement getPasswordTextFeild() {
		return passwordTextFeild;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}


}
