package com.ifood;

public class UserService {
    public boolean changePassword(User user, String newPassword) {
        if (!isValidPassword(newPassword)) {
            return false;
        }
        if (user.getPasswordHistory().contains(newPassword)) {
            return false; // reuse
        }
        user.setPassword(newPassword);
        return true;
    }

    private boolean isValidPassword(String pwd) {
        if (pwd.length() < 8) return false;
        boolean upper=false, lower=false, digit=false, special=false;
        for (char c : pwd.toCharArray()) {
            if (Character.isUpperCase(c)) upper=true;
            else if (Character.isLowerCase(c)) lower=true;
            else if (Character.isDigit(c)) digit=true;
            else special=true;
        }
        return upper && lower && digit && special;
    }
}
