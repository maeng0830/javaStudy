package java_review_zb.java_review_zb4;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard myCard = new CreditCard();
//        CreditCard myOtherCard;
//        myOtherCard = new CreditCard();

        myCard.setCardNumber(1234_5678_1234_1234L);
        myCard.cardOwner = "홍길동";

        System.out.println("===================================");
        System.out.println(myCard.getCardNumber());
        System.out.println(myCard.cardOwner);
        System.out.println(myCard.balance);
        System.out.println(myCard.point);

        myCard.use(8000);
        myCard.use(12000);
        myCard.use(21000);
        myCard.payBill(30000);
        //myCard.포인트지급(1000) // 포인트지급에 접근 불가능. private.

        System.out.println("===================================");
        System.out.println(myCard.getCardNumber());
        System.out.println(myCard.cardOwner);
        System.out.println(myCard.balance);
        System.out.println(myCard.point);
    }
}
