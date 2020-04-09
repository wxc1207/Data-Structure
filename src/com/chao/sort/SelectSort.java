package com.chao.sort;

import java.util.Arrays;

/**
 * ClassName:SelectSort
 * Package:com.chao.sort
 * Description:
 *
 * @Date:2020/4/8 18:07
 * @Author: wxc
 */
public class SelectSort {
    public static void main(String[] args) {
        int [] array = new int[]{1,98,23,4,156,13,84,21,32,11,32,11};
        System.out.println(Arrays.toString(array));
       selcetSort(array);
        System.out.println(Arrays.toString(array));
    }
    
    //选择排序
    public static void selcetSort(int[] arr) {
        //遍历所有的数
        for (int i = 0; i < arr.length; i++) {
            //存放最小数，默认第一个
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex]>arr[j]){
                    //记录最小值的坐标
                    minIndex=j;
                }
            }
            //当最小数minIndex和当前数i的下标不一致时，进行交换
            if (i!=minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }
}
