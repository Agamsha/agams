package com.testb;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testba {
	public static String path;
	public static WebDriver driver;
	public static Properties prop;

	public testba()
	{
		try
		{
			FileInputStream fs= new FileInputStream("C:\\Users\\user\\eclipse-workspace\\com.hh\\src\\main\\java\\com\\hh\\configuration\\configuration.properties ");
					prop=new Properties();
			prop.load(fs);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void intialization()
	{String browsername=prop.getProperty("browser");
	if(browsername.equalsIgnoreCase("chrome"))
	{
		path=System.getProperty("user.dir")+prop.getProperty("Systempropert_2");
		System.setProperty("webdriver.chrome.driver", path);
		System.out.println(path);
		driver=new ChromeDriver();
		}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
	
	
	
	
	
}
