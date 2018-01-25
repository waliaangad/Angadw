package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_LogInFailer3 extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004_LogInFailer3";
		testCaseName = "TC004_LogInFailer3";
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
