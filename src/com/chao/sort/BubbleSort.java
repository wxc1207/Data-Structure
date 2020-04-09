package com.chao.sort;

import sun.java2d.pipe.AAShapePipe;

import java.util.Arrays;

/**
 * ClassName:BubbleSort
 * Package:com.chao.sort
 * Description:
 *
 * @Date:2020/4/8 14:52
 * @Author: wxc
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] array = new int[]{1,98,23,4,156,13,84,21,32,11,32,11};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    
    //冒泡排序
    public static void bubbleSort(int[] arr) {
        //控制共比多少轮
        for (int i = 0; i < arr.length - 1; i++) {
            //控制比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //将大的变量后移
                if (arr[j] > arr[j + 1]) {
                    //借助临时变量
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
