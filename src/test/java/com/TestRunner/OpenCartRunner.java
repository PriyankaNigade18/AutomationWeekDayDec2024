package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/OpenCart.feature",//path of feature file
					glue="com.stepdef",
					tags="@login")//package name
public class OpenCartRunner {

}
