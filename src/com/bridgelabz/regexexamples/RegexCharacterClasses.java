package com.bridgelabz.regexexamples;

import java.util.regex.Pattern;

public class RegexCharacterClasses {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]","g"));
        System.out.println(Pattern.matches("[a-zA-Z]","G"));
    }
}
