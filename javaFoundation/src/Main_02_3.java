// Java 프로그래밍 - 변수와 자료형_3

import java.util.Locale;

public class Main_02_3 {
    public static void main(String[] args) {

//      1. 자료형 - 문자열
        System.out.println("== 문자열 ==");
        String s1 = "Hello World!";
        System.out.println("s1 = " + s1); // s1 = Hello World!
        String s2 = "01234";
        System.out.println("s2 = " + s2); // s2 = 01234, 숫자가 아닌 문자열임.

//      1-1. equals
        String s3 = "Hi";
        String s4 = "Hi";
        System.out.println(s3.equals(s4)); // true, eqauls()는 리터럴이 동일하면 같다고 판단.
        System.out.println(s3 == s4); // true, ==는 참조하고 있는 객체를 비교함. 기본적으로 String은 리터럴이 동일하다면 동일한 객체를 참조함.

        String s5 = new String("Hi"); // new 연산자는 새로운 객체를 생성함.
        System.out.println(s3.equals(s5)); // true, 리터럴이 동일하므로 같다고 판단.
        System.out.println(s3 == s5); // false, 서로 다른 객체를 참조하고 있으므로 다르다고 판단.

//      1-2. indexOf
        String s6 = "Hello! World!";
        System.out.println(s6.indexOf("!")); // 5, 문자열에서 특정 문자의 인덱스를 반환. 동일한 문자가 여러개 있다면 처음 인덱스를 반환.
        System.out.println(s6.indexOf("!", s6.indexOf("!") + 1)); // 12, 두 번째 "!"의 인덱스를 반환.

//      1-3. replace
        String s7 = s6.replace("Hello", "Bye"); // 문자열에서 특정 문자열을 새로운 문자열로 변경한다.
        System.out.println("s7 = " + s7); // s7 = Bye! World!

//      1-4. substring
        System.out.println(s7.substring(0, 3)); // Bye, 문자열의 일부분을 반환함.
        System.out.println(s7.substring(0, s7.indexOf("!") +1 )); // Bye!

//      1-5. toUpperCase
        System.out.println(s7.toUpperCase()); // BYE! WORLD!
        System.out.println(s7.toLowerCase()); // bye! world!

//      2. 자료형 - StringBuffer
        System.out.println("== StringBuffer ==");
        StringBuffer sb1 = new StringBuffer("123");
        sb1.append("456");
        System.out.println("sb1 = " + sb1); // sb1 = 123456
        
        String s8 = "123";
        s8 += "456"; // 새로운 객체 생성.. StringBuffer에 비해 비효율적..
        System.out.println("s8 = " + s8); // s8 = 123456

//      3. 자료형 - 배열
        System.out.println("== 배열 ==");
        int[] myArray1 = {1, 2, 3, 4, 5}; // 데이터 목록으로 초기화
        System.out.println(myArray1[0]);

        char[] myArray2 = {'a', 'b', 'c'};
        System.out.println(myArray2[2]);

        String[] myArray3 = new String[3]; // new 연산자를 통해 초기화
        myArray3[0] = "Hello";
        myArray3[1] = " ";
        myArray3[2] = "World!";
        System.out.println(myArray3[0] + myArray3[1] + myArray3[2]); // Hello World!

    }
}
