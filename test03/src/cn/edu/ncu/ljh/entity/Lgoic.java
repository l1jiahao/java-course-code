package cn.edu.ncu.ljh.entity;

public class Lgoic {
    private static Lgoic instance = null;

    private Lgoic(){

    }

    public static Lgoic getInstance(){
        if(instance == null)
            instance  = new Lgoic();
        return instance;
    }

    public void display(){
        System.out.println("hlll");
    }
}
