package com.wanlong.OOPday02;

/**
 * @author wanlong
 * Date:2018/5/23
 * 格子测试类
 */
public class CellTest {
    public static void main(String[] args) {
        /*
		Cell c = new Cell();
		c.row = 2;
		c.col = 5;
		c.drop();
		c.drop(3);
		c.moveLeft();
		c.moveLeft(2);
		printWall(c);
		*/

        Cell c1 = new Cell(); //0,0
        Cell c2 = new Cell(3); //3,3
        Cell c3 = new Cell(2,5); //2,5
        printWall(c2);

    }


    //打墙+打格
    public static void printWall(Cell cc){
        for(int i=0;i<20;i++){ //行
            for(int j=0;j<10;j++){ //列
                if(i==cc.row && j==cc.col){ //行列匹配
                    System.out.print("* ");
                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
