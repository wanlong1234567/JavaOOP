package com.wanlong.OOPday04.vis;

import com.wanlong.OOPday04.Hoo;

/**
 * @author wanlong
 * Date:2018/5/23
 */
public class Joo {
    void show(){
        Hoo o = new Hoo();
        o.a = 1;
        //o.b = 2;
        //o.c = 3;
        //o.d = 4;
    }
}

class Koo extends Hoo { //演示protected
    void show(){
        a = 1;
        b = 2;
        //c = 3;
        //d = 4;
    }
}
