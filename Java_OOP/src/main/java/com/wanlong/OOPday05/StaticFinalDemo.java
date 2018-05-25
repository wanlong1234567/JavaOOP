package com.wanlong.OOPday05;

/**
 * @author wanlong
 * Date:2018/5/23
 *
 * static final的演示
 */
public class StaticFinalDemo {
    public static void main(String[] args) {
        System.out.println(Hoo.PI); //通过类名点来访问
        //Hoo.PI = 3.1415926; //编译错误，常量不能被改变

        //1)加载Ioo.class到方法区
        //2)静态变量num一并存储在方法区中
        //3)到方法区中获取num并输出
        System.out.println(Ioo.num);

        //编译器在编译时直接被替换为具体的值，效率高
        //System.out.println(5);
        System.out.println(Ioo.COUNT);

    }
}

class Ioo{
    public static int num = 5; //静态变量
    public static final int COUNT = 5; //常量
}

class Hoo{
    public static final double PI = 3.14159;
    //public static final int NUM; //编译错误，必须声明同时初始化
}
