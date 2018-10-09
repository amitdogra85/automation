package com.crm.qa.util;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.crm.qa.base.TestBase;

public class Helper extends TestBase {

	// Switch newly open Tab

	public static void switchToTab1() {

		// Store all currently open tabs in tabs
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		// Switch to Second Tab
		// Switch newly open Tab
		driver.switchTo().window(tabs.get(1));

	}
	
	// Switch to first open Tab

		public static void switchToTab0() {

			// Store all currently open tabs in tabs
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			// Switch to Second Tab
			// Switch newly open Tab
			driver.switchTo().window(tabs.get(1));

		}

}
