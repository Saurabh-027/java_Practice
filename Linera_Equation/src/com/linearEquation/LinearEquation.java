package com.linearEquation;

public class LinearEquation {

    public static void main(String[] args) {

        LinearEquation le = new LinearEquation();
        int i = 0;
        String eq = "4x^4+5x^9+6x";
        String[] str2;
        str2 = eq.split("[-\\+\\*\\/]");
        int a = str2.length;
             String str3 = str2[i];
             String[] str4 = str3.split("^");
             System.out.println(str4[i]);
    }
}