package com.example.demo.data;

import com.example.demo.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {
        final String correctUsername = "admin";
        final String correctPassword = "123456";

        try {
            // TODO: handle loggedInUser authentication
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                LoggedInUser loggedInUser =
                        new LoggedInUser(
                                java.util.UUID.randomUUID().toString(),
                                correctUsername);
                return new Result.Success<>(loggedInUser);
            }

            throw new Exception();
        } catch (Exception e) {
            return new Result.Error(new IOException("Login failed", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}