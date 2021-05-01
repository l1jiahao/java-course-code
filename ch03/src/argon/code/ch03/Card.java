package argon.code.ch03;

import java.util.Random;

public class Card {
    private String shape;
    private String value;
    String[] Shapes=new String[]{"♥","♣","♦","♠"};
    String[] Values=new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    public Card(int n){
        generateCard(n);//构造方法，直接生成所需要的牌数
    }
    private void generateCard(int n) {//选择某张扑克牌的花色和牌面大小
        var rand = new Random();
        for (int i=0;i<n;i++){
            int rand1 = rand.nextInt(4);
            int rand2 = rand.nextInt(13);
            System.out.println(Shapes[rand1] + Values[rand2]);
        }
    }
}
