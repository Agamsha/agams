package seldemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frstcl {
	public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\ec\\selenium");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.bbc.com/");
	}
	public static void main(String[]ar) {
		frstcl oo=new frstcl();
		oo.launch();
	}

}
