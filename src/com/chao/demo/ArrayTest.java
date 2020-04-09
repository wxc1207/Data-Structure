package com.chao.demo;

import com.chao.sequent.MyArray;

/**
 * ClassName:ArrayTest
 * Package:com.chao.demo
 * Description:
 *
 * @Date:2020/4/6 21:56
 * @Author: wxc
 */
public class ArrayTest {
    public static void main(String[] args) {
        MyArray ma= new MyArray();
        ma.add(99);
        ma.add(78);
        ma.add(734);
        ma.add(34);
        System.out.println(ma.size());
        ma.add(165);
        ma.show();
        ma.delete(2);
        ma.show();
        System.out.println(ma.get(2));
        System.out.println("---------------------------------------寂寞的分割线");
        ma.show();
        ma.insert(2,444);
        ma.show();
        System.out.println("---------------------------------------寂寞的分割线");
        ma.show();
        ma.set(2,9999);
        ma.show();
        System.out.println("---------------------------------------寂寞的分割线");
        System.out.println(ma.search(16));
    
        MyArray maa= new MyArray();
        maa.add(2);
        maa.add(6);
        maa.add(9);
        maa.add(15);
        maa.add(23);
        maa.add(36);
        System.out.println(maa.binarySearch(15));
    
        System.out.println("*************************");
        maa.insert(0,123);
        maa.show();
        MyArray mm = new MyArray();
        
        
        
    }
}
