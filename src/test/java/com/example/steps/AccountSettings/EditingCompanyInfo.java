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

public class EditingCompanyInfo extends CommonMethods {

	SignInPage sign;
	HomePage home;
	AccountSettings act;
	
	@When("I click on edit my organization link")
	public void i_click_on_edit_my_organization_link() throws InterruptedException {
		act=new AccountSettings();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(act.myOrganizationEditBtn));
		minSync();
		act.myOrganizationEditBtn.click();
		midSync();
	}

	@When("I update my organization section")
	public void i_update_my_organization_section() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(act.myOrganizationNameTextbox));
		minSync();
		act.myOrganizationNameTextbox.clear();
		act.myOrganizationNameTextbox.sendKeys("Ehample LLC");
		act.myOrganizationSizeDD.click();
		midSync();
		act.myOrganizationOption1.click();
		minSync();
		act.myOrganizationIndustryDD.click();
		midSync();

		act.myOrganizationAddressTextBox.clear();
		act.myOrganizationAddressTextBox.sendKeys("2000 Spencer Rd");
		minSync();
		
		
		act.myOrganizationStateTextBox.clear();
		act.myOrganizationStateTextBox.sendKeys("TX");
		minSync();
		
		act.myOrganizationPostalCodeTextBox.clear();
		act.myOrganizationPostalCodeTextBox.sendKeys("76201");
		minSync();
		
		
		
		act.myOrganizationCityTextBox.clear();
		act.myOrganizationCityTextBox.sendKeys("Denton");
		minSync();
		
		
		
		act.myOrganizationWebsiteTextBox.clear();
		act.myOrganizationWebsiteTextBox.sendKeys("www.example.com");
		midSync();
		
		wait.until(ExpectedConditions.elementToBeClickable(act.myOrganizationEditConfirmationBtn));
		minSync();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", act.myOrganizationEditConfirmationBtn);
		
	}

	@Then("I confirm the changes for my organization")
	public void i_confirm_the_changes_for_my_organization() {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(act.myProfileLogo));
		Boolean verify=act.myProfileLogo.isDisplayed();
		Assert.assertTrue(verify);
	}
}

	