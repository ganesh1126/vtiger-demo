package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_to_DWS {

	public WebDriver driver;
	
	

	public Register_to_DWS(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(linkText ="Register")
	private WebElement registerLink;
	

	

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getFirstNameTextFeild() {
		return firstNameTextFeild;
	}

	public WebElement getLastNameTextFeild() {
		return lastNameTextFeild;
	}

	public WebElement getEmailTextFeild() {
		return emailTextFeild;
	}

	public WebElement getPasswordTextFeild() {
		return passwordTextFeild;
	}

	public WebElement getConfirmPasswordTextFeild() {
		return ConfirmPasswordTextFeild;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	@FindBy(id="gender-male")
	private WebElement radioButton;
	
	@FindBy(id="FirstName")
	private WebElement firstNameTextFeild;
	
	@FindBy(id="LastName")
	private WebElement lastNameTextFeild;
	
	@FindBy(id="Email")
	private WebElement emailTextFeild;
	
	@FindBy(id="Password")
	private WebElement passwordTextFeild;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordTextFeild;
	
	public WebElement getContinueButton() {
		return continueButton;
	}

	@FindBy(id="register-button")
	private WebElement registerButton;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	
	
}
