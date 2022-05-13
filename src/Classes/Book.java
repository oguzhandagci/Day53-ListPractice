package Classes;

public class Book {

    String title;
    int pageNumbers;
    int publicationYear;

    public Book(String title, int pageNumbers, int publicationYear){
        this.title = title;
        this.pageNumbers = pageNumbers;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return getTitle() +", " + getPageNumbers() +" pages, " + getPublicationYear();
    }
}