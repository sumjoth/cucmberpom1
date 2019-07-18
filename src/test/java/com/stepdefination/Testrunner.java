package com.stepdefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\Selenium\\Tarrifplan\\features\\twomapping.feature", glue = "com.stepdefination", plugin = {
		"html:target", "json:target/report.json" }, dryRun = false, monochrome = true, strict = true)

public class Testrunner {

}
