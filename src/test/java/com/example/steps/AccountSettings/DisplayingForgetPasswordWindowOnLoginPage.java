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

public class DisplayingForgetPasswordWindowOnLoginPage extends CommonMethods {

	
	SignInPage sign;
	HomePage home;
	AccountSettings act;
	
	
	@When("I click on forget password link on login page")
	public void i_click_on_forget_password_link_on_login_page() throws InterruptedException {
		act=new AccountSettings();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(act.loginForgetPasswordLink)); 
		minSync();
		act.loginForgetPasswordLink.click();
		minSync();
	}

	@When("I enter email address for forget password on login page")
	public void i_enter_email_address_for_forget_password_on_login_page() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(act.loginForgetPasswordEmailTextbox));
		minSync();
		act.loginForgetPasswordEmailTextbox.clear();
		minSync();
		act.loginForgetPasswordEmailTextbox.sendKeys("example@gmail.33mail.com");
		minSync();
	}

	@Then("I verify that send link button is enabled for login page forget password")
	public void i_verify_that_send_link_button_is_enabled_for_login_page_forget_password() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(act.loginForgetPasswordSendLinkButton)); 
		minSync();
		Boolean verify=act.loginForgetPasswordSendLinkButton.isEnabled();
		Assert.assertTrue(verify);
	}
	
}
