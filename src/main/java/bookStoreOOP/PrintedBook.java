package bookStoreOOP;

public class PrintedBook extends Book {
    int amountOfPages;


    public PrintedBook(String bookName, String authorName, int id, double usdPrice, boolean isAvailable, int amountOfPages) {
        super(bookName, authorName, id, usdPrice, isAvailable);
        this.amountOfPages = amountOfPages;
    }


    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    @Override
    public void printBookDetails (){
        super.printBookDetails();
        System.out.println("Amount of pages: "+amountOfPages);
    }

}
