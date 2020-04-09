package com.chao.linkdemo;

import com.chao.linked.Node;

/**
 * ClassName:linkedDemo
 * Package:com.chao
 * Description:
 *
 * @Date:2020/4/7 5:08
 * @Author: wxc
 */
public class linkedDemo {
    public static void main(String[] args) {
        //创建节点
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        //不是通过同一个节点向后添加的
        n1.append(n2);
        n1.append(n3);
        n1.append(n4);
        n1.show();
        n1.removeNext();
        n1.show();
        
        n1.after(new Node(88));
        n1.show();
        
    }
}
