public class EBook extends Book {

    private double fileSize;

    // TODO: Implement constructor using super()
    public EBook(String title, String author, int year, double fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
        // implement
    }

    public double getFilesize() {
        return filesize;
    }
    
    // TODO: Override toString()
    @Override
    public String toString() {
        return super.toString() +"\n file size :" +fileSize;
    }
}
