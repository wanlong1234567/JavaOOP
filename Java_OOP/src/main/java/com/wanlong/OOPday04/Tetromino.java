package com.wanlong.OOPday04;

/**
 * @author wanlong
 * Date:2018/5/23
 *
 * 四格拼板
 */
public class Tetromino {
    Cell[] cells;
    Tetromino(){
        cells = new Cell[4];
    }

    void drop(){
        for(int i=0;i<this.cells.length;i++){
            this.cells[i].row++;
        }
    }
    void moveLeft(){
        for(int i=0;i<cells.length;i++){
            cells[i].col--;
        }
    }
    void moveRight(){
        for(int i=0;i<cells.length;i++){
            cells[i].col++;
        }
    }
    void print(){ //输出4个格子的行号和列号
        for(int i=0;i<cells.length;i++){
            String str = cells[i].getCellInfo();
            System.out.println(str);
        }
    }
}
