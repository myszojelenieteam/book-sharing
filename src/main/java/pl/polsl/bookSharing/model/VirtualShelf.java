package pl.polsl.bookSharing.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class VirtualShelf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long virtualShelfId;

    @OneToMany(mappedBy = "virtualShelf")
    private List<Book> books;

    public long getVirtualShelfId() {
        return virtualShelfId;
    }

    public void setVirtualShelfId(long virtualShelfId) {
        this.virtualShelfId = virtualShelfId;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
