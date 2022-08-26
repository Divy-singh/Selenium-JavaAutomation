package kentProject.WorkPackOptimized;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class loginPage 
{
	 WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	public void loginPageCalling() throws IOException, InterruptedException
	{
		
	Properties pro = new Properties();
	FileInputStream fis = new FileInputStream("Resources/testdata.properties");
	pro.load(fis);
	
	String emailID = pro.getProperty("email");
	String passkey = pro.getProperty("password");
	String website = pro.getProperty("URL");
	
	loginPageElements lg = new loginPageElements(driver);
	
	Thread.sleep(2000);
	lg.EmailID().sendKeys(emailID);
	
	Thread.sleep(2000);
	lg.Submit().click();
	
	Thread.sleep(2000);
	lg.PassWord().sendKeys(passkey);
	
	Thread.sleep(2000);		
	lg.Submit().click();
	
	Thread.sleep(2000);		
	boolean text = lg. staySign().isDisplayed();
	System.out.println(text);
	
	if(text)
	{
		
		lg.Submit().click();			
		
	}
	else
	{
		
		System.out.println("");
	
	}
	
	}
	
}
