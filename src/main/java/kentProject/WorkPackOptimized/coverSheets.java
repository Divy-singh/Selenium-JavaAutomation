package kentProject.WorkPackOptimized;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class coverSheets 
{
	WebDriver driver;
	
	public coverSheets(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	
	public void coversheetPage() throws InterruptedException, IOException
	{
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("Resources/testdata.properties");
		pro.load(fis);
		
		String destinationSite = pro.getProperty("destinationSite");
		String destinationPath = pro.getProperty("destinationPath");
		String coversheetDownloadname = pro.getProperty("coversheetDownload");
		
		By destinationFolder = By.xpath("//li[contains(text(),'"+destinationSite+"')]/following-sibling::p-dropdownitem/li[@aria-label='"+destinationPath+"']");
		
		Thread.sleep(4000);
		coverSheetElements co =new coverSheetElements(driver);
		co.redirectCoversheet().click();
		Thread.sleep(2000);
		co.folderdropDown().click();
		Thread.sleep(2000);
		co.foldername().sendKeys(destinationPath);
		Thread.sleep(5000);
		driver.findElement(destinationFolder).click();
		
		Thread.sleep(2000);
		co.workpackTextbox().sendKeys("WP-418-01-I-003_CoverSheet.xlsx");
		
		Thread.sleep(5000);
		if(co.getCoversheet().isDisplayed())
		{
			Thread.sleep(10000);
			co.getCoversheet().click();
			
			Thread.sleep(2000);
			co.downloadCoversheet().click();
			
		}
		
		else
		{
			
			System.out.println("NO COVERSHEET EXIST WITH THIS NAME");
			
		}
		

		
	}
}
