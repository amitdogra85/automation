package com.crm.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class DevelopPage extends TestBase {
	// Initializing the Page Objects:
		public DevelopPage() {
			PageFactory.initElements(driver, this);
		}

}
