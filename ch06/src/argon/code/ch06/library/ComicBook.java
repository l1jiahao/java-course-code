package argon.code.ch06.library;

public class ComicBook extends Book{
    private double runionrate=0.001;
    /*
    * 分别实现父类的两个构造方法
    * */
    public ComicBook(String name, String isbn, String publisher, String author, double price, double renttime, String rentperson) {
        super(name, isbn, publisher, author, price, renttime, rentperson);
    }

    public ComicBook() {
    }
    @Override
    public double getRunionrate() {
        return this.runionrate;
    }

    @Override
    public void setRunionrate(double runionrate) {
        this.runionrate = runionrate;
    }


}
