// Java 프로그래밍 - 변수와 자료형_2

public class Main_02_2 {
    public static void main(String[] args) {

//      1. 자료형 - 숫자
        System.out.println("== 숫자 ==");
//      1-1. 정수
        int intNum = 10;
        System.out.println("intNum = " + intNum); // intNum = 10
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

        int intNum2 = Integer.MAX_VALUE + 1;
        System.out.println("intNum2 = " + intNum2); // intNum2 = -2147483648
        long longNum = (long) Integer.MAX_VALUE + 1;
        System.out.println("longNum = " + longNum); // longNum = -2147483647

//      1-2. 실수
        float floatNum = 1.23f;
        System.out.println("floatNum = " + floatNum); // floatNum = 1.23
        System.out.println(Float.MAX_VALUE); // 3.4028235E38
        System.out.println(Float.MIN_VALUE); // 1.4E-45

        double doubleNum = 1.23;
        System.out.println("doubleNum = " + doubleNum); // doubleNum = 1.23
        System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
        System.out.println(Double.MIN_VALUE); // 4.9E-324

//      1-3. 2진수 / 8진수 / 16진수
        int numBase2 = 0b1100;
        System.out.println("numBase2 = " + numBase2); // numBase2 = 12
        System.out.println("0b" + Integer.toBinaryString(numBase2)); // 0b1100

        int numBase8 = 014;
        System.out.println("numBase8 = " + numBase8); // numBase8 = 12
        System.out.println("0" + Integer.toOctalString(numBase8)); // 014

        int numBase16 = 0xc;
        System.out.println("numBase16 = " + numBase16); // numBase16 = 12
        System.out.println("0x" + Integer.toHexString(numBase16)); // 0xc

//      2. 자료형 - 부울
        System.out.println("== 부울 ==");
        boolean isT = true;
        System.out.println("isT = " + isT); // isT = true
        boolean isF = false;
        System.out.println("isF = " + isF); // isF = false

//      3. 자료형 - 문자
        System.out.println("== 문자 ==");
        char keyFirst = 'a';
        System.out.println("keyFirst = " + keyFirst); // keyFirst = a
        System.out.println((int) keyFirst); // 97

        char keyLast = 'z';
        System.out.println("keyLast = " + keyLast); // keyLast = z
        System.out.println((int) keyLast); // 122

    }
}
