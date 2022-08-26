package kentProject.WorkPackOptimized;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class transferHistory 
{

	WebDriver driver;
	
	public transferHistory(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	public void historydata() throws InterruptedException
	{
		workPackHomeElements we = new workPackHomeElements(driver);
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/div/header/a[4]")).click();
		Thread.sleep(3000);
		int count = driver.findElements(By.xpath("//*[@id='pr_id_3-table']/tbody/tr/td[5]")).size();
		System.out.println(count);
		for(int i=0 ;i<count; i++)
		{
		String datetime=	driver.findElements(By.xpath("//*[@id='pr_id_3-table']/tbody/tr/td[5]")).get(i).getText();		
			System.out.println(datetime);
			if(datetime.contains("25/05/22 5:56"))
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
}
