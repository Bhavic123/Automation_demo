package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products_page 
{
	public Products_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[contains(text(),' Products')]")
	private WebElement products;

	public WebElement getProducts() {
		return products;
	}
	
	public void validate_products() throws Throwable 
	{
		products.click();
		Thread.sleep(1000);
	}
}
