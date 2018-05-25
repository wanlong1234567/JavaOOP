package com.wanlong.OOPday05;

/**
 * @author wanlong
 * Date:2018/5/23
 *
 * 求一组图形的最大面积
 */
public class ShapeTest {
    public static void main(String[] args) {
        //Shape s = new Shape(); //编译错误，抽象类不能被实例化
        Shape[] shapes = new Shape[4]; //创建Shape数组对象
        shapes[0] = new Circle(1); //向上造型
        shapes[1] = new Circle(2); //大
        shapes[2] = new Square(1);
        shapes[3] = new Square(2);
        maxArea(shapes);
    }
    public static void maxArea(Shape[] shapes){
        double max = shapes[0].area();
        int maxIndex = 0; //最大面积下标
        for(int i=1;i<shapes.length;i++){
            double area = shapes[i].area();
            if(area>max){
                max=area;
                maxIndex=i;
            }
        }
        System.out.println("最大面积为:"+max+"，所在下标为:"+maxIndex);
    }
}

/**
 *  1)public:公共的，任何类
 2)private:私有的，本类
 3)protected:受保护的，本类、子类、同包类
 4)默认的:什么也不写，本类、同包类
 */
abstract class Shape{ //抽象类
    protected double c; //周长
    public abstract double area();
}
class Circle extends Shape{
    public Circle(double c){
        super.c = c;
    }
    public double area(){ //重写抽象方法
        return 0.0796*c*c; //0.0625
    }
}
class Square extends Shape{
    public Square(double c){
        this.c = c;
    }
    public double area(){
        return 0.0625*c*c;
    }
}

class b extends Shape{

    @Override
    public double area() {
        return 0;
    }
}
abstract class v extends Shape{

}