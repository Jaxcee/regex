package com.bridgelabz.regexexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        String[] passwords = {"Jaga@123","1234"};
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        for (String password : passwords){
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                System.out.println("'" + password + "' is a strong password.");
            } else {
                System.out.println("'" + password + "' is a weak password.");
            }
        }
    }
}
