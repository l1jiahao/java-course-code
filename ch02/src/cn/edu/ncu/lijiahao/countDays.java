package cn.edu.ncu.lijiahao;

import java.util.Scanner;

public class countDays {
    public static void main(String[] args) {
        var sc=new Scanner(System.in);
        System.out.println("请输入分钟数来转换成天数和年数：");
        double mintues,days,years;
        mintues=sc.nextDouble();
        days=mintues/1440;
        years=mintues/525600;
        System.out.printf("%6.2f分钟对应着%6.2f年或%6.2f天",mintues,years,days);
    }
}
