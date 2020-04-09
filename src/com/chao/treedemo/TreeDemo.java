package com.chao.treedemo;

import com.chao.tree.BinaryTree;
import com.chao.tree.TreeNode;

/**
 * ClassName:TreeDemo
 * Package:com.chao.treedemo
 * Description:
 *
 * @Date:2020/4/8 19:21
 * @Author: wxc
 */
public class TreeDemo {
    public static void main(String[] args) {
        //创建一颗树
        BinaryTree binaryTree = new BinaryTree();
        //创建一个根节点
        TreeNode root = new TreeNode(1);
        //把根节点赋给树
        binaryTree.setRoot(root);
        //创建两个节点
        TreeNode rootL = new TreeNode(2);
        TreeNode rootR = new TreeNode(3);
        //把左右节点赋给根节点
        root.setLeftNode(rootL);
        root.setRightNode(rootR);
        //为2创建两个节点
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        //为3创建两个节点
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
        //前序遍历
        binaryTree.frontShow();
        System.out.println();
        //中序遍历
        binaryTree.midShow();
        System.out.println();
        //后序遍历
        binaryTree.afterShow();
        System.out.println();
        //前序查找
        TreeNode result = binaryTree.frontSearch(156);
        System.out.println(result);
    
        System.out.println("--------------");
        binaryTree.delete(3);
        binaryTree.frontShow();
    }
}
