package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Infopage 
{
	public Account_Infopage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement first_Name;
	
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement last_Name;
	
	@FindBy(xpath = "//input[@id='address1']")
	private WebElement address;
	
	
	@FindBy(xpath = "//input[@id='state']")
	private WebElement state;
	
	@FindBy(xpath = "//input[@id='city']")
	private WebElement city;
	
	@FindBy(xpath = "//input[@id='zipcode']")
	private WebElement zipcode;
	
	@FindBy(xpath = "//input[@id='mobile_number']")
	private WebElement mobile_Number;
	
	@FindBy(xpath = "//button[text()='Create Account']")
	private WebElement createAccount_btn;

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getMobile_Number() {
		return mobile_Number;
	}

	public WebElement getCreateAccount_btn() {
		return createAccount_btn;
	}
	
	public void validate_AccountIfopage(String fir,String las,String addr,String sta,
			String cit,String zip,String mob) 
	{
		first_Name.sendKeys(fir);
		last_Name.sendKeys(las);
		address.sendKeys(addr);
		state.sendKeys(sta);
		city.sendKeys(cit);
		zipcode.sendKeys(zip);
		mobile_Number.sendKeys(mob);
		createAccount_btn.click();
	}
}
