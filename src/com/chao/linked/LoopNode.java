package com.chao.linked;

/**
 * ClassName:Node
 * Package:com.chao.linked
 * Description:
 *
 * @Date:2020/4/7 5:03
 * @Author: wxc
 */
//定义一个节点
public class LoopNode {
    //节点的信息
    int data;
    //下一个节点
    LoopNode next=this;
    
    //创建节点（零散的节点）
    public LoopNode(int data) {
        this.data = data;
    }
    

    
    
    //获取下一个节点
    public LoopNode next() {
        return this.next;
    }
    
    //获取节点中的数据
    public int getData() {
        return this.data;
    }
    //删除下一个节点
    public void removeNext(){
        //取出下一个节点
        LoopNode newNext = this.next();
        //将下下个节点设置为当前节点的下一个节点
        //this.next 是本节点
        //newNext 是下下节点
        this.next=newNext.next();
    }
    
    
    
    //插入一个节点
    public void after(LoopNode node){
        //取出下一个节点
        LoopNode nextNode = this.next();
        //将当前节点的下一个节点设置为node
        this.next=node;
        //将node的下一个节点设置为nextNode
        node.next=nextNode;
    }
}
