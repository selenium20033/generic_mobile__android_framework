package com.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.example.utils.BaseClass;
import com.example.utils.CommonMethods;

public class HomePage extends BaseClass{

	//locating WebElement using @FindBy annotation

	@FindBy(xpath = "//*[@class='menu-button-container']//button")
	public WebElement accountSettingsIcon;
	
	@FindBy(xpath = "//div[contains(text(),'Salary Answers')]")
	public WebElement salaryAnswersLink;
	
	
	
	
	//initialize all of our variables
	public HomePage() { 
		PageFactory.initElements(driver, this);
		
	} 	
	
}

