package cn.edu.ncu.lijiahao;

import java.util.Scanner;

public class countAera {
    public static void main(String[] args) {
        var sc=new Scanner(System.in);
        double a,aera;
        System.out.println("请输入正六边形的边长a：");
        a=sc.nextDouble();
        aera=(3* Math.sqrt(3)/2)*Math.pow(a,2);
        System.out.println("面积是"+aera);
    }
}
