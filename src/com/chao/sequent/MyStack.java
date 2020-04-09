package com.chao.sequent;

/**
 * ClassName:MyStack
 * Package:com.chao.utils
 * Description:
 *
 * @Date:2020/4/7 4:31
 * @Author: wxc
 */
public class MyStack {
    
    //用于存储数据的数组
    private int[] elements;
    
    //初始化数组
    public MyStack() {
        elements = new int[0];
    }
    //压入元素
    public void push(int element){
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
    
    //取出栈顶元素
    public int pop(){
        //首先判断栈内有没有元素
        if (elements.length == 0){
            throw  new RuntimeException("stack is empy");
        }
        //取出数组的最后一个元素
        int element = elements[elements.length - 1];
        //创建一个新的数组
        int[] newArr = new int[elements.length-1];
        //除却最后的元素，其他的都复制到新数组
        for(int i=0; i<newArr.length;i++){
            newArr[i]=elements[i];
        }
        //替换数组
        elements = newArr;
        //返回栈顶元素
        return element;
        
    }
    
    //查看栈顶元素
    public int peek(){
        //首先判断栈内有没有元素
        if (elements.length == 0){
            throw  new RuntimeException("stack is empy");
        }
        return elements[elements.length-1];
    }
    
}
