package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLetter extends BasePage{
	@FindBy(linkText = "Создать письмо")
    private WebElement btnlink;

    @FindBy(id = "to")
    private WebElement inputSendTo;

    @FindBy(xpath="//div[4]/div[6]/div[1]/div[1]/div[1]/div/form/div[5]/div[2]/span/input[1]")
    private WebElement inputTopic;

    @FindBy(className="smile")
    private WebElement inputMessage;

    @FindBy(xpath = "//input[@tabindex='12']")
    private WebElement btnSend;//knopka

    public void createNewLetter(String sendTo, String topic, String message) {
        btnlink.click();
        inputSendTo.clear();
        inputSendTo.sendKeys(sendTo);
        inputTopic.clear();
        inputTopic.sendKeys(topic);
        inputMessage.clear();
        inputMessage.sendKeys(message);
        btnSend.click();
    }

}