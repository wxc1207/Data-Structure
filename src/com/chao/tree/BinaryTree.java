package com.chao.tree;

import sun.reflect.generics.tree.Tree;

/**
 * ClassName:BinaryTree
 * Package:com.chao.tree
 * Description:
 *
 * @Date:2020/4/8 19:15
 * @Author: wxc
 */
public class BinaryTree {
    
    //设置根节点
    TreeNode root;
    
    public TreeNode getRoot() {
        return root;
    }
    
    public void setRoot(TreeNode root) {
        this.root = root;
    }
    
    //前序遍历
    public void frontShow() {
        if (root!=null) {
            root.frontShow();
        }
    }
    
    //中序遍历
    public void midShow() {
        if (root != null) {
            root.midShow();
        }
    }
    //后序遍历
    public void afterShow() {
            if (root!=null) {
                root.afterShow();
            }
    }
    
    //前序查找
    public TreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }
    //删除节点
    public void delete(int i) {
        if (root.value == i){
            root =null;
        }else {
            root.delete(i);
        }
    }
}
