package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Driver {
	
@Test(priority=1)
public void driverInfo()
{
	System.out.println("DriverInfo");
}
@BeforeClass
public void bfrclass()
{
	System.out.println("BFR");
}

@Test(priority=0)
public void launch()
{
	System.out.println("Launch");
}
@AfterClass
public void aftr()
{
	System.out.println("aftrc");
	}
@BeforeSuite
public void beforedemo()
{
	System.out.println("Agam");
}
@AfterSuite
public void afterDemo()
{
	System.out.println("Close");
}
@BeforeMethod
public void bfm()
{
	System.out.println("Methodb");
}
@AfterMethod
public void afm()
{
	System.out.println("Methodm");
}
}


