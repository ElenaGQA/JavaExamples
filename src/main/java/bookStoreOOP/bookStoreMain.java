package bookStoreOOP;

public class bookStoreMain {
    public static void main(String[] args) {
        AudioBook book1 = new AudioBook("Harry Potter", "J.K.Rowling", 1, 19.99, true, "mp3", 128, "Smith" );
        book1.printBookDetails();

        PrintedBook book2 = new PrintedBook("Harry Potter", "J.K.Rowling", 1, 20, true, 480);
        book2.setUsdPrice(24.99);
        book2.printBookDetails();

        EBook book3 = new EBook("Harry Potter", "J.K.Rowling", 1, 20, true, "www.downloadhere.com/HarryPotter/1234");
        book3.setUsdPrice(10.99);
        book3.printBookDetails();



//        Book book1 = new Book("Harry Potter", "J.K.Rowling", 1, 20, true);
//        Book book2 = new Book("Anna Karenina", "L.Tolstoy", 2, 15, false);

//        book1.printBookDetails();
//        book2.printBookDetails();


    }
}
