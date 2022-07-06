package java_review_zb;

public class JavaReviewZb1_3 {
    public static void main(String[] args) {
        //int의 최대값 최소값_4바이트
        int i1 = 0b0111_1111_1111_1111_1111_1111_1111_1111; // 최대값, 맨 앞은 부호비트
        int i2 = 0b1000_0000_0000_0000_0000_0000_0000_0000; // 최소값, 최대값 + 1
        System.out.println(i1);
        System.out.println(i2);

        int ii1 = Integer.MAX_VALUE;
        int ii2 = Integer.MIN_VALUE;
        System.out.println(ii1);
        System.out.println(ii2);

        //short_2바이트
        short s1 = 0b0000_0000_0000_1100;
        short s2 = (short) 0b1111_1111_1111_0100;
        System.out.println(s1); // 12
        System.out.println(s2); // -12, s1의 2의 보수
    }
}
