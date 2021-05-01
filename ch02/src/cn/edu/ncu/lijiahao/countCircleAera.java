package cn.edu.ncu.lijiahao;

import java.util.Scanner;

import static java.lang.StrictMath.PI;

public class countCircleAera {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double radius;
        radius=sc.nextDouble();
        double aera=radius*radius*PI;
        System.out.printf("The aera is %.2f",aera);
    }
}
