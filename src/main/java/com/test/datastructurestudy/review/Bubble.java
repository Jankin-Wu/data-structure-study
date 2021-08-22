package com.test.datastructurestudy.review;

import java.util.Arrays;

/**
 * @author wwg
 * @description 冒泡排序复习
 * @date 2021/8/19 23:47
 */
public class Bubble {

    public static void main(String[] args){
        int[] numbers = new int[]{56, 34, 32, 76,7};

        for (int i=0;i<numbers.length-1;i++) {
            for (int j=0; j<numbers.length-1-i; j++) {
                if (numbers[j]>numbers[j+1]) {
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
