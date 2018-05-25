package com.wanlong.OOPday02;

/**
 * @author wanlong
 * Date:2018/5/23
 * 补充:
 * 1)在一个文件中，可以包含多个类
 * 2)public修饰的类，只能有一个
 * 3)public修饰的类必须与文件名相同
 *
 * 重载的演示
 */
public class OverloadDemo {
    public static void main(String[] args) {
        Aoo o = new Aoo();
        o.say();
        o.say("zhangsan");
        o.say(25);
        o.say("zhangsan", 25);
        o.say(25, "zhangsan");
    }
}
class Aoo{
    void say(){}
    void say(String name){}
    void say(int age){}
    void say(String name,int age){}
    void say(int age,String name){}

    //int say(){return 1;} //编译错误，重载与返回值类型无关。和第一个
    //void say(String address){} //编译错误，重载与参数名称无关。第2个
}
