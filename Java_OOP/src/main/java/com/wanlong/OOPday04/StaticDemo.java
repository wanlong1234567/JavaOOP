package com.wanlong.OOPday04;

/**
 * @author wanlong
 * Date:2018/5/23
 *
 * static的演示
 */
public class StaticDemo {
    public static void main(String[] args) {
        Loo o1 = new Loo();
        o1.show();
        Loo o2 = new Loo();
        o2.show();
        System.out.println("Loo.b:"+Loo.b); //建议:类名点来访问
        System.out.println("01.b:"+o1.b);  //不建议对象点来访问

        Moo.test(); //常常通过类名点访问

        Noo o3 = new Noo();
        Noo o4 = new Noo();
        Noo o5 = new Noo();

    }
}

class Noo{ //演示静态块
    static{
        System.out.println("静态块");
    }
    Noo(){
        System.out.println("构造方法");
    }
}


class Moo{ //演示静态方法
    int a;
    static int b;
    void show(){
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    static void test(){
        //静态方法没有隐式的this传递
        //没有this就意味着没有对象
        //而实例变量a必须得通过对象点来访问
       // System.out.println(a); //编译错误
        System.out.println(b);
    }
}


class Loo{ //演示静态变量
    int a;
    static int b;
    Loo(){
        a++;
        b++;
    }
    void show(){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
