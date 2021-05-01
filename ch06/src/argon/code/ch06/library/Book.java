package argon.code.ch06.library;

import java.util.Objects;

public class Book{
    private String name;
    private String isbn;
    private String publisher;
    private String author;
    private double price;
    private double renttime;
    private String rentperson;
    private double runionrate;

    public Book(String name, String isbn, String publisher, String author, double price, double renttime, String rentperson) {
        this.name = name;
        this.isbn = isbn;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.renttime = renttime;
        this.rentperson = rentperson;
    }

    /*
    * 构造方法重载设置默认值
    * */
    public Book(){
        this(null,null,null,null,0,0,null);
    }

    public void setRenttime(double renttime) {
        this.renttime = renttime;
    }

    public void setRentperson(String rentperson) {
        this.rentperson = rentperson;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRunionrate() {
        return runionrate;
    }

    public double getPrice() {
        return price;
    }

    public double getRenttime() {
        return renttime;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getRentperson() {
        return rentperson;
    }

    public void setRunionrate(double runionrate) {
        this.runionrate = runionrate;
    }
/*
* 此处书本的ISBN号可以唯一确定书本 重写equals方法可以实现此功能
* */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return
                "书名=" +"《" +name +"》"+
                " ISBN=" + isbn +
                " 出版商=" + publisher +
                " 作者=" + author +
                " 预估价格=" + price +
                " 被借阅时长=" + renttime +
                " 借阅人=" + rentperson
                ;
    }
}
