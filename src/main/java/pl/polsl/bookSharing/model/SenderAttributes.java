package pl.polsl.bookSharing.model;

import javax.persistence.*;

@Entity
public class SenderAttributes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long senderAttributesId;

    @OneToOne
    private User senderUser;

    @OneToOne
    private Book senderBook;

    public long getSenderAttributesId() {
        return senderAttributesId;
    }

    public void setSenderAttributesId(long senderAttributesId) {
        this.senderAttributesId = senderAttributesId;
    }

    public User getSenderUser() {
        return senderUser;
    }

    public void setSenderUser(User senderUser) {
        this.senderUser = senderUser;
    }

    public Book getSenderBook() {
        return senderBook;
    }

    public void setSenderBook(Book senderBook) {
        this.senderBook = senderBook;
    }
}
