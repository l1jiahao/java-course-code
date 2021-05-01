package exercise;

import java.math.BigInteger;

public class countTimes {
    public static void main(String[] args) {
       BigInteger ans=new BigInteger("1");

        for (int i=1;i<=100;i++){
            ans=ans.multiply(countFactor(i));
        }
        System.out.println(ans);
    }
    public static BigInteger countFactor(int n){
        BigInteger factor=new BigInteger(String.valueOf((int) (Math.pow(2,n)+1)));
        return factor;
    }
}
