package com.qa.mystepdefs;

import java.util.Arrays;

public class Anagram {
    private static void anagram(String s1, String s2) {

        s1 = s1.replaceAll("\\s","").toLowerCase();
        s2 = s2.replaceAll("\\s","").toLowerCase();
        System.out.println(s1 + ","+ s2);
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if(Arrays.equals(str1,str2)){
            System.out.println("Strings are anagram");
        }
        else{
            System.out.println("Strings are not anagram");
        }


    }
    public static void main(String[] args){
        String s1 = "geeks";
        String s2 = "skEEg";

        anagram(s1,s2);
    }
}
