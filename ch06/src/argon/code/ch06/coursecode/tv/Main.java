package argon.code.ch06.coursecode.tv;

import java.util.Scanner;

public class Main {
    public void menu(){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
    }

    public static void main(String[] args) {
        var tv=new TvSet();
        var sys=new Main();
        var sc=new Scanner(System.in);
        do{
            sys.menu();
            switch (sc.nextInt()){
                case 1->tv.turnOn();
                case 2->tv.decreaseVolum();
                case 3->tv.increaseVoluem();
                case 4->tv.trunOff();
                default -> System.exit(0);
            }
        }while (true);
    }
}
