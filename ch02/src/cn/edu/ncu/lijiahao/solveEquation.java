package cn.edu.ncu.lijiahao;

import java.util.Scanner;

public class solveEquation {
    public static void main(String[] args) {
        var sc=new Scanner(System.in);
        double a,b,c,d,m,n,x,y;
        System.out.println("以ax+by=m的形式输入两组参数");
/*        System.out.println("输入参数a：");*/
        a=sc.nextDouble();
        /*System.out.println("输入参数b：");*/
        b=sc.nextDouble();
        m=sc.nextDouble();
        /*System.out.println("输入参数c：");*/
        c=sc.nextDouble();
        /*System.out.println("输入参数d：");*/
        d=sc.nextDouble();
        n=sc.nextDouble();
        x=(d*m-b*n)/(a*d-b*c);
        y=(a*n-c*m)/(a*d-b*c);
        System.out.printf("X=%6.2f,Y=%6.2f",x,y);

    }
}
