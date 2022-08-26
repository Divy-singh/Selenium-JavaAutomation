package kentProject.WorkPackOptimized;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class coverSheetElements 
{
	WebDriver driver;
	
	public coverSheetElements(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	By redirectCoversheet = By.xpath("/html/body/app-root/div/header/a[3]");
	By folderdropDown = By.xpath("/html/body/app-root/app-coversheets/div/div/div/div/form/div[1]/div[2]/div/p-dropdown/div/div[2]");
	By foldername = By.xpath("/html/body/app-root/app-coversheets/div/div/div/div/form/div[1]/div[2]/div/p-dropdown/div/div[3]/div[1]/div/input");
	
	By workpackTextbox = By.xpath("/html/body/app-root/app-coversheets/div/div/div/div/form/div[2]/div[2]/div/p-autocomplete/span/input");	
	By downloadCoversheet = By.xpath("/html/body/app-root/app-coversheets/div/div/div/div/form/div[3]/div[2]/button");
	By getCoversheet = By.xpath("//*[@id=\'pr_id_4_list\']/li[1]");
	
	
	public WebElement redirectCoversheet()
	{
		
		return driver.findElement(redirectCoversheet);
		
	}
	
	public WebElement folderdropDown()
	{
		
		return driver.findElement(folderdropDown);
		
	}
	
	public WebElement foldername()
	{
		
		return driver.findElement(foldername);
		
	}
	
	public WebElement workpackTextbox()
	{
		
		return driver.findElement(workpackTextbox);
		
	}
	
	public WebElement getCoversheet()
	{
		
		return driver.findElement(getCoversheet);
		
	}
	
	public WebElement downloadCoversheet()
	{
		
		return driver.findElement(downloadCoversheet);
		
	}
	
	
}
