package test;

import java.util.*;

public class Main {
    public static void main(String[] args){

        Set<Student> s = new TreeSet<>();

        s.add(new Student("1001","ZhangSan"));

        s.add(new Student("1001","ZhangSan"));

        System.out.println(s);

    }

}
