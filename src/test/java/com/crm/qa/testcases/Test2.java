package com.crm.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DevelopPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class Test2 extends TestBase {
//	DevelopPage developPage;
//	LoginPage loginPage;
//	HomePage homePage;
//
//	public Test2() {
//		super();
//	}

//	@BeforeMethod
//	public void setUp() {
//		initialization();
//		developPage = new DevelopPage();
//		loginPage = new LoginPage();
//		homePage = new HomePage();
//	}
	
	@BeforeClass
	public void loginK11() {
		long id = Thread.currentThread().getId();
		System.out.println("Test Befoore class dfgfdgfg");

	}
	
	@Test
	public void loginK12() {
		long id = Thread.currentThread().getId();
		System.out.println("test2 method1");

	}

	@Test
	public void loginK21() {
		long id = Thread.currentThread().getId();
		System.out.println("test2 method1");
	}
//	@AfterTest
//	public void loginK101() {
//		long id = Thread.currentThread().getId();
//		System.out.println("After test dfgfdgfg");
//
//	}
	
	@AfterClass
	public void loginK191() {
		//long id = Thread.currentThread().getId();
		System.out.println("Test After class dfgfdgfg");

	}

}
