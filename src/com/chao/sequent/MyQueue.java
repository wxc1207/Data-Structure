package com.chao.sequent;

/**
 * ClassName:MyQueue
 * Package:com.chao.utils
 * Description:
 *
 * @Date:2020/4/7 4:50
 * @Author: wxc
 */
public class MyQueue {
    //用于存储数据的数组
    private int[] elements;
    
    //初始化数组
    public MyQueue() {
        elements = new int[0];
    }
    
    //入队
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
    
    //出队
    public int poll() {
        //将队首元素取出来
        int element = elements[0];
        //创建新的数组
        int[] newArr = new int[elements.length - 1];
        //除却队首元素外，将旧数组复制到新数组上
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i + 1];
        }
        //替换数组
        elements = newArr;
        return element;
    }
    
    //判断队是否为空
    public boolean isEmpy(){
        return elements.length == 0;
    }
}
