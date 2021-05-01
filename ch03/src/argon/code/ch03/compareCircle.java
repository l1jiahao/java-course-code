package argon.code.ch03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class compareCircle {
    public static void main(String[] args) {
        double r1,r2;
        double[] xy1 = new double[2],xy2=new double[2];
        var sc=new Scanner(System.in);
        System.out.println("请输入第一个圆的参数（X，Y）和半径");
        xy1[0]=sc.nextDouble();
        xy1[1]=sc.nextDouble();
        r1=sc.nextDouble();

        System.out.println("请输入第二个圆的参数（X，Y）和半径");
        xy2[0]=sc.nextDouble();
        xy2[1]=sc.nextDouble();
        r2=sc.nextDouble();


        var circle1=new Circle(xy1,r1,"圆1");//初始化两个圆对象
        var circle2=new Circle(xy2,r2,"圆2");

        Circle.circleRelation(circle1,circle2);
    }
}
