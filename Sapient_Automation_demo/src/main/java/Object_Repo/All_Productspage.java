package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class All_Productspage 
{
	public All_Productspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//ul[@class='nav nav-pills nav-justified']/*/*)[1]")
	private WebElement viewproduct;

	public WebElement getViewproduct() {
		return viewproduct;
	}
	
	public void validate_Allproducts() throws Throwable 
	{
		viewproduct.click();
		Thread.sleep(1000);
	}
}
