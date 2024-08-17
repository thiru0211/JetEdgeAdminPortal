package com.JetEdge.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeAdminPortal\\src\\test\\resources\\FeatureFile\\JE_QP_3_UserLogReport.feature",
glue = "com.JetEdge.StepDefinition",
//monochrome = true,
////dryRun = true,
tags="@TC_08",
plugin = {"pretty","html:Reports/TestReport.html",
		"json:target/cucumber/cucumber.json",
		"html:Reports/cucumber-reports.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})
public class JE_QP_3_UserLogReportRunnerTest {

	
}
