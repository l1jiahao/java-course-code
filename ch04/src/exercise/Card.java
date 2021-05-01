package exercise;

import java.util.Random;

public class Card {
    private int count;
    private StringBuffer presentShape;
    private String[] Shapes=new String[]{"♥","♣","♦","♠"};
    private String[] Values=new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    public Card(){
        presentShape=new StringBuffer();
        count=0;
        //generateCard();构造方法，直接生成所需要的牌数
    }
    public void generateCard() {//选择某张扑克牌的花色和牌面大小
        var rand = new Random();
        do {
            int rand1 = rand.nextInt(4);
            int rand2 = rand.nextInt(13);
            System.out.println(Shapes[rand1] + Values[rand2]);
            if (presentShape.indexOf(Shapes[rand1])<0){
                presentShape.append(Shapes[rand1]);
            }
            count++;
        }while (presentShape.length()<4);
        //System.out.println("一共抽取了"+count+"次");
    }

    public int getCount() {
        return count;
    }
}