package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedTocheckout_page 
{
	public ProceedTocheckout_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='Proceed To Checkout']")
	private WebElement proceedTocheckout_btn;


	public WebElement getProceedTocheckout_btn() {
		return proceedTocheckout_btn;
	}
	
	public void validate_ProceedTocheckout() throws Throwable 
	{
		proceedTocheckout_btn.click();
		Thread.sleep(1000);
	}
}
