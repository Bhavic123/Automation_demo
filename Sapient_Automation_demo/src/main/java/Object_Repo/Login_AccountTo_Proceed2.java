package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_AccountTo_Proceed2 
{
	public Login_AccountTo_Proceed2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//u[text()='Register / Login']")
	private WebElement login_AccountTo_Proceed;

	public WebElement getLogin_AccountTo_Proceed() {
		return login_AccountTo_Proceed;
	}
	
	public void validate_LoginAccountTo_Proceed() throws Throwable 
	{
		login_AccountTo_Proceed.click();
		Thread.sleep(1000);
	}
}
