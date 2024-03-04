package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage 
{
	public Logoutpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=' Logout']")
	private WebElement logout_btn;

	public WebElement getLogout_btn() {
		return logout_btn;
	}
	
	public void validateLogout_Thepage() 
	{
		logout_btn.click();
	}
}
