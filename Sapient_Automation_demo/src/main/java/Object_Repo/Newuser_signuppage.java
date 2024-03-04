package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newuser_signuppage 
{
	public Newuser_signuppage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement name;
	
	@FindBy(xpath = "(//input[@name='email'])[2]")
	private WebElement email_Address;
	
	@FindBy(xpath = "//button[text()='Signup']")
	private WebElement signup_btn;

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail_Address() {
		return email_Address;
	}

	public WebElement getSignup_btn() {
		return signup_btn;
	}
	
	public void validate_Newuser(String nam,String email) 
	{
		name.sendKeys(nam);
		email_Address.sendKeys(email);
		signup_btn.click();
	}
}
