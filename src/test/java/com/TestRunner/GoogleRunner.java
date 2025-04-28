package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Google.feature",//path of feature file
					glue="com.stepdef")//package name
public class GoogleRunner {

}
