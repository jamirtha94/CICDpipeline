package com.qa.mystepdefs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Math {
    public static int[] dups(int[] arr) {

        int result[] = null;
        int length = arr.length;
        System.out.println(length);
        Arrays.sort(arr);

        int[] arr2= null;
        for(int i=0;i<length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
            }

        }


        return arr2;
    }


    public static void main(String args[]) {

        int[] arr1 = {1,2,3,3,4,5,1,2};
        int[] result;
        result = dups(arr1);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }




    }
}
