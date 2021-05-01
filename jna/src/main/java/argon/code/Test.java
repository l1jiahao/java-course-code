package argon.code;


public class Test {
    public static void main(String... args){
        CLibrary.instance.SayHello();
        System.out.println(CLibrary.instance.addTest(1,2));
    }
}
