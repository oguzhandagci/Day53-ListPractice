package Classes;

public class Book {

    String title;
    int pageNumbers;
    int publicationYear;
    String genre;
    int review;

    public Book(String title, int pageNumbers, int publicationYear){
        this.title = title;
        this.pageNumbers = pageNumbers;
        this.publicationYear = publicationYear;
    }
    public Book(String title, int pageNumbers, int publicationYear, int review){
        this.title = title;
        this.pageNumbers = pageNumbers;
        this.publicationYear = publicationYear;
        this.review=review;
    }
    public Book(String title, int pageNumbers, int publicationYear, String genre, int review){
        this.title = title;
        this.pageNumbers = pageNumbers;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.review=review;
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