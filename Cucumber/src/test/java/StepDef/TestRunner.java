package StepDef;


import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/fetaure",glue= {"StepDef"},
monochrome=true,plugin= {"pretty","html:target/Reports"},   // You can use different formats like JSON or XML
tags="@CRMTest"
		)
public class TestRunner {

}
