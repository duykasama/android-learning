package com.example.demo.data;

import com.example.demo.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {
    private final String correctUsername = "admin";
    private final String correctPassword = "123456";

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                LoggedInUser loggedInUser =
                        new LoggedInUser(
                                java.util.UUID.randomUUID().toString(),
                                "admin");
                return new Result.Success<>(loggedInUser);
            }

            throw new Exception("Wrong username or password");
        } catch (Exception e) {
            return new Result.Error(new IOException("Login failed", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}