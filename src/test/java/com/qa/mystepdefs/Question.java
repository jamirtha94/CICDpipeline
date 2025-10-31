package com.qa.mystepdefs;

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

    private static void fibo(int num){
        int a =0,b=1,c;
        for(int i=0;i<num;i++){
            c = a+b;
            System.out.println(a);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args ){
//        String str ="Reverse";
//        String result = rev(str);
//        System.out.println(result);

//        System.out.println(fact(10));
//        System.out.println(equals("abscdg","ACSCDg"));
        fibo(5);
    }
}
