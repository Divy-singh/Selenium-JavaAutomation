package kentProject.WorkPackOptimized;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class workPackToolCompiler extends driverInitialization 
{
	public WebDriver driver;
	
	@BeforeTest
	public void drivercalling() throws Exception
	{
		//videoRecorder.startRecording("drivercalling");
		driver=browserIntializer();
		driver.manage().window().maximize();
		
		loginPage login = new loginPage(driver);
		login.loginPageCalling();
		
	}
	
	@Test (priority=1)
	public void WorkpackTesting() throws Exception 
	{
		//videoRecorder.startRecording("drivercalling");		
		workPackHome workPack = new workPackHome(driver);
		workPack.SourceworkPack();
		workPack.DestinationworkPack();
		workPack.metaDatafile();
		workPack.syncFile();
		workPack.transfer();
		
	}
	
	@Test (priority=2)
	public void downloadReport() throws IOException, InterruptedException 
	{
//		Thread.sleep(5000);
//		driver.navigate().refresh();
		Thread.sleep(3000);
		workPackHome workPack = new workPackHome(driver);
		workPack.downloadTransfer();
			
	}
	
	@Test (priority=3)
	public void SourceSitePath() throws IOException, InterruptedException 
	{
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		workPackHome workPack = new workPackHome(driver);
		workPack.SourceworkPack();
			
	}
	
	@Test (priority=4)
	public void destinationSitePath() throws IOException, InterruptedException 
	{
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		workPackHome workPack = new workPackHome(driver);
		workPack.DestinationworkPack();
		
	}
	
	@Test (priority=5)
	public void metafileData() throws IOException, InterruptedException 
	{
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		workPackHome workPack = new workPackHome(driver);
		workPack.metaDatafile();
		
	}
	
	
	@Test (priority=6)
	public void syncFileData() throws IOException, InterruptedException 
	{
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		workPackHome workPack = new workPackHome(driver);
		workPack.syncFile();
		
	}
	
	
	@Test (priority=7)
	public void transferFiles() throws IOException, InterruptedException 
	{
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		workPackHome workPack = new workPackHome(driver);
		workPack.workPackValidation();
		
	}

	@Test (priority=8)
	public void transferReport() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		workPackHome workPack = new workPackHome(driver);
		workPack.SourceworkPack();
		workPack.DestinationworkPack();
		workPack.metaDatafile();
		workPack.syncFile();
		workPack.transferReporting();
	}
	
	@Test (priority=9)
	public void coverSheet() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		coverSheets cover = new coverSheets(driver);
		cover.coversheetPage();
	}
	
	
	
	@AfterTest
	public void driverQuit() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.close();
		driver.quit();
	}
	
	

}
