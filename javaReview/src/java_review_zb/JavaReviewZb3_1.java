package java_review_zb;

public class JavaReviewZb3_1 {
    public static void main(String[] args) {
        int i1 = 40;
        System.out.println("i1 = " + i1); // i1 = 40
        System.out.println("Integer.toBinaryString(i1) = " + Integer.toBinaryString(i1)); // Integer.toBinaryString(i1) = 101000

        int i2 = i1 >> 3; // 비트를 오른쪽으로 두 칸 이동한다. '2^이동구간' 만큼 나눈다는 의미이다.
        System.out.println("i2 = " + i2); // i2 = 5
        System.out.println("Integer.toBinaryString(i2) = " + Integer.toBinaryString(i2)); // Integer.toBinaryString(i2) = 101

        int i3 = 40;
        System.out.println("i3 = " + i3); // i3 = 40
        System.out.println("Integer.toBinaryString(i3) = " + Integer.toBinaryString(i3)); // Integer.toBinaryString(i3) = 101000

        int i4 = i3 << 3; // 비트를 왼쪽으로 두 칸 이동한다. '2^이동구간' 만큼 곱한다는 의미이다.
        System.out.println("i4 = " + i4); // i4 = 320
        System.out.println("Integer.toBinaryString(i4) = " + Integer.toBinaryString(i4)); // Integer.toBinaryString(i4) = 101000000

        int i5 = -40;
        System.out.println("i5 = " + i5); // i5 = -40
        System.out.println("Integer.toBinaryString(i5) = " + Integer.toBinaryString(i5)); // Integer.toBinaryString(i5) = 11111111111111111111111111011000

        int i6 = i5 >> 3;
        System.out.println("i6 = " + i6); // i6 = -5
        System.out.println("Integer.toBinaryString(i6) = " + Integer.toBinaryString(i6)); // Integer.toBinaryString(i6) = 11111111111111111111111111111011, 빈자리가 기존 부호비트와 동일하게 채워짐.

        int i7 = i5 >>> 3;
        System.out.println("i7 = " + i7); // i7 = 536870907
        System.out.println("Integer.toBinaryString(i7) = " + Integer.toBinaryString(i7)); // Integer.toBinaryString(i7) = 11111111111111111111111111011, 빈자리가 0으로 채워짐.
    }
}
