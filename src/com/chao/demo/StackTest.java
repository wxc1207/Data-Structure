package com.chao.demo;

import com.chao.sequent.MyStack;

/**
 * ClassName:StackTest
 * Package:com.chao.demo
 * Description:
 *
 * @Date:2020/4/7 4:36
 * @Author: wxc
 */
public class StackTest {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(1);
        ms.push(5);
        ms.push(9);
        System.out.println(ms.pop());
        
        System.out.println(ms.peek());
        
        
    }
}
