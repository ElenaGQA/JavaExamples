package lesson3loops;

public class BookStore3 {
    public static void main(String[] args) {

        BookStore3 book1 = new BookStore3();
        book1.createNewBook("Harry Potter", "J.K.Rowling", 1, 10, false);
        book1.createNewBook("Anna Karenina", "L. Tolstoy", 2, 20, true);
    }

    public void createNewBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable) {
        double conversionRate = 1.1;
        double priceInEUR = priceInUSD * conversionRate;
        System.out.println("The book name is " + bookName + ". The author of the book is " + authorName);
        System.out.println("The book id: " + id);
        System.out.println("The book price: " + priceInUSD + " USD / " + priceInEUR + " EUR");
        System.out.println("The book is available: " + isAvailable);
    }
}
