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

public class ValidSignIn extends CommonMethods {

	SignInPage sign;
	

	@When("I enter valid username")
	public void i_enter_valid_username() {
	   sign=new SignInPage();
	   sendText(sign.usernameTextBox, "example@gmail.com"); 
	}

	@When("I enter valid  password into textbox")
	public void i_enter_valid_password_into_textbox() {
		 sendText(sign.passwordTextBox, "Password"); 
	}

	@When("I click login button")
	public void i_click_login_button() throws InterruptedException {
	    sign.signInBtn.click();
	   midSync();
	}
	
	@Then("I validate that home page is displayed")
	public void i_validate_that_home_page_is_displayed() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(sign.homePageLogo));
		minSync();
		Boolean verify=sign.homePageLogo.isDisplayed();
		Assert.assertTrue(verify);
	}
	
	}
	
