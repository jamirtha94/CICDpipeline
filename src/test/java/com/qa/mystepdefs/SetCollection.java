    package com.qa.mystepdefs;


    import java.util.ArrayList;
    import java.util.Collections;

    public class SetCollection {
        public static void main(String args[]) {
            int[] arr1 =
                    {11,2, 3, 11, 4, 21,2,3,11};
            ArrayList<Integer> array = new ArrayList<>();

            for(int num: arr1){
                array.add(num);
            }

            Collections.sort(array);
            System.out.println(array);

//            int[] arr2= arr1;
//              int count =0;
//
//            for(int i=0; i< arr1.length;i++) {
//                for (int j = 0; j < arr2.length; j++) {
//                    if (arr1[i] == arr2[j]) {
//                        count++;
//                    }
//                }
//                System.out.println("count of number:" + arr1[i] + "is" + count);
//                count =0;
//            }
           // System.out.println(set1);
        }
    }


