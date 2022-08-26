package kentProject.WorkPackOptimized;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.TimeZone;

import org.testng.Assert;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class workPackHome 
{
	public WebDriver driver;
	
	DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
    Date date = new Date(); 
    
	
   	public workPackHome(WebDriver driver)
   	{
   		
   		this.driver=driver;
   		
   	}

   	
	public void SourceworkPack() throws InterruptedException, IOException
	{		
		
		workPackHomeElements we = new workPackHomeElements(driver);
		
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("Resources/testdata.properties");
		pro.load(fis);
		
		String sourceSite = pro.getProperty("sourceSite");
		String sourcePath = pro.getProperty("sourcePath");
		
		//Sharepoint Source Site :
		Thread.sleep(10000);
		we.sourceSitedrop().click();
		
		Thread.sleep(2000);
		we.sourceSite().sendKeys(sourceSite);
		
		Thread.sleep(2000);
		int count = we.sourceSiteCount().size();
		System.out.println("Sharepoint Source Site :"+count);
		
		for(int i=0 ; i<count ; i++)
		{
			String Source = we.sourceSiteCount().get(i).getText();
			System.out.println(Source);
			if(Source.equals(sourceSite))
			{
				System.out.println("TEXT");
				Thread.sleep(5000);
				we.sourceSiteClick().get(i).click();				
			}
		}
		
		//Sharepoint Source Folder Path :		
		Thread.sleep(2000);
		we.sourcePath().sendKeys(sourcePath);
		
		Thread.sleep(3000);
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(s, new File("tutorialpoint"+dateFormat.format(date)+".png"));
	      
	      Thread.sleep(5000);

	}		
		
	
	public void DestinationworkPack() throws InterruptedException, IOException	
	{
		
		workPackHomeElements we = new workPackHomeElements(driver);
		
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("Resources/testdata.properties");
		pro.load(fis);
		
		String destinationSite = pro.getProperty("destinationSite");
		String destinationPath = pro.getProperty("destinationPath");
		
		//Sharepoint Destination Site :

		Thread.sleep(2000);
		we.destinationSitedrop().click();
		
		Thread.sleep(2000);
		we.destinationSite().sendKeys(destinationSite);
		
		Thread.sleep(2000);
		int countdes = we.destinationSiteCount().size();
		System.out.println("Sharepoint Source Site :"+countdes);
		
		for(int j=0 ; j<countdes ; j++)
		{
			String Destination = we.destinationSiteCount().get(j).getText();
			System.out.println(Destination);
			if(Destination.equals(destinationSite))
			{
				Thread.sleep(5000);
				we.destinationSiteClick().get(j).click();
			}
		}
		
		//Sharepoint Destination Folder Path :		
		Thread.sleep(2000);
		we.destinationPath().sendKeys(destinationPath);		
		Thread.sleep(3000);
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(s, new File("tutorialpoint"+dateFormat.format(date)+".png"));
	      
	      Thread.sleep(5000);	
	      
	}
	
	
	public void metaDatafile() throws InterruptedException, IOException
	{
		
		workPackHomeElements we = new workPackHomeElements(driver);
		Thread.sleep(2000);
		we.metaData().click();
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec("Resources/meta.exe");
		
		Thread.sleep(3000);
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(s, new File("tutorialpoint"+dateFormat.format(date)+".png"));
	      
	      Thread.sleep(5000);
	      
	}
	
	
	public void syncFile() throws InterruptedException, IOException
	{
		
		workPackHomeElements we = new workPackHomeElements(driver);
		Thread.sleep(2000);
		we.syncFile().click();
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec("Resources/syncFile.exe");
		
		Thread.sleep(3000);
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(s, new File("tutorialpoint"+dateFormat.format(date)+".png"));
	      
	      Thread.sleep(5000);
	      
	}
	
	public void transfer() throws InterruptedException, IOException
	{
		
		workPackHomeElements we = new workPackHomeElements(driver);
		Thread.sleep(5000);
		we.transfer().click();
		
		Thread.sleep(10000);
		if(we.succStatus().isDisplayed())
		{
			System.out.println("FILE UPLOADED SUCCESSFULLY");

			we.transferOK().click();
			
			
			Thread.sleep(3000);
			File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(s, new File("tutorialpoint"+dateFormat.format(date)+".png"));
      
		}
		else
		{
			System.out.println("ERROR");
			Thread.sleep(3000);
			File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(s, new File("tutorialpoint"+dateFormat.format(date)+".png"));
		      
		      Thread.sleep(5000);
		      
		}
	}
	
	public void transferReporting() throws InterruptedException, IOException
	{
		
		workPackHomeElements we = new workPackHomeElements(driver);
		Thread.sleep(5000);
		we.transfer().click();
		
		Thread.sleep(10000);
		if(we.succStatus().isDisplayed())
		{
			System.out.println("FILE UPLOADED SUCCESSFULLY");
			dateTime dt = new dateTime();
			
			TimeZone.setDefault( TimeZone.getTimeZone("UTC"));
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy h:mm");
	        Date now = new Date();
	        String currencydate_time= dateFormat.format(now);
	        System.out.println("Current Date in milliseconds is :" + now.getTime());
			System.out.println("Current date and time is " +currencydate_time);
			
			
			
			we.transferOK().click();
			
			System.out.println("Before Screenshot");
			Thread.sleep(3000);
//			File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		      FileUtils.copyFile(s, new File("tutorialpoint"+dateFormat.format(date)+".png"));
		      
		  	
			Thread.sleep(10000);
			System.out.println("After Screenshot");
			driver.findElement(By.xpath("/html/body/app-root/div/header/a[4]")).click();
			Thread.sleep(3000);
			int count = driver.findElements(By.xpath("//*[@id='pr_id_3-table']/tbody/tr/td[5]")).size();
			System.out.println(count);
			for(int i=0 ;i<count; i++)
			{
			String datetime=	driver.findElements(By.xpath("//*[@id='pr_id_3-table']/tbody/tr/td[5]")).get(i).getText();		
				System.out.println(datetime);
				if(datetime.contains(currencydate_time))
				{
					Thread.sleep(3000);
					System.out.println("123");
					System.out.println("Index"+i);
					
					for(int j=i ; j<i+1;j++)
					{
						Thread.sleep(3000);
						System.out.println(driver.findElements(By.xpath("//*[@id=\"pr_id_3-table\"]/tbody/tr/td[1]")).get(j).getText());
						
						Thread.sleep(3000);
						System.out.println(driver.findElements(By.xpath("//*[@id=\"pr_id_3-table\"]/tbody/tr/td[2]")).get(j).getText());
						
						Thread.sleep(3000);
						System.out.println(driver.findElements(By.xpath("//*[@id=\"pr_id_3-table\"]/tbody/tr/td[3]")).get(j).getText());
						
						Thread.sleep(3000);
						System.out.println(driver.findElements(By.xpath("//*[@id=\"pr_id_3-table\"]/tbody/tr/td[4]")).get(j).getText());
						
						Thread.sleep(3000);
						System.out.println(driver.findElements(By.xpath("//*[@id=\"pr_id_3-table\"]/tbody/tr/td[5]")).get(j).getText());
						
						Thread.sleep(3000);
						driver.findElements(By.xpath("//*[@id=\"pr_id_3-table\"]/tbody/tr/td[6]")).get(j).click();
						
						Thread.sleep(3000);
						driver.findElements(By.xpath("//*[@id=\"pr_id_3-table\"]/tbody/tr/td[7]")).get(j).click();
						
						Thread.sleep(3000);
						driver.findElements(By.xpath("//*[@id=\"pr_id_3-table\"]/tbody/tr/td[8]")).get(j).click();
						
						
					}
					break;
				}
				else
				{
					System.out.println("456");
				}
				
			}
		      
		}
		else
		{
			System.out.println("ERROR");
			Thread.sleep(3000);
			File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(s, new File("tutorialpoint"+dateFormat.format(date)+".png"));
		      
		      Thread.sleep(5000);
		      
		}
	}
	
	
	public void workPackValidation() throws InterruptedException
	{
		workPackHomeElements we = new workPackHomeElements(driver);
		Thread.sleep(5000);
		we.transfer().click();
		Assert.assertEquals(we.sourceSiteValid().getText(), "Source Site is required.");
		Assert.assertEquals(we.sourcePathValid().getText(), "Source Path is required.");
		Assert.assertEquals(we.destinationSiteValid().getText(), "Destination Site is required.");
		Assert.assertEquals(we.destinationPathValid().getText(), "Destination Path is required.");
		Assert.assertEquals(we.metaDataValid().getText(), "Metadata is required (xlsx file format).");
		Assert.assertEquals(we.syncFileValid().getText(), "Sync File is required (xlsx file format).");
		
		
	}
	
	public void downloadTransfer() throws InterruptedException
	{
		
		workPackHomeElements we = new workPackHomeElements(driver);
		Thread.sleep(5000);
		we.DownloadReport().click();
	}
	
	
}
