package WebPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerLoginPage extends SeleniumUtility{
	
	public VtigerLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(className="button")
	private WebElement signInButton;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}
	
	public void loginIntoVtiger(String userId,String pwd) {
		typeInput(userName, userId);
		typeInput(password, pwd);
		clickOnElement(signInButton);
	}
	
	public String getHomePageTitle() {
		return getCurrentTitleOfApplication();
	}
	
}
