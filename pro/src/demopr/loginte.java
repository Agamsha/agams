package demopr;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginte extends Driver{
	String title,exptitle="Orange HRM";
	
	@Test
	public void CheckTitle()
	{
		
		title=driver.getTitle();
		if(title.equals(exptitle))
		{
			System.out.println("Correct Page Opened");
		}
		else
		{
			System.out.println("Not correct Page");
		}
	}
	@AfterTest
	public void login()
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).submit();
	}
	@BeforeTest
	public void  fgpassword()
	{
		//driver.findElement(By.id("forgotPasswordLink")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.navigate().back();
	}

}
