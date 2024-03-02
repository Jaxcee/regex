package com.bridgelabz.regexexamples;

import java.util.regex.Pattern;

public class RegexFinder {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("\\d+","1234"));
        System.out.println(Pattern.matches("\\D+","1234"));
        System.out.println(Pattern.matches("\\D+","Gfg"));
        System.out.println(Pattern.matches("\\S+","gfg"));
    }
}
