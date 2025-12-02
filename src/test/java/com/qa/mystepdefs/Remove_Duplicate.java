package com.qa.mystepdefs;
import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Duplicate {

    private static ArrayList<Integer> remove_dups(ArrayList<Integer> list){

        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list1.contains(list.get(i))){
                break;
            }
            else
                list1.add(list.get(i));

        }

        return list;
    }
    public static void Main(String[] args){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,2,4,5,1,6));
        list = remove_dups(list);
        System.out.println(list);

    }
}
