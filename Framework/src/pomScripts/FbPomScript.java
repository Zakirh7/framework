package pomScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPomScript
{
	//declaration
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement Createbtn;
	@FindBy(xpath="//input[@placeholder='First name']")
	private WebElement Fn;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement Ln;
	@FindBy(xpath="//input[@name=\"reg_email__\"]")
	private WebElement email;
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement newpass;
	//initialization
	public  FbPomScript(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//utilization
	public void CreateButton()
	{
		Createbtn.click();
	}
	public void FirstName(String u)
	{
		Fn.sendKeys(u);
	}
	public void LastName(String l)
	{
		Ln.sendKeys(l);
	}
	public void emailaddress(String e)
	{
		email.sendKeys(e);
	}
	public void newpassword(String n)
	{
		newpass.sendKeys(n);
	}

}
