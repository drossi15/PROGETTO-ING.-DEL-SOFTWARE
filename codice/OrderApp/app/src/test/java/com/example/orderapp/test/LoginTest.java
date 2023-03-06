package com.example.orderapp.test;

import android.util.Log;

import com.example.orderapp.attività.MainActivity;

import org.junit.Assert;
import org.junit.Test;

//test login
public class LoginTest {

    @Test
    public void testExampleWithCorrectValues() {
        String validUsername = "admin";
        String validPassword = "foodapp1234";

        boolean LoginResult = MainActivity.validate(validUsername,validPassword);

        Assert.assertEquals(true, LoginResult);

    }

    @Test
    public void testExampleWithIncorrectEmail() {
        String invalidUsername = "ADMIN";
        String validPassword = "foodapp1234";

        boolean LoginResult = MainActivity.validate(invalidUsername,validPassword);
        Assert.assertEquals(false, LoginResult);

    }


    @Test
    public void testExampleWithIncorrectPassword() {
        String validUsername = "admin";
        String invalidPassword = "foodapp123";

        boolean LoginResult = MainActivity.validate(validUsername,invalidPassword);
        Assert.assertEquals(false, LoginResult);

    }

    @Test
    public void testExampleWithIncorrectValues() {
        String invalidUsername = "Admin";
        String invalidPassword = "FOOdapp1234";

        boolean LoginResult = MainActivity.validate(invalidUsername,invalidPassword);
        Assert.assertEquals(false, LoginResult);
    }
}
