package com.it.pages;

import com.it.driver.DriverFactory;
import com.it.driver.MyDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class BasePage {
    //  static protected WebDriver driver;
    static protected MyDriver driver = MyDriver.getInstance();

//    static {
//        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
//        WebDriverManager.chromedriver().setup();//chromedriver
//        driver = new ChromeDriver();
//        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//ojidanie na poisk elementa po umilchaniyu=0
//        driver.manage().window().maximize();
//        driver.get("https://www.i.ua/");//perhod na stranitsu
//    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }



}
