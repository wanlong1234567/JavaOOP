package com.wanlong.OOPday04;

/**
 * @author wanlong
 * Date:2018/5/23
 *
 * 格子类
 */
public class Cell {
    //成员变量
    int row; //行号
    int col; //列号
    Cell(){
        this(0,0);
    }
    Cell(int n){
        this(n,n);
    }
    Cell(int row,int col){
        this.row = row;
        this.col = col;
    }

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

    void drop(int n){ //下落n格
        row+=n;
    }
    void moveLeft(){ //左移1格
        col--;
    }
}
