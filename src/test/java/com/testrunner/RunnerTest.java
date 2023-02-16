package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= "src/test/resources/Features",glue = "com/testMatrimony/StepDeffination")
public class RunnerTest extends AbstractTestNGCucumberTests {

}
