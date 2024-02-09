package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	WebDriver driver;

	public void Test001_Login(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		driver.get("https://www.saucedemo.com/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("error_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		wait=new WebDriverWait(driver, 5);
	}

	public void test002_Logout(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
		Thread.sleep(2000);
		String logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).getText().toString();
		System.out.println("The text is "+ logout);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(2000);
	}

}
