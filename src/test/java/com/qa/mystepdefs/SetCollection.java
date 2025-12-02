package com.qa.mystepdefs;
import java.util.ArrayList;
import java.util.Arrays;

public class SetCollection {

    private static int remove_dups(ArrayList<Integer> list){

        ArrayList<Integer> list1 = new ArrayList<>();
        int max= list.get(0);
        for(int i=1;i<list.size();i++) {
            if (max < list.get(i)) {
                max = list.get(i);

                System.out.println("value of i and max: " + i + " " + max);
            }
        }

        return max;
    }
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,2,4,5,11,6,1,2,9));
        int max = remove_dups(list);
        System.out.println(max);

    }
}
