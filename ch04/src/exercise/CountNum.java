package exercise;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        int[] count={0,0,0,0,0,0,0,0,0};//用于统计每个数字出现的次数
        char[] splitNum;//存放分割过的数字
        String number;
        var sc=new Scanner(System.in);
        while(!(number=sc.next()).equals("0")){//读入字符串类型的数字
            splitNum=number.toCharArray();
            for (char c : splitNum) {//利用字符迭代
                count[(int) c - 48]++;//将字符转化为对应的ASCII数字 减去48为相应的数值
            }
           System.out.println("下一个");
        }
        for (int i=0;i<count.length;i++){
            if (count[i]!=0){
                System.out.println(i+"出现了"+count[i]+"次");
            }
        }
    }
}
