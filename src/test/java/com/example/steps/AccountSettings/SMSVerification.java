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

public class SMSVerification extends CommonMethods {


	SignInPage sign;
	HomePage home;
	AccountSettings act;
	
	@When("I click on SMS verification edit button")
	public void i_click_on_SMS_verification_edit_button() throws InterruptedException {
		
		act=new AccountSettings();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(act.SMSVerificationEditButton)); 
		minSync();
		act.SMSVerificationEditButton.click();
		minSync();
		
	}

	@When("I enter the phone number")
	public void i_enter_the_phone_number() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(act.SMSVerificationTextBox));
		minSync();
		act.SMSVerificationTextBox.clear();
		minSync();
		act.SMSVerificationTextBox.sendKeys("210-303-7488");
		minSync();
		
	}

	@When("I click on submit button")
	public void i_click_on_submit_button() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(act.SMSVerificationSubmitBtn)); 
		minSync();
		act.SMSVerificationSubmitBtn.click();
		minSync();
		
	}

	@When("I click on resend code button")
	public void i_click_on_resend_code_button() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(act.SMSVerificationResendCodeBtn)); 
		minSync();
		act.SMSVerificationResendCodeBtn.click();
		minSync();
		
	}

	@Then("I click on cancel button")
	public void i_click_on_cancel_button() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(act.SMSVerificationCancelBtn)); 
		minSync();
		act.SMSVerificationCancelBtn.click();
		minSync();
		
	}

}
	