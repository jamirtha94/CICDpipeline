package com.qa.mystepdefs;

import io.cucumber.java.sl.In;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Question {

    private static String rev(String str){
        System.out.println(str.length());
        StringBuilder sb = new StringBuilder();
        if(str!= null){
            for(int i=str.length()-1;i>=0; i --){
                sb = sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }

    private static int fact(int num){
        int fact =1;
        for(int i=1;i<num;i++) {
            fact += fact * i;
        }
        return fact;
    }

    private static String equals(String str1, String str2){
        String result=null;
        String sb = str2.toLowerCase();
        if(str1.equals(sb)){
            result = "true";
        }
        else{
            result ="false";
        }

        return result;
    }

    private static void fibo(int num) {
        int a = 0, b = 1, c;
        for (int i = 0; i < num; i++) {
            c = a + b;
            System.out.println(a);
            a = b;
            b = c;
        }
    }
        private static void rev(int num){
            int rev=0;
            int reversed =0;
            while(num!=0){
                rev = num%10;
                reversed = rev+ reversed*10;
                num = num/10;
            }
            System.out.println(reversed);
        }

    private static void sort(int[] arr){
        int len = arr.length;
           int temp =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }

            System.out.println(arr[len-1]);
    }
    private static void dups(int[] arr){

        int[] temp = new int[arr.length];
        int uniqueCount = 0;

        for(int i=0;i< arr.length;i++){
            boolean isunique = false;
            for(int j =0;j<uniqueCount;j++){
                if(arr[i] == temp[j]){
                    isunique = true;
                    break;
                }
            }
                if(isunique == false){
                    temp[uniqueCount] = arr[i];
                    uniqueCount = uniqueCount+1;
                }
        }


        for(int i = 0; i < uniqueCount; i++){
            System.out.println(temp[i]);
        }
    }



    public static void main(String[] args ){
//        String str ="Reverse";
//        String result = rev(str);
//        System.out.println(result);

//        System.out.println(fact(10));
//        System.out.println(equals("abscdg","ACSCDg"));
//        fibo(5);
//        rev(12345);
        int[] arr = {5, 2, 8, 1, 3,5,1,9,2};
        Set<Integer> s1 = new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++) {
            s1.add(arr[i]);
            System.out.println(s1);
        }
//        sort(arr);
        dups(arr);
    }
}
