package com.sanjeev.corejava.java11;

public class IsBlankExample {

    public static void main(String[] args) {
        String s1= "     ";
        System.out.println(s1.isBlank());

        String s2= "Is Blank test";
        System.out.println(s2.isBlank());

        String s3 =" IsBlankTest";
        System.out.println(s3.stripLeading());
        String s4 ="X IsBlankTest  ";
        System.out.println(s4.stripTrailing());
        String s5 ="  ABCD  ";
        System.out.println(s5.strip().length());
    }
}
