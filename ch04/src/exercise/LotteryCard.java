package exercise;

public class LotteryCard {
    public static void main(String[] args){
        var card =new Card();
        card.generateCard();
        System.out.println("一共抽取了"+card.getCount()+"次");
    }
}
