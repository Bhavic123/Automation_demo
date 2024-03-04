package Generic_Repo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import Object_Repo.Newuser_signuppage;

public class Base_Class 
{
	File_Utility fu = new File_Utility();
	Excelfile_Utility eu = new Excelfile_Utility();
	public WebDriver driver;
	@BeforeSuite
	public void connectDB()
	{
		System.out.println("========connectBD_Application=========");
	}
	
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(String Browser) throws Throwable
	{
		System.out.println("=========openBrowser===========");
		//String Browser = fu.getPropertyKeyValue("browser");
		String URL = fu.getPropertyKeyValue("url");
		if (Browser.equals("chrome")) 
		{
			driver = new ChromeDriver();
		}else if (Browser.equals("edge")) 
		{
			driver = new EdgeDriver();
		}else {
			driver = new FirefoxDriver();
		}
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Pathsdemo.implicitwait, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void loginToApplication() throws Throwable
	{
		
		System.out.println("==========loginTo the Application=======");
		
	
	}
	
	@AfterMethod
	public void logoutApplication()
	{
		System.out.println("==========logoutApplication==========");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("==========closeBrowser==========");
		driver.quit();
	}
	
	@AfterSuite
	public void closeDB()
	{
		System.out.println("============closeDB===========");
	}
}
