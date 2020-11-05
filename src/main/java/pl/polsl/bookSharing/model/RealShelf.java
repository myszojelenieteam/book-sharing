package pl.polsl.bookSharing.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class RealShelf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long shelfId;

    @OneToMany(mappedBy = "realShelf")
    private Collection<Book> books;


    public long getShelfId() {
        return shelfId;
    }

    public void setShelfId(long shelfId) {
        this.shelfId = shelfId;
    }

    public Collection<Book> getBooks() {
        return books;
    }

    public void setBooks(Collection<Book> books) {
        this.books = books;
    }
}
