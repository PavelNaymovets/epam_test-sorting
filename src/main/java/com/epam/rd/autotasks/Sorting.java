package com.epam.rd.autotasks;

import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Sorting {
    public void sort(int[] array){
        if(array == null){
            throw new IllegalArgumentException();
        } else{
            Arrays.sort(array);
        }
    }

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int[] init = null;
        sorting.sort(init);
        System.out.println(Arrays.toString(init));
    }
}
