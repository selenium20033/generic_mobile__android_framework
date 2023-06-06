package com.example.steps.SignIn;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.pages.SignInPage;
import com.example.utils.CommonMethods;
import com.example.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class SignOut extends CommonMethods {

	SignInPage sign;
	
	
	@When("I click on default menu button")
	public void i_click_on_default_menu_button() throws InterruptedException {
		sign=new SignInPage();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(sign.defaultMenuButton));
		midSync();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", sign.defaultMenuButton);
	
		midSync();
	}
	
	
	@When("I click on sign out link")
	public void i_click_on_sign_out_link() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(sign.signOutLink));
		midSync();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", sign.signOutLink);
		midSync();
		
	}

	@Then("I validate that user is logged out")
	public void i_validate_that_user_is_logged_out() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(sign.loginPageSignin));
		minSync();
		Boolean verify=sign.loginPageSignin.isDisplayed();
		Assert.assertTrue(verify);
	}
	
}	
	