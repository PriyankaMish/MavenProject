package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestJenkins 
{
	@Test
	public void testingJenkins()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println("Successfully opened!");
		driver.close();
		System.out.println("Successfully Closed!");
	
	}
}
