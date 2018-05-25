package com.wanlong.OOPday06;

/**
 * @author wanlong
 * Date:2018/5/25
 */
public class InnerClassDemo {
    public static void main(String[] args) {
        Mama m = new Mama();
        m.setName("111");
        m.createBaby();

        //Baby b = new Baby(); //编译错误，内部类对外不具备可见性
    }
}

class Mama{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    Baby createBaby(){
        return new Baby();
    }
    class Baby{
        void show(){
            System.out.println(name);
            System.out.println(Mama.this.name);
            //System.out.println(this.name); //编译错误
        }
    }
}

