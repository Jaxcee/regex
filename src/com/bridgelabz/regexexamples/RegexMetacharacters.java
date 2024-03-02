package com.bridgelabz.regexexamples;

import java.util.regex.Pattern;

public class RegexMetacharacters {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[b-z]?","a"));
        System.out.println(Pattern.matches("[a-zA-Z]+","GfgTestCase"));
        System.out.println(Pattern.matches("[^a-z]?","g"));
        System.out.println(Pattern.matches("[geks]*","geeksgeeks" ));
    }
}
