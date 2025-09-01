package lesson2;

public class BookStore {
    // describe a book, create all the variables we need
    // name, author, id, price in USD, availability
    // using conversion rate, calculate EUR price of book
    // print all the book details including book price
    public static void main(String[] args) {
        String bookName = "Harry Potter";
        String authorName = "J.K.Rowling";
        int id = 1;
        double priceInUSD = 10;
        boolean isAvailable = true;
        double conversionRate = 1.1;

        double priceInEUR = priceInUSD * conversionRate;
        System.out.println("The book name is " + bookName + ". The author of the book is " + authorName);
        System.out.println("The book id: " + id);
        System.out.println("The book price: " + priceInUSD + " USD / " + priceInEUR + " EUR");
        System.out.println("The book is available: " + isAvailable);
    }
}
