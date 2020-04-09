package com.chao.sequent;

import java.util.Arrays;

/**
 * ClassName:MyArrayUtils
 * Package:com.chao.utils
 * Description:
 *
 * @Date:2020/4/6 21:58
 * @Author: wxc
 */
public class MyArray {
    //用于存储数据的数组
    private int[] elements;
    
    //初始化数组
    public MyArray() {
        elements = new int[0];
    }
    
    //获取数组的长度
    public int size() {
        return elements.length;
    }
    
    //在数组的末尾添加一个元素
    public void add(int element) {
        //创建新数组
        int[] newArr = new int[elements.length + 1];
        //将原数组的数据复制到新数组
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //将要添加的数据添加到新数组的末尾
        newArr[newArr.length - 1] = element;
        //将新数组复制到旧数组
        elements = newArr;
    }
    
    //打印数组
    public void show() {
        System.out.println(Arrays.toString(elements));
    }
    
    //删除元素
    public void delete(int index) {
        
        //判断进来的下标是不是已经越界
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        //创建新数组
        int[] newArr = new int[elements.length - 1];
        //进行赋值
        for (int i = 0; i < newArr.length; i++) {
            //当下标小于index（要删除的下标时，依次赋值）
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                //当下标>=index时，直接将index的下标进行忽略赋值，之后依次赋值
                newArr[i] = elements[i + 1];
            }
            
            
        }
        //将新数组复制给旧数组
        elements = newArr;
        
    }
    
    //获取元素
    public int get(int index) {
        return elements[index];
    }
    
    //在指定位置插入元素
    public void insert(int index, int element) {
        //判断进来的下标是不是已经越界
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        
        //创建新的数组
        int[] newArr = new int[elements.length + 1];
        //将旧数组复制到新数组中，空出下标为index的的位置
        for (int i = 0; i < elements.length; i++) {
            //i小于要插入的位置时，依次赋值
            if (i < index) {
                newArr[i] = elements[i];
                //跳过index位置，之后依次赋值
            } else {
                newArr[i + 1] = elements[i];
            }
            //将空出的index位置进行赋值
            newArr[index] = element;
        }
        //将新的数组复制给旧数组
        elements = newArr;
    }
    
    
    //替换指定位置的元素
    public void set(int index, int element) {
        elements[index] = element;
    }
    
    
    //查找元素
    public int search(int element) {
        //设置索引
        int index = -1;
        //进行遍历
        for (int i = 0; i < elements.length; i++) {
            //当元素相等时
            if (elements[i] == element) {
                //把下标赋给index
                index = i;
                //返回下标
                return index;
            }
            
        }
        //找不到时，返回-1
        return index;
    }
    
    //二分法查找元素
    public int binarySearch(int element) {
        int result = -1;
        //首指针
        int start = 0;
        //尾指针
        int end = elements.length - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            if (elements[mid] > element) {
                end = mid - 1;
            } else if (elements[mid] < element) {
                start = mid + 1;
            } else {
                result = mid;
                break;
            }
        }
        
        return result;
    }
    
    
}
