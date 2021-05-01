package exercise;

import java.util.Scanner;

public class uniqueNum {
    public static void main(String[] args){
       var numbers=new StringBuffer();
       var sc=new Scanner(System.in);
       String[] inputNum;
       inputNum=sc.nextLine().split(" ");//将输入的数字用空格进行分割
       for(int i=0;i<inputNum.length;i++){
           if(!inputNum[i].equals(" ") && numbers.indexOf(inputNum[i])<0 ){//只要数字不在字符串中
              numbers.append(inputNum[i]+" ");//利用边长字符串的特性储存每一个数字
           }
       }
       System.out.println(numbers);
    }
}
