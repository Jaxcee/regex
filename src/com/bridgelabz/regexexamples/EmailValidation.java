package com.bridgelabz.regexexamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        String [] emails = {"jagadesh@gamil.com","@jj801@gmail.com"};
        String emailRegex = "^[A-za-z0-9._%+-]+@[A-za-z0-9._%+-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            if(matcher.matches()){
                System.out.println(email +":"+ " is valid");
            }else{
                System.out.println(email +":" + " is not valid");
            }
        }


    }
}
