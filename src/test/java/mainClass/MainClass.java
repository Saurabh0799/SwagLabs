package mainClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import capability.Capability;
import steps.Login;

public class MainClass extends Capability {
	WebDriver driver;
	Login login=new Login();

	@BeforeTest
	public void openchrome()
	{
		driver = WebCapability();
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void login() throws InterruptedException, IOException
	{
		login.Test001_Login(driver);
	}

	@Test(priority = 2)
	public void testlogout() throws InterruptedException
	{
		login.test002_Logout(driver);
	}

	@AfterTest
	public void closebrowser()
	{
		//		driver.quit();
	}


}
