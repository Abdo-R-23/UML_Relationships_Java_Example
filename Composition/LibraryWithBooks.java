import java.util.List;

public class LibraryWithBooks {
    private List<Book> books;

    public LibraryWithBooks(List<Book> books) {
        this.books = books;
    }

    public void listBooks() {
        for (Book b : books) {
            b.printTitle();
        }
    }
}
