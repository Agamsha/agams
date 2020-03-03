package seldemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fac {
	String path;
public void launch()
{
	System.setProperty("webdriver.chrome.driver","C:\\ec\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
}
	public static void main(String[] args) {fac oo= new fac();
	oo.launch();
		// TODO Auto-generated method stub

	}

}
