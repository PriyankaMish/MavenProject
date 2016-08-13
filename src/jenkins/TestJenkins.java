package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestJenkins 
{
	ExtentReports e=new ExtentReports("./ExtentReport/ExtentReports.html");
	
	@Test
	public void testingJenkins()
	{
		ExtentTest t = e.startTest("testingJenkins");
		t.log(LogStatus.PASS, "Hi...Bye");
		e.endTest(t);
		//e.flush();
		
//		WebDriver driver=new FirefoxDriver();
//		driver.get("http://www.google.com");
//		System.out.println("Successfully opened!");
//		driver.close();
//		System.out.println("Successfully Closed!");
	
	}
	
	@Test
	public void testingJenkinsAsFail()
	{
		
		ExtentTest t = e.startTest("testingJenkinsAsFail");
		t.log(LogStatus.FAIL, "GoodMorning....Good Night");
		e.endTest(t);
		e.flush();
		
//		WebDriver driver=new FirefoxDriver();
//		driver.get("http://www.facebook.com");
//		System.out.println("Successfully opened!");
//		driver.close();
//		System.out.println("Successfully Closed!");
	}
}
