package Automation_Demo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import Generic_Repo.Base_Class;
import Generic_Repo.Excelfile_Utility;
import Generic_Repo.File_Utility;
import Generic_Repo.Java_utiles;
import Object_Repo.Account_Infopage;
import Object_Repo.Add_productpage;
import Object_Repo.All_Productspage;
import Object_Repo.Continuepage;
import Object_Repo.Login_AccountTo_Proceed;
import Object_Repo.Logoutpage;
import Object_Repo.Newuser_signuppage;
import Object_Repo.Password_Page;
import Object_Repo.ProceedTocheckout_page;
import Object_Repo.Products_page;
import Object_Repo.Viewcart_page;

public class Demo_Automation extends Base_Class
{
	@Test
	public void excute_Automation() throws Throwable 
	{
		File_Utility fu = new File_Utility();
		System.out.println("===========Passed successfully=========");
		Products_page pp = new Products_page(driver);
		pp.validate_products();
		Thread.sleep(1000);
		All_Productspage ap = new All_Productspage(driver);
		ap.validate_Allproducts();
		Add_productpage app = new Add_productpage(driver);
		app.validate_Addproductspage();
		Viewcart_page vp = new Viewcart_page(driver);
		vp.validate_Viewcartpage();
		
		ProceedTocheckout_page ptp = new ProceedTocheckout_page(driver);
		ptp.validate_ProceedTocheckout();
		Login_AccountTo_Proceed lll = new Login_AccountTo_Proceed(driver);
		lll.validate_LoginAccountTo_Proceed();
		
		Java_utiles ju = new Java_utiles();
		String email = ju.generateRandomEmail();
		Newuser_signuppage np = new Newuser_signuppage(driver);
		String Name = fu.getPropertyKeyValue("name");		
		np.validate_Newuser(Name, email);
		
		Password_Page pa = new Password_Page(driver);
		pa.validate_Passwordpage("raju@123");
		
//		Excelfile_Utility ex = new Excelfile_Utility();
//		String First_Name = ex.getExcelData("Test-data", 0, 1);
//		String Last_Name = ex.getExcelData("Test-data", 1, 1);
//		String Address1 = ex.getExcelData("Test-data", 2, 1);
//		String State = ex.getExcelData("Test-data", 3, 1);
//		String City = ex.getExcelData("Test-data", 4, 1);
//	//String Zipcode = ex.getExcelData("Test-data", 5, 1);
//	//String Mobile = ex.getExcelData("Test-data", 6, 1);
//		
		Account_Infopage ai = new Account_Infopage(driver);
		String Firstname = fu.getPropertyKeyValue("firstname");
		String Lastname = fu.getPropertyKeyValue("lastname");
		String Address1 = fu.getPropertyKeyValue("address1");
		String State = fu.getPropertyKeyValue("state");
		String City = fu.getPropertyKeyValue("city");
		String Zipcode = fu.getPropertyKeyValue("zipcode");
		String Mobile = fu.getPropertyKeyValue("mobilenumber");
		ai.validate_AccountIfopage(Firstname, Lastname, Address1, State, City, Zipcode, Mobile);
		
		Continuepage c = new Continuepage(driver);
		c.validate_Continuebtn();
		
		Logoutpage lap = new Logoutpage(driver);
		lap.validateLogout_Thepage();
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file_copy = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshots\\order.png");
		FileUtils.copyFile(file_copy, dest);
		
		
	}
	
}
