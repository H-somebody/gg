package com.toolclassTest1;

public class Test {
    public static void main(String[] args) {
        int []arr = {10,20,15,3,50};
        ArrayUtil.printArr(arr);
        double sum = ArrayUtil.getAverage(arr);
        System.out.println(sum);
    }
}
