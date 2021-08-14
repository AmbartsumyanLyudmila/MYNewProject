package com.it.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLetter extends BasePage{
    @FindBy(xpath= "//p[@class='make_message']/a")
    private WebElement btnlink;

    @FindBy(id = "to")
    private WebElement inputSendTo;

    @FindBy(xpath="//div[4]/div[6]/div[1]/div[1]/div[1]/div/form/div[5]/div[2]/span/input[1]")
    private WebElement inputTopic;

    @FindBy(className="smile")
    private WebElement inputMessage;

    @FindBy(xpath = "//input[@tabindex='12']")
    private WebElement btnSend;//knopka

    @FindBy(xpath = "//div[1]/ul[3]/li[3]")
    private WebElement btnSettings;//knopka


    @FindBy(xpath = "//ul/li[7]/a")
    private WebElement btnLogout;//knopkaLogout


    public void createNewLetter(String sendTo, String topic, String message) throws InterruptedException {
        btnlink.click();

        inputSendTo.clear();
        inputSendTo.sendKeys(sendTo);
        inputTopic.clear();
        inputTopic.sendKeys(topic);
        driver.switchTo().frame(driver.findElement(By.id("wysiwygtext")));
        inputMessage.clear();
        inputMessage.sendKeys(message);
        driver.switchTo().defaultContent();
        btnSend.click();
        Thread.sleep(3000);
        btnSettings.click();
        btnLogout.click();
        Thread.sleep(3000);

    }

}