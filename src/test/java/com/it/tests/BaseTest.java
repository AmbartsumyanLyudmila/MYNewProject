package com.it.tests;

import com.it.App;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    static App app=new App() ;
    //static

//    @BeforeSuite
//    public void setUp() {
//        app = new App();
//
//    }

    @AfterMethod
    public void tearDown() {
        app.common.stopApp();
    }
}
