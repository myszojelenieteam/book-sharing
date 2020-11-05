package pl.polsl.bookSharing.model;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookId;

    @ManyToOne
    private RealShelf realShelf;

    @ManyToOne
    private VirtualShelf virtualShelf;

    private String title;
    private String author;
    private String releaseDate;
    private String publishingHouse;
    private BookState bookState;


    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public RealShelf getRealShelf() {
        return realShelf;
    }

    public void setRealShelf(RealShelf realShelf) {
        this.realShelf = realShelf;
    }

    public VirtualShelf getVirtualShelf() {
        return virtualShelf;
    }

    public void setVirtualShelf(VirtualShelf virtualShelf) {
        this.virtualShelf = virtualShelf;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public BookState getBookState() {
        return bookState;
    }

    public void setBookState(BookState bookState) {
        this.bookState = bookState;
    }
}
