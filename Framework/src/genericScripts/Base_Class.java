package genericScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class implements Framework_Constants
{
public WebDriver driver;
@BeforeMethod
public void OpenAppln()
{
	System.setProperty(gecko_key,gecko_value);
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get(URL);
}
@AfterMethod
public void CloseAppln(ITestResult result) throws IOException
{
	driver.close();
}
}
