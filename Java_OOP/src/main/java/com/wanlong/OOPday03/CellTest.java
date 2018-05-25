package com.wanlong.OOPday03;

/**
 * @author wanlong
 * Date:2018/5/23
 *
 * 格子类测试类
 */
public class CellTest {
    public static void main(String[] args) {
        Cell[] cells = new Cell[4]; //创建Cell数组对象
        cells[0] = new Cell(2,5); //创建Cell对象
        cells[1] = new Cell(2,6);
        cells[2] = new Cell(2,7);
        cells[3] = new Cell(3,6);
        printWall(cells[0]);

        Cell[] cs = new Cell[]{
                new Cell(2,5),
                new Cell(2,6),
                new Cell(2,7),
                new Cell(3,6)
        };

        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[2];
        arr[1][0] = 100;

        int[][] as = new int[3][4];
        for(int i=0;i<as.length;i++){
            for(int j=0;j<as[i].length;j++){
                as[i][j] = 100;
            }
        }

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
