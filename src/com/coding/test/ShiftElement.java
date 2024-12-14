package com.coding.test;

import java.util.Arrays;

public class ShiftElement {
    
    public static void shiftRightByOne(int[] array) {
        if (array == null || array.length <= 1) {
            return; 
        }
        int lastElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(array));
        shiftRightByOne(array);
        System.out.println("Array after shifting right by one index: " + Arrays.toString(array));
    }
}

