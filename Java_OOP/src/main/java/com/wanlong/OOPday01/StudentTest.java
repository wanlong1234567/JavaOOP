package com.wanlong.OOPday01;

/**
 * @author wanlong
 * Date:2018/5/22
 * 学生的测试类
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建一个学生对象
        Student zs = new Student();
        //访问成员变量
        zs.name = "zhangsan";
        zs.age = 25;
        zs.address = "河北廊坊";
        //调用方法
        zs.study();
        zs.sayHi();

        Student ls = new Student();
        ls.name = "lisi";
        ls.age = 26;
        ls.address = "黑龙江佳木斯";
        ls.study();
        ls.sayHi();

        //1.创建一个学生对象
        //2.给所有成员变量赋默认值
        Student ww = new Student();
        ww.study();
        ww.sayHi();
    }
}
