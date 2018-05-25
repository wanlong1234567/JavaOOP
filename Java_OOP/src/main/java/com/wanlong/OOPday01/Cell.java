package com.wanlong.OOPday01;

/**
 * @author wanlong
 * Date:2018/5/22
 * 格子类
 */
public class Cell {
    //成员变量
    int row; //行号
    int col; //列号
    //方法
    void drop(){ //下落1格
        row++;
    }
    void moveLeft(int n){ //左移n格
        col-=n;
    }
    String getCellInfo(){ //获取格子的行号和列号
        return row+","+col;
    }
}
