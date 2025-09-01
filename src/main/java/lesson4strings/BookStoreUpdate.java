package lesson4strings;

import java.text.DecimalFormat;

public class BookStoreUpdate {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    String euro = "EUR";
    String cad = "CAD";

    public static void main(String[] args) {

        BookStoreUpdate book = new BookStoreUpdate();
        book.createNewBook("Harry Potter", "J.K.Rowling", 1, 17.75, false);
        book.createNewBook("Anna Karenina", "L. Tolstoy", 2, 15.65, true);
    }

    public void createNewBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable) {
        double priceInEUR = calculatePrice(priceInUSD, euro);
        double priceInCAD = calculatePrice(priceInUSD, cad);
        System.out.println("The book name is " + bookName + ", author is " + authorName + "id: " + id);
        System.out.println("The price: " + priceInUSD + " USD / " + df.format(priceInEUR) + " EUR /" + df.format(priceInCAD) + " CAD");
        System.out.println("The book is available: " + isAvailable);
    }

    public double calculatePrice(double priceInUSD, String currency) {
        double rate = 1; // rate = 1 allows us to return price without change
        if (currency.equals(euro)) {
            rate = 1.1;
        } else if (currency.equals(cad)) {
            rate = 1.35;
        } else {
            System.out.println("Error: unknown currency, USD price will be returned");
        }
//        return Math.round(priceInUSD * rate * 100.0) / 100.0;
        return priceInUSD * rate;
    }
}
