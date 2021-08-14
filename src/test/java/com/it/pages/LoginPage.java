package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

   public class LoginPage extends BasePage{
	@FindBy(name = "login")
	private WebElement inputLogin;

	@FindBy(name = "pass")
	private WebElement inputPassword;

	@FindBy(xpath = "//input[@tabindex='5']")
	private WebElement btnLogin;//knopka

//	   @FindBy(xpath = "//div[1]/ul[3]/li[3]/span")
//	   private WebElement btnSetting;//knopkaLogout
//
//	   @FindBy(xpath = "//ul/li[7]/a")
//	   private WebElement btnLogout;//knopkaLogout

	protected void login(String login, String password) {
//		driver.scrollDown();
//		driver.scrollUp();
		inputLogin.clear();
		inputLogin.sendKeys(login);
		inputPassword.clear();
		inputPassword.sendKeys(password);
		btnLogin.click();
	}
//    public void logout() {
//		btnSetting.click();
//		btnLogout.click();
//
//
//	}



}
