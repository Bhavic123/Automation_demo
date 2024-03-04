package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Viewcart_page
{
	public Viewcart_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//u[text()='View Cart']")
	private WebElement viewcart;

	public WebElement getViewcart() {
		return viewcart;
	}
	
	public void validate_Viewcartpage() throws Throwable 
	{
		viewcart.click();
		Thread.sleep(1000);
	}
}
