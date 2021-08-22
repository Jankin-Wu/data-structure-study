package com.test.datastructurestudy.algorithm;

import java.util.Arrays;

/**
 * @author wwg
 * @description 快速排序
 * @date 2021/8/20 1:47
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {23,14,3,545,2,345,76,34,565,24,67};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int start ,int end) {
        if(start<end)
        {
            int i=start, j=end, x=arr[start];//基元

            while(i<j)	{
                //从右向左扫描小于x的数
                while(i<j && arr[j]>=x)
                    j--;
                if(i<j)
                    arr[i++]=arr[j];
                //从左向右扫描大于x的数
                while(i<j && arr[i]<=x)
                    i++;
                if(i<j)
                    arr[j--]=arr[i];
            }
            arr[i]=x;//在最后一个位置中填入基准数
            quickSort(arr, start, end-1);//递归
            quickSort(arr, start+1, end);
        }
    }
}
