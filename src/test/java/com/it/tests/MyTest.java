package com.it.tests;

import com.it.App;
import com.it.pages.BasePage;
import com.it.pages.DashboardPage;
import com.it.pages.LoginPage;
import com.it.users.UserFactory;
import com.it.users.Users;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyTest extends BaseTest{

    static App app = new App();
    static Users validUser = UserFactory.getValidUser();
    static Users receiverUser = UserFactory.getUserReceiver();

    @Test

    public void myTest() throws InterruptedException {
        List<Users> randomUsers = UserFactory.getRandomUsers(0);
        randomUsers.forEach(System.out::println);
        app.login.login(validUser);
        Assert.assertEquals(app.board.getLbUserEmail(),"ittest2@i.ua");
       Thread.sleep(1000);
      app.newLetterHelper.createNewLetter("ambartsumian.l@i.ua", "MyNewMessage", "TextTextText");
      // app.login.logout();
       app.login.login(receiverUser);
       Assert.assertEquals(app.board.gettopicText(),"MyNewMessage");
       Assert.assertEquals(app.board.getlinkEmail(),"test");




    }

}
