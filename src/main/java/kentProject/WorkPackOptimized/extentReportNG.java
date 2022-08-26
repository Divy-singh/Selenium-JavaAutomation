package kentProject.WorkPackOptimized;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReportNG 
{
	static ExtentReports extent;
	public static ExtentReports getReportObject()
	{
	//String path =System.getProperty("user.dir")+"\\Resources\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter("Kent Project.html");
	reporter.config().setReportName("Kent Automation Results");
	reporter.config().setDocumentTitle("Kent");
	reporter.config().setTheme(Theme.DARK);
	
	 extent =new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("QA", "Ankush Gupta");
	extent.setSystemInfo("Environment", "Development");
	extent.setSystemInfo("OS", "Windows");
	extent.setSystemInfo("Windows Version", "Windows 10");
	return extent;
	}
	
}
