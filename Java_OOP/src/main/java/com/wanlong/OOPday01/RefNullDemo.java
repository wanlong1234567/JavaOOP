package com.wanlong.OOPday01;

/**
 * @author wanlong
 * Date:2018/5/22
 * 引用类型画等号与null的演示
 */
public class RefNullDemo {
    public static void main(String[] args) {
        Cell c = new Cell();
        Cell cc = c; //指向同一个对象
        c.row = 2;
        cc.row = 5;
        System.out.println(c.row); //5

        int a = 5;
        int b = a; //赋值
        b = 8;
        System.out.println(a); //5

        Cell ccc = new Cell();
        ccc.row = 1;
        ccc = null; //空，没有指向任何对象
        //ccc.row = 2; //NullPointerException空指针异常
    }
}
