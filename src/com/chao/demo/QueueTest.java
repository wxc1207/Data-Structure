package com.chao.demo;

import com.chao.sequent.MyQueue;

/**
 * ClassName:QueueTest
 * Package:com.chao.demo
 * Description:
 *
 * @Date:2020/4/7 4:56
 * @Author: wxc
 */
public class QueueTest {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.add(2);
        mq.add(6);
        mq.add(69);
        mq.add(697);
        mq.add(6974);
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        System.out.println(mq.isEmpy());
        System.out.println(mq.poll());
        System.out.println(mq.isEmpy());
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        System.out.println(mq.isEmpy());
        
    }
}
