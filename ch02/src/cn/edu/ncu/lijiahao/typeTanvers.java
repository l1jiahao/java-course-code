package cn.edu.ncu.lijiahao;


public class typeTanvers {
    public static void main(String[] args) {
        int m=25;
        int r=35;
        Integer ans=m*r*r;
        System.out.println(getType(ans.floatValue()));

    }
    private static String getType(Object a) {
        return a.getClass().toString();

    }
}
