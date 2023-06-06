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

public class DisplayingForgetPasswordWindow extends CommonMethods {

	SignInPage sign;
	HomePage home;
	AccountSettings act;

	@When("I click on forget password link")
	public void i_click_on_forget_password_link() throws InterruptedException {
		
		act=new AccountSettings();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(act.securityForgetPasswordLink)); 
		minSync();
		act.securityForgetPasswordLink.click();
		minSync();
		
	}

	@When("I enter email address")
	public void i_enter_email_address() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(act.securityForgetPasswordEmailTextbox));
		minSync();
		act.securityForgetPasswordEmailTextbox.clear();
		minSync();
		act.securityForgetPasswordEmailTextbox.sendKeys("example@gmail.com");
		minSync();
	}

	@Then("I verify that send link button is enabled")
	public void i_verify_that_send_link_button_is_enabled() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(act.securityForgetPasswordSendLinkButton)); 
		minSync();
		Boolean verify=act.securityForgetPasswordSendLinkButton.isEnabled();
		Assert.assertTrue(verify);
	    
	}
}

	