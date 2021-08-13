package com.it;

import com.it.helpers.CommonHelper;
import com.it.helpers.DashbordHelper;
import com.it.helpers.NewLetterHelper;
import com.it.helpers.loginHelper;
import com.it.pages.CreateLetter;
import com.it.pages.DashboardPage;

public class App {
    public CommonHelper common;
    public loginHelper login;
    public loginHelper logout;
    public DashboardPage board;
    //public CreateLetter letter;
    public NewLetterHelper newLetterHelper;


    public App() {
        common = new CommonHelper();
        login=new loginHelper();
        logout=new loginHelper();
        board = new DashbordHelper();
       // letter=new CreateLetter();
        newLetterHelper=new NewLetterHelper();

    }
}
