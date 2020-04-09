package com.chao.sequent;

/**
 * ClassName:MyDiGui
 * Package:com.chao.sequent
 * Description:
 *
 * @Date:2020/4/8 13:56
 * @Author: wxc
 */
public class MyDiGui {
    public static void main(String[] args) {
       hanoi(3,'A','B','C');
    }
    
    
    //斐波那契数列
    public static int fun(int i){
        if (i==1 || i==2){
            return 1;
        }else {
            return fun(i-1)+fun(i-2);
        }
    }
    
    /**
     *
     * @param n    共有多少个盘子
     * @param from 开始的柱子
     * @param in   中间的柱子
     * @param to   目标柱子
     *  思想：无论有多少个盘子，都认为都是只有两个盘子，上面的所有盘子和最下面的一个盘子
     */
    public static void hanoi(int n,char from,char in,char to){
        //只有一个盘子时
        if (n==1){
            System.out.println("第1个盘子从"+from+"移动到"+to);
            //多个盘子时
            //无论有多少个盘子，都认为都是只有两个盘子，上面的所有盘子和最下面的一个盘子
        }else{
            //递归:将上面的盘子移动到 中间位置
            hanoi(n-1,from,to,in);
            //将最下面的盘子移动到目标位置
            System.out.println("第"+n+"个盘子从"+from+"移动到"+to);
            //递归：将上面的盘子从中间位置移动到目标位置
            hanoi(n-1,in,from,to);
        }
        
    }
}
