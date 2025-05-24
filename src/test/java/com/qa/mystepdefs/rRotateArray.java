package com.qa.mystepdefs;

public class rRotateArray {

    private static void rotate_arr(int[] arr1, int len) {
        int[] temp_arr = new int[len];

        for(  int i= len-1,j=0;i>=0;i--,j++){
            temp_arr[j]= arr1[i];
            System.out.println(temp_arr[j]);


        }


    }
public static void main(String[] args){
    int[] arr1 = {1,2,3,4,5};

    int len = arr1.length;
   // System.out.println(len);
    rotate_arr(arr1,len);
}
}