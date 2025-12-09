package com.qa.mystepdefs;

import io.cucumber.java.hu.Ha;
import io.cucumber.java.sl.In;

import java.util.*;

public class Example1 {
    public static void main(String[] args){
 String s1 = "listen";
 String s2 = "silent";

 ArrayList<Character> str1 = new ArrayList<>();
 ArrayList<Character> str2 = new ArrayList<>();
 for(char ch: s1.toCharArray()){
     str1.add(ch);
 }
        Collections.sort(str1);

    }
}
