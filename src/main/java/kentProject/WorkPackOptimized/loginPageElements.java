package kentProject.WorkPackOptimized;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageElements 
{

WebDriver driver;
	
	public loginPageElements(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	
	By emailPath = By.xpath("//*[@type='email']");
	By passWord =  By.xpath("//*[@type='password']");
	By submitbutton = By.xpath("//*[@type='submit']");
	By staySign = By.xpath("//*[@id=\'lightbox\']/div[3]/div/div[2]/div/div[3]/div[1]/div/label/span");
	
	
	public WebElement EmailID()
	{
		
		return driver.findElement(emailPath);
		
	}
	
	public WebElement PassWord()
	{
		
		return driver.findElement(passWord);
		
	}

	public WebElement Submit()
	{
		
		return driver.findElement(submitbutton);
		
	}
	
	public WebElement staySign()
	{
		
		return driver.findElement(staySign);
		
	}
	
}
