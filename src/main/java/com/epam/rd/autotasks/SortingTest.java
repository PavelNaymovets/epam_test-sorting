package com.epam.rd.autotasks;

import org.junit.Assert;
import org.junit.Test;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){
        int[] array_1 = null;
        int[] array_2 = null;
        sorting.sort(array_2);
        Assert.assertArrayEquals(array_1, array_2);
    }

    @Test
    public void testEmptyCase(){
        int[] array_1 = new int[]{};
        int[] array_2 = new int[]{};
        sorting.sort(array_2);
        Assert.assertArrayEquals(array_1,array_2);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] array_1 = new int[]{1};
        int[] array_2 = new int[]{1};
        sorting.sort(array_2);
        Assert.assertArrayEquals(array_1,array_2);
    }

    @Test
    public void testSortedArraysCase() {
        int[] array_1 = new int[]{1,2,3,4,5};
        int[] array_2 = new int[]{1,2,3,4,5};
        sorting.sort(array_2);
        Assert.assertArrayEquals(array_1,array_2);

    }

    @Test
    public void testOtherCases() {
        int[] array_1 = new int[]{1,2,3,4,5,6,9,8,7,10};
        int[] array_2 = new int[]{1,2,3,4,5,6,7,8,9,10};
        sorting.sort(array_1);
        Assert.assertArrayEquals(array_2,array_1);
    }

}