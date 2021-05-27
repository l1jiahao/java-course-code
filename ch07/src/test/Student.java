package test;

import java.util.Objects;

public class Student {
    private String id;

    private String name;



    public Student(String id,String name){

        this.name = name;

        this.id = id;

    }



    public String toString(){

        return this.id;

    }
}
