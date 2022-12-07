package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericScripts.Base_Class;
import genericScripts.Generic_Excel;
import pomScripts.PomScriptActiTime;

public class LoginActi extends Base_Class
{
@Test
public void test() throws InterruptedException, EncryptedDocumentException, IOException
{
	String usn = Generic_Excel.getData("Sheet1", 0, 0);
	String pass = Generic_Excel.getData("Sheet1", 1, 0);
PomScriptActiTime p=new PomScriptActiTime(driver);
p.username(usn);
Thread.sleep(2000);
p.password(pass);
Thread.sleep(2000);
Assert.fail();
p.clicklogin();

}
}

