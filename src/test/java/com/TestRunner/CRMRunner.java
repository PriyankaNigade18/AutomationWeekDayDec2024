package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/CRM.feature",//path of feature file
					glue={"com.stepdef","com.AppHooks"},
					plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
					//publish=true)
public class CRMRunner {

}
