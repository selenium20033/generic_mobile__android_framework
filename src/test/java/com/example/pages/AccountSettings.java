package com.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.example.utils.BaseClass;
import com.example.utils.CommonMethods;

public class AccountSettings extends BaseClass{

	//locating WebElement using @FindBy annotation

	@FindBy(xpath = "//div[@class='user-name']")
	public WebElement accountProfileIcon;
	
	@FindBy(xpath = "//div[@class='organization-information ng-star-inserted']//liq-icon-button")
	public WebElement myOrganizationEditBtn;
	
	@FindBy(xpath = "//a[@class='ng-star-inserted']")
	public WebElement securityTabLink;
	
	@FindBy(xpath = "(//input[starts-with(@class,'twc-input')])[1]")
	public WebElement securityCurrentPassword;
	
	@FindBy(xpath = "(//input[starts-with(@class,'twc-input')])[2]")
	public WebElement securityNewPassword;
	
	@FindBy(xpath = "(//input[starts-with(@class,'twc-input')])[3]")
	public WebElement securityConfirmPassword;
	
	@FindBy(xpath = "(//div[@class='actions']//button)[1]")
	public WebElement securityUpdatePasswordBtn;
	
	@FindBy(xpath = "//div[@class='change-password']//div[@class='card']//button")
	public WebElement securityChangePasswordButton;
	
	@FindBy(xpath = "//twc-input[@id='orgName']//input")
	public WebElement myOrganizationNameTextbox;
	
	@FindBy(xpath = "//ng-select[@placeholder='Select size']//div[@class='ng-value-container']")
	public WebElement myOrganizationSizeDD;
	
	@FindBy(xpath = "(//*[@role='option'])[3]")
	public WebElement myOrganizationOption1;
	
	@FindBy(xpath = "//ng-select[@placeholder='Select industry']//input")
	public WebElement myOrganizationIndustryDD;
	
	@FindBy(xpath = "//*[starts-with(@class,'search-location-input')]")
	public WebElement myOrganizationAddressTextBox;
	
	@FindBy(xpath = "//ng-select[@placeholder='Select country']//input")
	public WebElement myOrganizationCountryDD;
	
	@FindBy(xpath = "//twc-input[@id='state']//input")
	public WebElement myOrganizationStateTextBox;
	
	@FindBy(xpath = "//twc-input[@id='postalCode']//input")
	public WebElement myOrganizationPostalCodeTextBox;
	
	@FindBy(xpath = "//twc-input[@id='city']//input")
	public WebElement myOrganizationCityTextBox;
	
	@FindBy(xpath = "//twc-input[@id='website']//input")
	public WebElement myOrganizationWebsiteTextBox;
	
	@FindBy(xpath = "(//*[@type='submit'])[2]")
	public WebElement myOrganizationEditConfirmationBtn;
	
	
	@FindBy(xpath = "//a[contains(text(),'Forgot Password?')]")
	public WebElement securityForgetPasswordLink;
	
	@FindBy(xpath = "//a[@id='forgot-password']")
	public WebElement loginForgetPasswordLink;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement securityForgetPasswordEmailTextbox;
	
	@FindBy(xpath = "//input[@id='username']")
	public WebElement loginForgetPasswordEmailTextbox;
	
	@FindBy(xpath = "//span[@class='ant-form-item-children']//button[@type='submit']")
	public WebElement securityForgetPasswordSendLinkButton;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginForgetPasswordSendLinkButton;
	
	@FindBy(xpath = "//liq-icon-button[@class='edit']")
	public WebElement SMSVerificationEditButton;
	
	@FindBy(xpath = "//div[@class='ant-form-item-control']//input")
	public WebElement SMSVerificationTextBox;
	
	@FindBy(xpath = "(//div[@class='actions']//button)[1]")
	public WebElement SMSVerificationSubmitBtn;
	
	@FindBy(xpath = "(//div[@class='controls']//button)[1]")
	public WebElement SMSVerificationResendCodeBtn;
	
	@FindBy(xpath = "(//div[@class='controls']//button)[2]")
	public WebElement SMSVerificationCancelBtn;
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//div[@class='profile-information ng-star-inserted']//liq-icon-button")
	public WebElement myProfileEditBtn;

	@FindBy(xpath = "//twc-input[@id='firstName']//input")
	public WebElement myProfileFirstnameTextbox;
	
	@FindBy(xpath = "//twc-input[@id='lastName']//input")
	public WebElement myProfileLastnameTextbox;
	
	@FindBy(xpath = "//twc-input[@id='nickName']//input")
	public WebElement myProfileNicknameTextbox;
	
	@FindBy(xpath = "//twc-input[@id='email']//input")
	public WebElement myProfileEmailTextbox;
	
	@FindBy(xpath = "//twc-input[@id='position']//input")
	public WebElement myProfileJobTitleTextbox;
	
	@FindBy(xpath = "//div[@class='ng-input']//input")
	public WebElement myProfileCountryDD;
	
	@FindBy(xpath = "(//*[@role='option'])[5]")
	public WebElement myProfileCountryDDOption;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement myProfileConfirmationButton;
	
	@FindBy(xpath = "(//div[@class='avatar-wrapper'])[2]")
	public WebElement myProfileLogo;
	
	//initialize all of our variables
	public AccountSettings() { 
		PageFactory.initElements(driver, this);
		
	} 	
	
}

