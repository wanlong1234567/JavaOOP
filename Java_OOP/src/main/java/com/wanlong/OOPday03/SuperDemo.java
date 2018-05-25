package com.wanlong.OOPday03;

/**
 * @author wanlong
 * Date:2018/5/23
 * super的演示
 */
public class SuperDemo {
    public static void main(String[] args) {
        Coo o=new Coo(0);
    }
}
class Coo{
    Coo(int n){
    }
}
class Doo extends Coo{
    Doo(){
        super(5);
    }

	/*
	//下面的代码，都是默认的
	Doo(){
		super();
	}
	*/
}