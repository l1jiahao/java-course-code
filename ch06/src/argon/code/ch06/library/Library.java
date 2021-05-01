package argon.code.ch06.library;

import java.util.ArrayList;

public class Library {
    static  ArrayList<Book> bookstorage=new ArrayList<>();
    public    Library(){
    }
    /*
    * 此处存入新的图书即将新的图书对象存入Book数组中
    * */
    static void enroll(Book book){
        bookstorage.add(book);
        System.out.println(book.toString());
    }
    /*
    * 此处要将某本书的数据清空则将其置为含有默认值的对象
    * */
    static  boolean drop(Book book){
            if(bookstorage.contains(book)){
                bookstorage.remove(book);
                return true;
            }
        return false;
    }
    /*
    * 在图书中添加借阅人和借阅时长的信息
    * */
    static  void rent(Book book,String person,double time){
        book.setRentperson(person);
        book.setRenttime(time);
        automodifyPrice(book);
    }
    /*
    * 在Library中可以直接修改图书的价格
    * */
    static  void alertPrice(Book book,double price){
        book.setPrice(price);
    }
    /*
    * 在借阅时直接自动修正书本的预估价格
    * */
    static  void automodifyPrice(Book book){
        book.setPrice((1- book.getRenttime()*book.getRunionrate())*book.getPrice());
    }
    /*
    * 直接打印出某本书的信息
    * */
    static void showInfo(Book book){
        System.out.println(book.toString());
    }
    /*
    * 判断书本是否在图书馆内
    * */
    static boolean inLibrary(Book book){
        return bookstorage.contains(book);
    }
    static boolean inLibrary(String isbn){
        for(var books:bookstorage){
            if(books.getIsbn().equals(isbn)) return true;
        }
        return false;
    }
    /*
    * 查找图书
    * */
    static Book findBook(String isbn){
        for(var books:bookstorage){
            if(books.getIsbn().equals(isbn)) return bookstorage.get(bookstorage.indexOf(books));
        }
        return null;
    }
}
