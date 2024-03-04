package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Password_Page 
{
	public Password_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
	public void validate_Passwordpage(String pwd) {
		password.sendKeys(pwd);
		
	}
}
