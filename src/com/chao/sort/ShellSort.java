package com.chao.sort;

import java.util.Arrays;

/**
 * ClassName:ShellSort
 * Package:com.chao.sort
 * Description:
 *
 * @Date:2020/4/8 16:46
 * @Author: wxc
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] array = new int[]{45, 98, 23, 4, 156, 13, 84, 21, 32, 11, 32, 11};
        System.out.println(Arrays.toString(array));
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static void shellSort(int[] arr) {
        //遍历所有的步长
        for (int d = arr.length / 2; d > 0; d /= 2) {
            //遍历所有的元素
            for (int i = d;i< arr.length;i++){
                //遍历本组中所有的元素
                for (int j=i-d;j>=0;j -= d){
                    //当前元素 大于 加上步长后的那个元素,进行交换
                    if (arr[j]>arr[j+1]){
                        int temp= arr[j];
                        arr[j]=arr[j+d];
                        arr[j+d]=temp;
                    }
                }
            }
        }
        
    }
}
