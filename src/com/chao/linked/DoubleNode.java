package com.chao.linked;

/**
 * ClassName:DoubleNode
 * Package:com.chao.linked
 * Description:
 *
 * @Date:2020/4/8 13:03
 * @Author: wxc
 */
public class DoubleNode {
    //上一个节点
    DoubleNode pre = this;
    //下一个节点
    DoubleNode next = this;
    //节点的数据
    int data;
    
    public DoubleNode(int data) {
        this.data = data;
    }
    
    
    //添加节点
    public void after(DoubleNode node){
        DoubleNode nextNode = this.next;
    
        this.next = node;
        node.pre = this;
        
        node.next= nextNode;
        nextNode.pre = node;
        
    }
    
    //下一个节点
    public DoubleNode next(){
        return this.next;
    }
    //下一个节点
    public DoubleNode pre(){
        return this.pre;
    }
    
    //获取数据
    public int getData(){
        return this.data;
    }
    
}
