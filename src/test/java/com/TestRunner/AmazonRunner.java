package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * single scenario: tags="@name"
 * multiple scenario: tags="@tag1 or @tag2"
 * skip any one scenario: tags="not @tag1"
 * skip multiple scenario:give same name for scenario and write not @tag
 * Run multiple scenario:give same name tag for multiple scenario
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Amazon.feature",//path of feature file
					glue="com.stepdef",
					tags="not @ignore"
					)//package name
public class AmazonRunner {

}
