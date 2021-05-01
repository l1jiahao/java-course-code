package argon.code.ch06.library;

public class LibraryTest {
    public static void main(String x[]){
        var b1=new ComicBook("ican","001","TH","myself",99,1,"ljh");
        System.out.println(b1.getRentperson());
        System.out.println(b1.getRunionrate());
        Library.enroll(b1);
        Library.rent(b1,"jjj",10);
        Library.showInfo(b1);
        Library.drop(b1);
        System.out.println(Library.inLibrary(b1));
    }
}
