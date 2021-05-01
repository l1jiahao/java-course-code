package cn.edu.ncu.ljh;

import javafx.scene.layout.Pane;

import java.util.Arrays;

public class Test {
    public static void printArray(String... array){
        for(int i=0;i< array.length;i++){
            array[i]="hello";
        }
        System.out.println(Arrays.toString(array));
        }

    public static void main(String[] args){
        printArray();
    }
}
