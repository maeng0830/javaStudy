package java_review_zb;

public class JavaReviewZb2_2 {
    public static void main(String[] args) {
        char startValue = '\u0000'; // 첫번째 유니코드(문자)
        char endValue = '\uffff'; // 마지막 유니코드(문자)
        char koStart = '\uac00'; // 첫번째 한글 유니코드(문자)
        char koEnd = '\ud7af'; // 마지막 한글 유니코드(문자)

        for (int i = startValue; i < endValue; i++) { // int로 자동 타입 변환됨(문자->숫자).
            if (i >= (int) koStart && i <= (int) koEnd) {
                char c1 = (char) i; // 다시 문자형으로 타입 변환
                System.out.print(c1);
            }
        }
    }
}
