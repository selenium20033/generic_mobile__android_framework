package com.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.example.utils.BaseClass;
import com.example.utils.CommonMethods;

public class MediaPage extends BaseClass{

	//locating WebElement using @FindBy annotation

	@FindBy(xpath = "(//div[@class='routes-container']//a)[2]")
	public WebElement LaborNewsLink;
	
	@FindBy(xpath = "(//div[@class='title'])[2]")
	public WebElement firstNewsLink;
	
	@FindBy(xpath = "//div[@class='title']")
	public WebElement secondNewsLink;
	
	@FindBy(xpath = "//div[contains(text(),'Webinars')]")
	public WebElement webinarTab;
	
	@FindBy(xpath = "//div[contains(text(),'Labor Market Reports')]")
	public WebElement laborMarketReportsTab;
	
	@FindBy(xpath = "//span[@class='ant-tabs-tab-next ant-tabs-tab-arrow-show']")
	public WebElement newsNextArrow;
	
	@FindBy(xpath = "//div[contains(text(),'Blog')]")
	public WebElement blogNewsTab;
	
	
	
	//initialize all of our variables
	public MediaPage() { 
		PageFactory.initElements(driver, this);
		
	} 	
	
}

