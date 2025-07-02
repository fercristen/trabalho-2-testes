package com.ifood;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String email;
    private String password;
    private final List<String> passwordHistory = new ArrayList<>();

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.passwordHistory.add(password);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getPasswordHistory() {
        return passwordHistory;
    }

    public void setPassword(String password) {
        this.password = password;
        this.passwordHistory.add(password);
    }
}
