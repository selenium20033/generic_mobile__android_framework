package com.example.steps.AccountSettings;

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

import com.example.pages.AccountSettings;
import com.example.pages.HomePage;
import com.example.pages.SignInPage;
import com.example.utils.CommonMethods;
import com.example.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class DisplayingChangePasswordWindow extends CommonMethods {


	SignInPage sign;
	HomePage home;
	AccountSettings act;
	
	@When("I click on security link")
	public void i_click_on_security_link() throws InterruptedException {
		
		act=new AccountSettings();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(act.securityTabLink)); 
		minSync();
		act.securityTabLink.click();
		minSync();
		
	}

	@When("I click on change password button")
	public void i_click_on_change_password_button() throws InterruptedException {

		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(act.securityChangePasswordButton)); 
		minSync();
		act.securityChangePasswordButton.click();
		minSync();
	}

	@When("I enter old and new passwords")
	public void i_enter_old_and_new_passwords() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(act.securityCurrentPassword));
		minSync();
		act.securityCurrentPassword.sendKeys("OldPAssword");
		minSync();
		act.securityNewPassword.sendKeys("NewPassword");
		minSync();
		act.securityConfirmPassword.sendKeys("NewPassword");
		minSync();
	}

	@Then("I verify that update password button is enabled")
	public void i_verify_that_update_password_button_is_updated() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(act.securityUpdatePasswordBtn)); 
		minSync();
		Boolean verify=act.securityUpdatePasswordBtn.isEnabled();
		Assert.assertTrue(verify);
		
	}

}

	