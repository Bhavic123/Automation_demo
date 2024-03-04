package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_productpage 
{
	public Add_productpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='product-information']")
	private WebElement product_information;
	
	@FindBy(xpath = "//div[@class='brands_products']")
	private WebElement brands_allproducts;
	
	@FindBy(xpath = "//div[@class='panel-group category-products']")
	private WebElement category;
	
	@FindBy(xpath = "//button[@class='btn btn-default cart']")
	private WebElement addTocart;

	public WebElement getProduct_information() {
		return product_information;
	}

	public WebElement getBrands_allproducts() {
		return brands_allproducts;
	}

	public WebElement getCategory() {
		return category;
	}

	public WebElement getAddTocart() {
		return addTocart;
	}
	
	public void validate_Addproductspage() throws Throwable 
	{
		System.out.println(product_information.getText());
		System.out.println(brands_allproducts.getText());
		System.out.println(category.getText());
		addTocart.click();
		Thread.sleep(1000);
	}
}
