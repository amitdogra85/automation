package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DevelopPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.DriverFactory;
import com.crm.qa.util.TestUtil;
import com.google.common.util.concurrent.Service.State;

public class developTest extends TestBase {
	DevelopPage developPage;
	LoginPage loginPage;
	HomePage homePage;

	public developTest() {
		super();
	}
//
//	@BeforeMethod
//	public void setUp() {
//		initialization();
//		developPage = new DevelopPage();
//		loginPage = new LoginPage();
//		homePage = new HomePage();
//	}
//
//	@DataProvider
//	public Object[][] getCRMTestData() {
//		Object data[][] = TestUtil.getTestData("user");
//		return data;
//	}
//
//	@Test(dataProvider = "getCRMTestData", priority = 1)
//	public void loginK(String username, String password, String Status) {
//		homePage = loginPage.login(username, password);
//		String title = homePage.verifyHomePageTitle();
//		if (Status.equalsIgnoreCase("true")) {
//			Assert.assertEquals(title, "CRMPRO");
//		} else {
//			Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
//		}
//
//	}

	@Test
	public void loginK1() {
		long id = Thread.currentThread().getId();
		System.out.println("develop class method1. Thread id is: " + id);

	}

	@Test
	public void loginK2() {
		long id = Thread.currentThread().getId();
		System.out.println("develop class method2. Thread id is: " + id);
	}
	
//	@AfterMethod
//	public void tearDown(){
//		DriverFactory.getInstance().removeDriver();
//	}

}
