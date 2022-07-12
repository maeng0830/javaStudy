package java_review_zb;

public class JavaReviewZb2_1 {
    public static void main(String[] args) {
        char c1 = '박';
        char c2 = '\ubc15'; // 문자형은 그에 해당하는 유니코드(16진수)를 가지고 있다. 유니코드를 통해 해당 유니코드에 맞는 문자형을 반환할 수 있다.

        System.out.println(c1); // 박
        System.out.println(c2); // 박
    }
}
