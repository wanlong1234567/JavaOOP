package com.wanlong.OOPday05;

/**
 * @author wanlong
 * Date:2018/5/23
 *
 * final的演示
 */
public class FinalDemo {
    public static void main(String[] args) {

    }
}
//演示final修饰类
final class Doo{}
//class Eoo extends Doo{} //编译错误，final的类不能被继承
class Foo{}
final class Goo extends Foo{} //正确


class Boo{ //演示final修饰方法
    void show(){}
    final void say(){}
}
class Coo extends Boo{
    void show(){}
    //void say(){} //编译错误，final的方法不能被重写
}

/*
 * final修饰成员变量，只有两种初始化方式:
 *   1)声明同时初始化
 *   2)构造方法中初始化
 * final修饰局部变量，只要在用之前初始化即可
 */
class Aoo{ //演示final修饰变量
    final int num = 5;
    final int b=1;
    final int count;
    Aoo(){
        count = 6;
    }
    void show(){
        final int a;
        //num = 55; //编译错误，final的变量不能被改变
    }
}



