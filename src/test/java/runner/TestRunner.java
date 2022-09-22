package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features = "src/test/resources/test.feature",glue= {"stepdefinitions"} )
public class TestRunner {

}
