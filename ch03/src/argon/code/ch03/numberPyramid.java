package argon.code.ch03;

import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        int n;
        System.out.println("请输入：");
        var sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=0;j<2*(n-i);j++){
                System.out.printf(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.printf("%2d",j);
            }
            for (int j=i-1;j>0;j--){
                System.out.printf("%2d",j);
            }
            System.out.println();
        }
    }
}
