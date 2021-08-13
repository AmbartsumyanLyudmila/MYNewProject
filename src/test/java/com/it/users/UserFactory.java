package com.it.users;

import com.it.utils.Utils;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserFactory {
    //brat property
    static ResourceBundle resourceBundle = ResourceBundle.getBundle("user");
    public static Users getValidUser() {
        return new Users(resourceBundle.getString ("userName"),
                resourceBundle.getString("password"),
                resourceBundle.getString("email")
        );

    }
    public static Users getUserReceiver() {
        return new Users(resourceBundle.getString ("userNameReceiver"),
                resourceBundle.getString("passwordReceiver"),
                resourceBundle.getString("emailReceiver")
        );

    }
    public static Users getRandomUser() {
return new Users(Utils.getRandomString(15),
        Utils.getRandomString(10),
        Utils.getRandomString(10)+"@gmail.com");
    }
    public static List<Users> getRandomUsers(int count) {
        return Stream.generate(() -> getRandomUser())
                .limit(count)
                .collect(Collectors.toList());
    }
}
