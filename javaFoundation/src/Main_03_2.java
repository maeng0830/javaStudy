// Java 프로그래밍 - 여러가지 연산자_2

public class Main_03_2
{
    public static void main(String[] args) {

//      1. 비트 논리 연산자
        System.out.println("== 비트 논리 연산자 ==");
//      1-1. AND 연산자 (&)
        int num1 = 5;
        int num2 = 3;
        int result = 0;
        result = num1 & num2;

        System.out.println("result = " + result); // 1
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1))); // 0101
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // 0001

//      1-2. OR 연산자 (|)
        result = num1 | num2;

        System.out.println("result = " + result); // 7
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1))); // 0101
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // 0111

//      1-3. XOR 연산자 (^)
        result = num1 ^ num2;

        System.out.println("result = " + result); // 6
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1))); // 0101
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // 0110

//      1-4. 반전 연산자 (~)
        num1 = 5;
        System.out.println("num1 = " + num1); // num1 = 5
        System.out.println("num1 = " + Integer.toBinaryString(num1)); // num1 = 101

        result = ~num1;
        System.out.println("~num1 = " + result); // ~num1 = -6
        System.out.println("~num1 = " + Integer.toBinaryString(result)); // ~num1 = 11111111111111111111111111111010


//      2. 비트 이동 연산자
        System.out.println("== 비트 이동 연산자 ==");
//      2-1. << 연산자
        int numA = 3;
        result = numA << 1;
        System.out.printf("numA = %04d\n", Integer.parseInt(Integer.toBinaryString(numA))); // numA = 0011
        System.out.printf("numA << 1 = %04d\n", Integer.parseInt(Integer.toBinaryString(result))); // numA << 1 = 0110


//      2-2. >> 연산자
        result = numA >> 1;
        System.out.printf("numA = %04d\n", Integer.parseInt(Integer.toBinaryString(numA))); // numA = 0011
        System.out.printf("numA >> 1 = %04d\n", Integer.parseInt(Integer.toBinaryString(result))); // numA << 1 = 0001


//      2-3. >>> 연산자
        numA = -5;
        result = numA >> 1;
        System.out.printf("numA = %s\n", Integer.toBinaryString(numA)); // numA = 11111111111111111111111111111011
        System.out.printf("numA >> 1 = %s\n", Integer.toBinaryString(result)); // numA >> 1 = 11111111111111111111111111111101

        result = numA >>> 1;
        System.out.printf("numA >>> 1 = %s\n", Integer.toBinaryString(result)); // numA >>> 1 = '0'1111111111111111111111111111101 앞의 빈자리가 0으로 채워져서 생략되었음.
    }

}
