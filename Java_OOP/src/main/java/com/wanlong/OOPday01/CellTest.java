package com.wanlong.OOPday01;

/**
 * @author wanlong
 * Date:2018/5/22
 * 格子测试类
 */
public class CellTest {
    public static void main(String[] args) {
        /*
		Cell c = new Cell();
		c.row = 2;
		c.col = 5;
		c.drop();
		c.moveLeft(3);
		String str = c.getCellInfo();
		System.out.println(str); //3,2
		*/

        Cell c = new Cell();
        c.row = 2;
        c.col = 5;
        printWall(c); //Cell cc = c;

        c.drop();
        System.out.println("下落后:");
        printWall(c);
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
