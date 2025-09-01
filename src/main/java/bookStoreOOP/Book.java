package bookStoreOOP;
import java.text.DecimalFormat;

public abstract class Book {

    String bookName;
    String authorName;
    int id;
    double usdPrice;
    boolean isAvailable;

    String euro = "EUR";
    String cad = "CAD";

    private static final DecimalFormat df = new DecimalFormat("0.00");


    public Book (String bookName, String authorName, int id, double usdPrice, boolean isAvailable){
        this.bookName = bookName;
        this.authorName = authorName;
        this.id = id;
        this.usdPrice = usdPrice;
        this.isAvailable = isAvailable;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public double getUsdPrice() {
        return usdPrice;
    }
    public void setUsdPrice(double usdPrice) {
        this.usdPrice = usdPrice;
    }

    public double convertPrice(String currency) {
        double rate = 1; // rate = 1 allows us to return price without change
        if (currency.equals(euro)) {
            rate = 1.1;
        } else if (currency.equals(cad)) {
            rate = 1.2;
        } else {
            System.out.println("Error: unknown currency, USD price will be returned");
        }
//        return Math.round(priceInUSD * rate * 100.0) / 100.0;
        return usdPrice * rate;
    }

    public void printBookDetails(){
        System.out.println("*********");
        System.out.println("This book name is "+ bookName);
        System.out.println("This book author name is " + authorName);
        System.out.println("This book price is "+ usdPrice + " USD, " + df.format(convertPrice(euro)) + " EUR, " +df.format(convertPrice(cad)) + " CAD");
        System.out.println("This book is " + isAvailable);
    }


}
