package com.qa.mystepdefs;

import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {
    private static ArrayList<Integer> remove_dups(ArrayList<Integer> list){

        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list1.contains(list.get(i))){
                continue;
            }
            else
                list1.add(list.get(i));

        }

        return list1;
    }
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,2,4,5,1,6));

        System.out.println(remove_dups(list));

    }
}
