package com.ae.qa.testcases;

import java.lang.reflect.Method;
import java.util.Map;

import org.testng.annotations.Test;

import com.ae.qa.base.TestBase;
import com.ae.qa.pages.HomePage;
import com.ae.qa.pagesTenantAdmin.HomePageTA;
import com.ae.qa.util.ExcelHandler;

public class HomePageTest extends TestBase {
	HomePage homepage;

	public HomePageTest() {
		super();
	}

	@Test(priority=144)
	public void validateSearchFunctionalityTest(Method method) throws Exception {
		extentTest = extent.createTest("validateSearchFunctionalityTest", "TC_135:Search functionality in sidebar menu");
		Map<String,String> TestDataInMap=ExcelHandler.getTestDataInMap(prop.getProperty("sheetname"),method.getName());
		homepage = new HomePage();
		homepage.validateSearchFunctionality(TestDataInMap.get("TabName"));
		extentTest.log(extentTest.getStatus(), "Search functionality in sidebar menu is validated successfully");
		ExcelHandler.UpdateTestResultsToExcel(prop.getProperty("sheetname"), "Pass", method.getName());
	}

}
	

	
