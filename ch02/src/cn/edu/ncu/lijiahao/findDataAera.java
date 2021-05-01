package cn.edu.ncu.lijiahao;

import java.util.Scanner;

public class findDataAera {
    public static void main(String[] args) {
        var sc=new Scanner(System.in);
        System.out.printf("%c~%c\n",Character.MIN_VALUE,Character.MAX_VALUE);//字符类型的范围
        System.out.printf("%d~%d\n",Short.MIN_VALUE,Short.MAX_VALUE);//short类型的范围
        System.out.printf("%f~%f\n",Double.MIN_VALUE,Double.MAX_VALUE);//double类型的范围
        System.out.printf("%f~%f\n",Float.MIN_VALUE,Float.MAX_VALUE);//float类型的范围
        System.out.printf("%d~%d\n",Long.MIN_VALUE,Long.MAX_VALUE);//long类型的范围
        System.out.printf("%d~%d\n",Integer.MIN_VALUE,Integer.MAX_VALUE);//int类型的范围
        Long testdata=sc.nextLong();//如果读入参数报错则证明该数超过long的范围
        System.out.println(testdata);

    }
}
