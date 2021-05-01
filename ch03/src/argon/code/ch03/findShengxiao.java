package argon.code.ch03;

import java.util.Scanner;

public class findShengxiao {
    public static void main(String[] args) {
        String[] shengxiao;
        shengxiao= new String[]{"🐀", "🐂", "🐅", "🐇", "🐉", "🐍", "🐎", "🐏", "🐒", "🐓", "🐕", "🐖"};
        int years;
        var sc=new Scanner(System.in);
        System.out.print("请输入年份：");
        years=sc.nextInt();
        System.out.println(shengxiao[(years+8)%12]);//因为公元一年是鸡年所以在年份上+8mod12即可求出该年的生肖

    }
}
