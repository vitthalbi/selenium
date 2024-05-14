package Modular_Driven_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="username")
	private WebElement usernametextfiled;
	
	@FindBy(name="pwd")
    private WebElement passwordtextfiled;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;

	public WebElement getUserNameTextFiled()
	{
		return usernametextfiled;
	}
	
	public WebElement getPasswordTextFiled()
	{
		return passwordtextfiled;
	}
	
	public WebElement getkeepLoggedInCheckBox()

	{
		return keepLoggedInCheckBox;
	}
	
	public WebElement getloginButton()
	{
		return loginButton;
	}

	

	public void VALIDLOGIN(String dataFromProperty, String dataFromProperty2) {
		usernametextfiled.sendKeys("admin");
		passwordtextfiled.sendKeys("manager");
		keepLoggedInCheckBox.click();
		loginButton.click();
		
	}


}
