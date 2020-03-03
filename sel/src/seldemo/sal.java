package seldemo;
import java.util.ArrayList;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sal {
	public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\ec\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.close();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement Login=driver.findElement(By.name("q"));
		Login.getTagName();
		Login.sendKeys("Mobile");
		Login.clear();
		Login.sendKeys("Apple");
        driver.findElement(By.className("vh79eN")).click();
       // driver.findElement(By.xpath("_1e_EAo[titel=\"Filpkart\"]")).click();
        //driver.getText(By.name("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]"));
	ArrayList<WebElement>ag=new ArrayList<WebElement>(driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]")));
	for(int  i=0;i<ag.size();i++)
		{
			System.out.println(ag.get(i).getText());
			
		}
		
	}
	public static void main(String[] args) { 
		sal obj= new sal();
		obj.launch();
		// TODO Auto-generated method stub

	}}


