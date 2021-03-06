package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/Testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		//tags= {"@TC09_Jainbook","@TC10_Jainbook"},@TC06_Jainbook,@TC07_Jainbook,@TC08_Jainbook
		tags = {"@TC09_Jainbook"},
		glue = {"com.Stepdefinition"},
		monochrome = true
		)
public class Jainbook_Advancesearchrunner {

}
