package java_review_zb;

public class JavaReviewZb1_1 {
    public static void main(String[] args) {
        //int -> 32bit
        //int는 2진수(32bit)로 표현될 수 있음 -> 00000000_00000000_00000000_00000000
        //16진수 -> ff_ff_ff_ff
        int i1 = 10; // 10진수 10
        int i2 = 0b10; // 2진수 2
        int i3 = 010; //8진수 8
        int i4 = 0x10; //16진수 16

        System.out.println(i1); // 10
        System.out.println(i2); // 2
        System.out.println(i3); // 8
        System.out.println(i4); // 16
    }
}
