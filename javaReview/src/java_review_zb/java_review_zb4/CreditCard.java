package java_review_zb.java_review_zb4;

public class CreditCard {
    private long cardNumber;
    public String cardOwner;

    public long balance;
    public long point;

    public void use(long amount) {
        balance += amount;
    }

    public void payBill(long amount) {
        balance -= amount;
        addPoint(amount / 1000);
    }

    private void addPoint(long point) {
        this.point += point;
    }

    //setter 외부에서 private 필드에 값을 대입하기 위함.
    public void setCardNumber(long cardNumber) {
        if (cardNumber < 1000_0000_0000_0000l) {
            System.err.println("카드번호에 문제가 있습니다.");
        } else {
            this.cardNumber = cardNumber;
        }
    }

    //getter 외부에서 private 필드에 접근하기 위함.
    public long getCardNumber() {
        return cardNumber;
    }
}


