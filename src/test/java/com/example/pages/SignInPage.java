package com.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.example.utils.BaseClass;
import com.example.utils.CommonMethods;

public class SignInPage extends BaseClass{

	//locating WebElement using @FindBy annotation

	@FindBy(xpath = "//*[@id='username']")
	public WebElement usernameTextBox;
	
	@FindBy(xpath = "//div[@class='sign-out-container']//a")
	public WebElement signOutLink;
	
	@FindBy(xpath = "//*[@id='password']")
	public WebElement passwordTextBox;
	
	@FindBy(xpath = "//*[@id='login']/button")
	public WebElement signInBtn;
	
	@FindBy(xpath = "//div[@class='home-container']//div")
	public WebElement homePageLogo;
	
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-default']")
	public WebElement defaultMenuButton;
		
	@FindBy(xpath = "//div[@class='title']")
	public WebElement loginPageSignin;
	
	//initialize all of our variables
	public SignInPage() { 
		PageFactory.initElements(driver, this);
		
	} 	
	
}

