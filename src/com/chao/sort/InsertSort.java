package com.chao.sort;

import java.util.Arrays;

/**
 * ClassName:insertSort
 * Package:com.chao.sort
 * Description:
 *
 * @Date:2020/4/8 16:02
 * @Author: wxc
 */
public class InsertSort {
    
    public static void main(String[] args) {
        int[] array = new int[]{45, 98, 23, 4, 156, 13, 84, 21, 32, 11, 32, 11};
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
        
    }
    
    //缺点：1234456789  0  依次向后移，效率低
    public static void insertSort(int[] arr) {
        //遍历数组（从1开始）
        for (int i = 1; i < arr.length; i++) {
            //查看当前是否比前一个数组小
            if (arr[i] < arr[i - 1]) {
                //将当前的小数 存起来
                int temp = arr[i];
                int j;
                //小的话，逆着遍历i之前的数据
                for (j = i - 1; j >= 0 && temp < arr[j];j--){
                    //将数字依次向后搬，直到j<0 || temp > arr[j] 结束循环
                    arr[j+1]=arr[j];
                }
                //将 保存的数 赋值给 temp > arr[j] 的下一个数组
                arr[j+1] = temp;
            }
        }
    }
}
