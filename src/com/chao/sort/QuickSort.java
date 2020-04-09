package com.chao.sort;

import java.util.Arrays;

/**
 * ClassName:QuickSort
 * Package:com.chao.sort
 * Description:
 *
 * @Date:2020/4/8 15:17
 * @Author: wxc
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{45, 98, 23, 4, 156, 13, 84, 21, 32, 11, 32, 11};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
        
    }
    
    /**
     * @param arr   需要排序的数组
     * @param start 需要排序的第一个数
     * @param end   需要排序的最后一个数
     *              <p>
     *              数组中的数都与标准数进行比较
     *              大的与high进行交换
     *              小的与low进行交换
     */
    public static void quickSort(int[] arr, int start, int end) {
        
        if (start < end) {
            //把数组下标为0的设置为标准数
            int stard = arr[start];
            //记录要排序的下标
            int low = start;
            int high = end;
            //循环比较 比标准数大的数 和 比标准数小的数
            while (low < high) {
                //当右边数字比标准数大时,右边指针左移
                while (low < high && arr[high] >= stard) {
                    high--;
                }
                //当右边数字比标准数小时，进行交换
                arr[low] = arr[high];
                
                //当左边数字比标准数小时,右边指针右移
                while (low < high && arr[low] <= stard) {
                    low++;
                }
                //当左边数字比标准数大时,进行交换
                arr[high] = arr[low];
            }
            //在进行上面交换结束后（low == high），不要忘记标准数已经被覆盖，应把标准数赋值到数组
            arr[low] = stard;
            
            //进行了一次排序后，它将分为以上一次标准数为界限
            //左边小于标准数
            //右边大于标准数
            quickSort(arr, start, low);
            quickSort(arr, low + 1, end);
        }
    }
}
