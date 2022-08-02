public class Practice {
    public static void main(String[] args) {
        // 문자 -> 아스키코드, 유니코드
        // 캐스팅을 통해서 변환될 수 있다.
        // char 타입은 문자임과 동시에 정수 타입이므로, 숫자 리터럴과 산술 연산 시 자동 타입 변환된다.
        int int1 = 0;
        double double1 = 0;

        char chr1 = 'A';
        System.out.println("chr1 = " + (int) chr1); // chr1 = 65
        System.out.println("chr1 = " + (chr1 - int1)); // chr1 = 65
        System.out.println("chr1 = " + (chr1 - double1)); // chr1 = 65.0

        char chr2 = 'Z';
        System.out.println("chr2 = " + (int) chr2); // chr2 = 90
        System.out.println("chr2 = " + (chr2 - int1)); // chr2 = 90
        System.out.println("chr2 = " + (chr2 - double1)); // chr2 = 90.0

        char chr3 = 'a';
        System.out.println("chr3 = " + (int) chr3); // chr3 = 97
        System.out.println("chr3 = " + (chr3 - int1)); // chr3 = 97
        System.out.println("chr3 = " + (chr3 - double1)); // chr3 = 97.0

        char chr4 = 'z';
        System.out.println("chr4 = " + (int) chr4); // chr4 = 122
        System.out.println("chr4 = " + (chr4 - int1)); // chr4 = 122
        System.out.println("chr4 = " + (chr4 - double1)); // chr4 = 122.0

        // 아스키코드, 유니코드 -> 문자
        // 캐스팅을 통해서 변환될 수 있다.
        int int2 = 65;
        System.out.println("int2 = " + (char) int2); // int2 = A
        double double2 = 65;
        System.out.println("double2 = " + (char) double2); // double2 = A
    }
}
