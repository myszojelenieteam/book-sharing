package pl.polsl.bookSharing.model;

import javax.persistence.*;

@Entity
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long offerId;

    @OneToOne
    private SenderAttributes senderAttributes;

    @OneToOne
    private ReceiverAttributes receiverAttributes;

    public long getOfferId() {
        return offerId;
    }

    public void setOfferId(long offerId) {
        this.offerId = offerId;
    }

    public SenderAttributes getSenderAttributes() {
        return senderAttributes;
    }

    public void setSenderAttributes(SenderAttributes senderAttributes) {
        this.senderAttributes = senderAttributes;
    }

    public ReceiverAttributes getReceiverAttributes() {
        return receiverAttributes;
    }

    public void setReceiverAttributes(ReceiverAttributes receiverAttributes) {
        this.receiverAttributes = receiverAttributes;
    }
}
