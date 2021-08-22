package com.test.datastructurestudy.review;

import java.util.Arrays;

/**
 * @author wwg
 * @description 插入排序复习
 * @date 2021/8/20 0:02
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] array = new int[]{34, 65, 25, 35, 86, 16, 58};
        int i, j, temp;
        for (i = 1; i < array.length; i++) {
            temp = array[i];
            for (j = i-1;j>=0;j--){
                if (temp>array[j]){
                    break;
                }else {
                    array[j+1] = array[j];
                }
            }
            array[j+1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
