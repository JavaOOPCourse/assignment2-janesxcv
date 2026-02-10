public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("There is no place");
        }
        // implement
    }

    // TODO: Display all books
    public void displayBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].toString());
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle() == title) {
                return books[i];
            }
        }
        return null;
    }


    // TODO: Borrow book by title
    public void borrowBook(String title) {
        for (int y = 0; y < count; y++) {
            if (books[y].getTitle().equalsIgnoreCase(title) && books[y].isAvailable()) {
                books[y].borrowBook();
                System.out.println("you borrowed :" +books[y].getTitle());
            }
            else {
                System.out.println("Book is not available");
            }
        }
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        Book u = searchByTitle(title);
        if (u != null){
            u.returnBook();
            System.out.println("You returned book : "+u.getTitle());
        }
        else {
            System.out.println("book not found in library's archive");
        }
    }
}
