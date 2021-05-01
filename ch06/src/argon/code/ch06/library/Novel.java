package argon.code.ch06.library;

public class Novel extends Book{
    private double runionrate=0.0015;
    public Novel(String name, String isbn, String publisher, String author, double price, double renttime, String rentperson) {
        super(name, isbn, publisher, author, price, renttime, rentperson);
    }

    public Novel() {
    }

    @Override
    public double getRunionrate() {
        return runionrate;
    }

    @Override
    public void setRunionrate(double runionrate) {
        this.runionrate = runionrate;
    }
}
