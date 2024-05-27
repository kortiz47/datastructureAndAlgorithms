package main.java.sorting;

import java.util.Arrays;

public class SortUsingJDK {
    public static void main(String[] args){
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        // Arrays.sort(intArray); - to go to source code, right click on "Go to" then "Declarations or usages"
        Arrays.parallelSort(intArray);

        for (int i =0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
