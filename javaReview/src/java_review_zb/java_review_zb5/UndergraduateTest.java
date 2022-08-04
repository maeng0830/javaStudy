package java_review_zb.java_review_zb5;

public class UndergraduateTest {
    public static void main(String[] args) {
        Undergraduate student1 = new Undergraduate();
        Undergraduate student2 = new Undergraduate("홍길동");
        Undergraduate student2_1 = new Undergraduate(20);
        Undergraduate student3 = new Undergraduate("홍길동", 20);
        Undergraduate student4 = new Undergraduate("홍길동", 20, "남");
        Undergraduate student5 = new Undergraduate("홍길동", 20, "남", "컴퓨터공학과");

        Undergraduate student6 = new Undergraduate("홍길동", "남");
//        Undergraduate student7 = new Undergraduate("홍길동", "컴퓨터공학과");
    }
}
