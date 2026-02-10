public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isavailable;

    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        // implement
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.year = other.year;
        // implement
    }

    // TODO: Implement getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isavailable;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        isavailable = false;
    }

    // TODO: Implement return logic
    public void returnBook() {
        isavailable = true;
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return "title : "+title+", author : "+author+", year : " +year+", is available : "+isavailable;
    }

    // TODO: Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        Book other = (Book) obj;
        return title.equalsIgnoreCase(other.title) && author.equalsIgnoreCase(other.author) && year == other.year;
    }
}
