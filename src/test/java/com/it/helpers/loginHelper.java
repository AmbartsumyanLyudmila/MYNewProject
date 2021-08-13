package com.it.helpers;

import com.it.pages.LoginPage;
import com.it.users.Users;

public class loginHelper extends LoginPage {
    public void login (Users user) {
        login(user.userName, user.password);
    }
    public void logout (){
    }

}
