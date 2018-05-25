package com.wanlong.OOPday04;

/**
 * @author wanlong
 * Date:2018/5/23
 *
 * 重写与重载的区别
 */
public class OverrideOverloadDemo {
    public static void main(String[] args) {
        Goo goo = new Goo();
        Eoo o = new Foo();
        goo.test(o); //重载看引用的类型(Eoo)
        o.show();
    }
}
class Goo{
    //重载
    void test(Eoo o){
        System.out.println("父型参数");
        o.show(); //重写看对象的类型(Foo)
    }
    void test(Foo o){
        System.out.println("子型参数");
        o.show();
    }
}
//重写
class Eoo{
    void show(){
        System.out.println("父类show");
    }
}
class Foo extends Eoo{
    void show(){
        System.out.println("子类show");
    }
}
