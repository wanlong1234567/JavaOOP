package com.wanlong.OOPday04;

/**
 * @author wanlong
 * Date:2018/5/23
 */
public class TJTest {
    public static void main(String[] args) {
        Tetromino t = new T(2,5);
        t.print();

        Tetromino j = new J(1,6);
        j.print();
    }

    //打墙+打T型
    public static void printWall(Tetromino t){
        for(int i=0;i<20;i++){
            for(int j=0;j<10;j++){
                //效率低、扩展性好
                boolean flag = true; //1.假设打-
                for(int k=0;k<t.cells.length;k++){
                    if(i==t.cells[k].row && j==t.cells[k].col){
                        flag = false; //2.修改为打*
                        break; //剩余格子不再参与比较了
                    }

                }
                if(flag==true){ //3.判断得结论
                    System.out.print("- ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
