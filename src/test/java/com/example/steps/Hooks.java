package com.example.steps;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.example.utils.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void start(Scenario scenario) throws MalformedURLException {

		
		System.out.println("Starting test : "+scenario.getName());
		BaseClass.setUp();
	}
	@After
	public void end(Scenario scenario ) throws InterruptedException {
		System.out.println("Ending test:" + scenario.getName());
		
		if(scenario.isFailed() || !scenario.isFailed() ) {
			
			TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
			byte [] source=ts.getScreenshotAs(OutputType.BYTES);
			scenario.embed(source, "image/png");
			
//			byte[] shot=CommonMethods.takeScreenshot();
//			scenario.embed(shot, "image/png");
		}
		
		BaseClass.tearDown();
	}

}