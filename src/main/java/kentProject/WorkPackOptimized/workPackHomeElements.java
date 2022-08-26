package kentProject.WorkPackOptimized;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class workPackHomeElements 
{
	WebDriver driver;
	
	public workPackHomeElements(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	
	
	By sourceSitedrop = By.xpath("/html/body/app-root/app-home/div/div/div/div/form/div[1]/div[2]/div/p-dropdown/div/span");
	By sourceSite = By.xpath("/html/body/app-root/app-home/div/div/div/div/form/div[1]/div[2]/div/p-dropdown/div/div[3]/div[1]/div/input");
	By sourceSiteCount = By.xpath("//*[@id=\'pr_id_1_list\']/p-dropdownitem/li/span");
	By sourcePath = By.xpath("/html/body/app-root/app-home/div/div/div/div/form/div[2]/div[2]/div/input");
	By sourceSiteClick = By.xpath("//*[@id=\'pr_id_1_list\']/p-dropdownitem/li");
	
	By destinationSitedrop = By.xpath("/html/body/app-root/app-home/div/div/div/div/form/div[4]/div[2]/div/p-dropdown/div/span");
	By destinationSite = By.xpath("/html/body/app-root/app-home/div/div/div/div/form/div[4]/div[2]/div/p-dropdown/div/div[3]/div[1]/div/input");
	By destinationSiteCount = By.xpath("//*[@id='pr_id_2_list']/p-dropdownitem/li/span");
	By destinationPath = By.xpath("/html/body/app-root/app-home/div/div/div/div/form/div[5]/div[2]/div/input");
	By destinationSiteClick = By.xpath("//*[@id=\'pr_id_2_list\']/p-dropdownitem/li");
	
	
	By metaData = By.xpath("/html/body/app-root/app-home/div/div/div/div/form/div[3]/div[2]/p-fileupload/div/span");
	By syncFile = By.xpath("/html/body/app-root/app-home/div/div/div/div/form/div[3]/div[4]/p-fileupload/div/span");
	
	By transfer = By.xpath("/html/body/app-root/app-home/div/div/div/div/form/div[6]/div[2]/button");
	By succStatus = By.xpath("//*[@id='swal2-html-container']");
	By transferOK = By.xpath("//div[@class='swal2-actions']/button[contains(text(),'OK')]");
	
	//Validation Locators
	By sourceSiteValid = By.xpath("//div[@class='ng-star-inserted'][contains(text(),'Source Site')]");
	By sourcePathValid = By.xpath("//div[@class='ng-star-inserted'][contains(text(),'Source Path')]");
	By destinationSiteValid = By.xpath("//div[@class='ng-star-inserted'][contains(text(),'Destination Site')]");
	By destinationPathValid = By.xpath("//div[@class='ng-star-inserted'][contains(text(),'Destination Path')]");
	By metaDataValid = By.xpath("//span[@class='ng-star-inserted'][contains(text(),'Meta')]");
	By syncFileValid = By.xpath("//span[@class='ng-star-inserted'][contains(text(),'Sync')]");
	
	
	By DownloadReport = By.xpath("//span[@class='p-button-label ng-star-inserted'][contains(text(),'Download')]");
	
	
	
	public WebElement sourceSitedrop()
	{
		
		return driver.findElement(sourceSitedrop);
		
	}
	
	
	public WebElement sourceSite()
	{
		
		return driver.findElement(sourceSite);
		
	}
	
	
	public List<WebElement> sourceSiteCount()
	{
		
		return driver.findElements(sourceSiteCount);
		
	}
	
	
	public WebElement sourcePath()
	{
		
		return driver.findElement(sourcePath);
		
	}
	
	public List<WebElement> sourceSiteClick()
	{
		
		return driver.findElements(sourceSiteClick);
		
	}
	
	
	public WebElement destinationSitedrop()
	{
		
		return driver.findElement(destinationSitedrop);
		
	}
	
	
	public WebElement destinationSite()
	{
		
		return driver.findElement(destinationSite);
		
	}
	
	
	public List<WebElement> destinationSiteCount()
	{
		
		return driver.findElements(destinationSiteCount);
		
	}
	
	
	public WebElement destinationPath()
	{
		
		return driver.findElement(destinationPath);
		
	}
	
	
	public List<WebElement> destinationSiteClick()
	{
		
		return driver.findElements(destinationSiteClick);
		
	}
	
	
	public WebElement metaData()
	{
		
		return driver.findElement(metaData);
		
	}
	
	
	public WebElement syncFile()
	{
		
		return driver.findElement(syncFile);
		
	}
	
	
	public WebElement transfer()
	{
		
		return driver.findElement(transfer);
		
	}
	
	
	public WebElement succStatus()
	{
		
		return driver.findElement(succStatus);
		
	}
	
	
	public WebElement transferOK()
	{
		
		return driver.findElement(transferOK);
		
	}
	
	
	public WebElement sourceSiteValid()
	{
		
		return driver.findElement(sourceSiteValid);
		
	}
	
	public WebElement sourcePathValid()
	{
		
		return driver.findElement(sourcePathValid);
		
	}
	
	public WebElement destinationSiteValid()
	{
		
		return driver.findElement(destinationSiteValid);
		
	}
	
	public WebElement destinationPathValid()
	{
		
		return driver.findElement(destinationPathValid);
		
	}
	
	public WebElement metaDataValid()
	{
		
		return driver.findElement(metaDataValid);
		
	}
	
	public WebElement syncFileValid()
	{
		
		return driver.findElement(syncFileValid);
		
	}
	
	
	public WebElement DownloadReport()
	{
		
		return driver.findElement(DownloadReport);
		
	}
	

}
