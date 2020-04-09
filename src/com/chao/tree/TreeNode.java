package com.chao.tree;

/**
 * ClassName:TreeNode
 * Package:com.chao.tree
 * Description:
 *
 * @Date:2020/4/8 19:18
 * @Author: wxc
 */
public class TreeNode {
    //节点数据（我存储的是int类型）
    int value;
    //左儿子
    TreeNode leftNode;
    
    //右儿子
    TreeNode rightNode;
    
    public TreeNode(int value) {
        this.value = value;
    }
    
    //设置左节点
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }
    
    //设置右节点
    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
    
    //前序遍历
    public void frontShow() {
        //先遍历当前节点
        System.out.print(value + " ");
        //左节点
        if (leftNode != null) {
            leftNode.frontShow();
        }
        //右节点
        if (rightNode != null) {
            rightNode.frontShow();
        }
        
    }
    
    //中序遍历
    public void midShow() {
        //左节点
        if (leftNode != null) {
            leftNode.midShow();
        }
        //遍历当前节点
        System.out.print(value + " ");
        //右节点
        if (rightNode != null) {
            rightNode.midShow();
        }
    }
    
    //后序遍历
    public void afterShow() {
        //左节点
        if (leftNode != null) {
            leftNode.afterShow();
        }
        //右节点
        if (rightNode != null) {
            rightNode.afterShow();
        }
        //遍历当前节点
        System.out.print(value + " ");
    }
    
    //前序查找
    public TreeNode frontSearch(int i) {
        TreeNode target = null;
        //查看当前节点
        if (this.value == i) {
            return this;
            //当前的节点不是要查找的节点
        } else {
            //查找左节点
            if (leftNode != null) {
                //左边可能查到，也可能查不到
                target = leftNode.frontSearch(i);
            }
            //左节点查到的话，进行返回
            if (target != null) {
                return target;
            }
            //左节点查不到的话，查找右节点
            if (rightNode != null) {
                //无论是否查到，都进行赋值
                target = rightNode.frontSearch(i);
            }
        }
        //查到的话，返回节点
        //查不到的话，返回null
        return target;
        
    }
    //删除子树
    public void delete(int i ) {
        //将父节点保存
       TreeNode parent = this;
       //判断左儿子
        if (parent.leftNode!= null&& parent.leftNode.value==i){
            parent.leftNode = null;
            return;
        }
        //判断右儿子
        if (parent.rightNode!=null && parent.rightNode.value==i){
            parent.rightNode=null;
            return;
        }
        //递归检查并删除左儿子
        parent=leftNode;
        if (parent!=null){
            parent.delete(i);
        }
       //递归检查并删除右儿子
        parent=rightNode;
        if (parent!=null){
            parent.delete(i);
        }
        
    }
}
