package demopr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Driver {
	String path;
	WebDriver driver;
	@Parameters ({"ChromeBrowser"})
	@DataProvider(name="authenticate")
	@BeforeSuite
	public void Driverinfo(String Browser)throws InterruptedException
	{
		System.out.println("Browser is:"+Browser);
path=System.getProperty("user.dir")+"//Cdriver//chromedriver.exe";
System.setProperty("webdriver.chrome.driver",path);
driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
}
	@AfterSuite
	public void Close_Browser()
	{
		driver.close();
	}}
