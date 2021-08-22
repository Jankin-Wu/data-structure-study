package com.test.datastructurestudy.review;

import java.util.Arrays;

/**
 * @author wwg
 * @description 选择排序复习
 * @date 2021/8/20 0:37
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {23,12,45,25,64,25,27,};
        for (int i=0;i<array.length-1;i++){
            int k = i;
            for (int j=k+1;j<array.length;j++){
                if (array[j]<array[k]){
                    k = j;
                }
            }
            if (i != k) {
                int temp = array[i];
                array[i] = array[k];
                array[k] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
