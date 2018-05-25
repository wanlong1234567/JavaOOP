package com.wanlong.OOPday03;

/**
 * @author wanlong
 * Date:2018/5/23
 * 向上造型的演示
 */
public class UpDemo {
    public static void main(String[] args) {
        Eoo o1 = new Eoo();
        o1.e = 1;
        o1.show();
        //o1.f = 2; //编译错误，父不能访问子的

        Foo o2 = new Foo();
        o2.f = 1;
        o2.say();
        o2.e = 2; //正确，子可以访问父的
        o2.show();

        Eoo o3 = new Foo(); //向上造型
        o3.e = 1;
        o3.show();
        //o3.f = 2; //编译错误，能点出来什么，看引用的类型
    }
}
class Eoo{
    int e;
    void show(){}
}
class Foo extends Eoo{
    int f;
    void say(){}
}
