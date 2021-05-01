package argon.code.ch05.test1;

import java.time.LocalDate;
import java.util.Locale;

public class Studen {
/*    private class Address{//private 可以修饰类 顶层不能 内部可以

    }*/
    private String name;
    private LocalDate birthday;
    Address address =new Address();
    static int number=1;
    public  Studen(){
        number++;
    }
    public void s(){
        System.out.println(number);
    }

}
