package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_LogInFailer2 extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003_LogInFailer2";
		testCaseName = "TC003_LogInFailer2";
		testDescription = "To Test Login and LogOut";
		category= "Smoke";
		authors	= "Angad";
		browserName = "chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickLogout();
	}

}
