package com.wanlong.OOPday03;

/**
 * @author wanlong
 * Date:2018/5/23
 */
public class T extends Tetromino{
    T(){
        this(0,0);
    }

    T(int row,int col){
        super(); //默认的，调用父类的构造方法
        super.cells[0] = new Cell(row,col);
        super.cells[1] = new Cell(row,col+1);
        super.cells[2] = new Cell(row,col+2);
        super.cells[3] = new Cell(row+1,col+1);
    }
}
