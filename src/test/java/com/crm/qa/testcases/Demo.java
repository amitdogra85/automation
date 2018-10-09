package com.crm.qa.testcases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DevelopPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.DriverFactory;
import com.crm.qa.util.Helper;
import com.crm.qa.util.TestUtil;
import com.google.common.util.concurrent.Service.State;

public class Demo extends TestBase {
	DevelopPage developPage;
	LoginPage loginPage;
	HomePage homePage;

	public Demo() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initialization();

	}

	@Test
	public void addContentInSmartRoomLocalDrive() {
		new WebDriverWait(driver, 7000)
				.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("username"))));
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("Login")).click();
		new WebDriverWait(driver, 10000)
				.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Smart Rooms"))));
		driver.findElement(By.linkText("Smart Rooms")).click();
		new WebDriverWait(driver, 6000)
				.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("grid1"))));
		driver.findElement(By.id("smartroomSearchBox")).sendKeys("Smart Room POC");
		driver.findElement(By.id("smartroomSearchIcon")).click();
		driver.findElement(By.linkText("Smart Room POC")).click();
		Helper.switchToTab1();
		driver.findElement(By.xpath("//*[@id=\"tabSection-a056F00000nHJBBQA4\"]/div[1]/div[4]/div/a")).click();

	}

	@Test
	public void loginK2() {
		long id = Thread.currentThread().getId();
		System.out.println("develop class method2. Thread id is: " + id);
	}

	@AfterTest
	public void loginK1091() {
		long id = Thread.currentThread().getId();
		System.out.println("after class Deleop test dfgfdgfg");

	}

}
