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
public class Node {
    //节点的信息
    int data;
    //下一个节点
    Node next;
    
    //创建节点（零散的节点）
    public Node(int data) {
        this.data = data;
    }
    
    //为节点追加节点
    public Node append(Node node) {
        //获取当前节点
        Node currentNode = this;
        //循环向后找
        while (true) {
            //取出下一个节点
            Node nextNode = currentNode.next;
            //如果下个节点为空，证明是最后的节点
            if (nextNode == null) {
                break;
            }
            currentNode = nextNode;
        }
        
        //将需要添加的节点复制到当前节点的下一个
        currentNode.next = node;
        return this;
    }
    
    //判断当前的节点是不是最后的节点
    public boolean isLast() {
        return next == null;
    }
    
    //获取下一个节点
    public Node next() {
        return this.next;
    }
    
    //获取节点中的数据
    public int getData() {
        return this.data;
    }
    //删除下一个节点
    public void removeNext(){
        //取出下一个节点
        Node newNext = this.next();
        //将下下个节点设置为当前节点的下一个节点
        //this.next 是本节点
        //newNext 是下下节点
        this.next=newNext.next();
    }
    
    //显示所有节点信息
    public void show(){
        //获取当前节点
        Node currentNode = this;
        while (true){
            //打印当前节点
            System.out.print(currentNode.getData() + " ");
            //查找下一个节点
            currentNode = currentNode.next();
            if (currentNode ==  null) {
                break;
            }
        }
        System.out.println();
    }
    
    //插入一个节点
    public void after(Node node){
        //取出下一个节点
        Node nextNode = this.next();
        //将当前节点的下一个节点设置为node
        this.next=node;
        //将node的下一个节点设置为nextNode
        node.next=nextNode;
    }
}
