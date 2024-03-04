package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continuepage 
{
	public Continuepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement continue_btn;

	public WebElement getContinue_btn() {
		return continue_btn;
	}
	
	public void validate_Continuebtn() 
	{
		continue_btn.click();
	}
}
