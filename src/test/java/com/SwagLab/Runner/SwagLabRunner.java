package com.SwagLab.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/FeatureFiles/01_Login.feature",
							"src/test/resources/FeatureFiles/02_Inventory.feature"},
					glue={"com.SwagLab.Steps","com.SwagLab.Hooks"})
public class SwagLabRunner {

}
