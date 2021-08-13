package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {
	@FindBy(xpath = "//span[@class='sn_menu_title']")
	private WebElement lbWSUserEmail;//lable

	@FindBy(xpath = "//form/div[1]/a/span[3]/span")
	private WebElement topicText;


	public String getLbUserEmail() {
		return lbWSUserEmail.getText();
	}

	public String gettopicText() {
		return topicText.getText();
	}




}
