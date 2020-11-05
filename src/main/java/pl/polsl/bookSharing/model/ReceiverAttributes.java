package pl.polsl.bookSharing.model;

import javax.persistence.*;

@Entity
public class ReceiverAttributes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long receiverAttributesId;

    @OneToOne
    private User receiverUser;

    @OneToOne
    private Book receiverBook;

    public long getReceiverAttributesId() {
        return receiverAttributesId;
    }

    public void setReceiverAttributesId(long receiverAttributesId) {
        this.receiverAttributesId = receiverAttributesId;
    }

    public User getReceiverUser() {
        return receiverUser;
    }

    public void setReceiverUser(User receiverUser) {
        this.receiverUser = receiverUser;
    }

    public Book getReceiverBook() {
        return receiverBook;
    }

    public void setReceiverBook(Book receiverBook) {
        this.receiverBook = receiverBook;
    }
}
