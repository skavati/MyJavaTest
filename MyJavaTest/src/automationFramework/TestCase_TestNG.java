	package automationFramework;
	 
	import java.util.concurrent.TimeUnit;
	 
	import pageObjects.HomePage;
	 
	import pageObjects.LoginPage;
	 
	import org.openqa.selenium.WebDriver;
	 
	import org.openqa.selenium.ie.InternetExplorerDriver;
	 
	import org.openqa.selenium.support.PageFactory;
	 
	import org.testng.annotations.Test;
	 
	import org.testng.annotations.BeforeMethod;
	 
	import org.testng.annotations.AfterMethod;
	 
	public class TestCase_TestNG {
	 
		static WebDriver driver;
	 
		HomePage HomePage;
	 
		LoginPage LoginPage;
	 
	  @BeforeMethod
	 
	  public void beforeMethod() {
	 
		  driver = new InternetExplorerDriver();
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("http://www.store.demoqa.com");
	 
	      HomePage = PageFactory.initElements(driver, HomePage.class);
	 
	      LoginPage = PageFactory.initElements(driver, LoginPage.class);
	 
	  }
	 
	  @Test
	 
	  public void test() {
	 
	      HomePage.lnk_MyAccount.click();
	 
	      LoginPage.LogIn_Action("testuser_1", "Test@123");	      
	 
	      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 
//	      HomePage.lnk_LogOut.click();
	 
	  }
	 
	  @AfterMethod
	 
	  public void afterMethod() {
	 
		  driver.quit();
	 
	  }
	 
	}



