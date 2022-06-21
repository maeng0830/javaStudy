// Java 프로그래밍 - 여러가지 연산자_1

public class Main_03_1 {
    public static void main(String[] args) {

//      1. 대입 연산, 부호 연산자
        int num = 100;
        num = +10;
        num = 10;
        num = -10;


//      2. 산술 연산자, 증가/감소 연산자
        System.out.println("== 산술 연산자, 증가/감소 연산자 ==");
        int numX = 10;
        int numY = 3;
        int result = 0;
        result = numX + numY;
        System.out.println("result = " + result); // 13
        result = numX - numY;
        System.out.println("result = " + result); // 7
        result = numX * numY;
        System.out.println("result = " + result); // 30
        result = numX % numY;
        System.out.println("result = " + result); // 1, 나머지 값

        int numZ = 1;
        System.out.println(numZ++); // 1, 항의 값이 먼저 사용된 후, 증감이 적용됨.
        System.out.println(numZ); // 2

        numZ = 1;
        System.out.println(++numZ); // 2, 항의 값에 증감이 먼저 적용된 후 사용됨.
        System.out.println(numZ); // 2

        numZ = 1;
        System.out.println(numZ--); // 1
        System.out.println(numZ); // 0

        numZ = 1;
        System.out.println(--numZ); // 0
        System.out.println(numZ); // 0


//      3. 관계 연산자
        System.out.println("== 관계 연산자 ==");
        int numA = 10;
        int numB = 9;

        System.out.println(numA > numB); // true
        System.out.println(numA < numB); // false
        System.out.println(numA >= numB); // true
        System.out.println(numA <= numB); // false
        System.out.println(numA == numB); // false
        System.out.println(numA != numB); // true


//      4. 논리 연산자
        System.out.println("== 논리 연산자 ==");
        System.out.println((10 > 9) && (1 == 0)); // false,  두 항이 모두 참이어야 true
        System.out.println((10 > 9) || (1 == 0)); // true, 두 항 중 하나만 참이어도 true


//      5. 복합 대입 연산자
        System.out.println("== 복합 대입 연산자 ==");
        int num1 = 10;
        int num2 = 5;

        num1 += num2; // num1 = num1 + num2
        System.out.println("num1 = " + num1); // 15


//      6. 삼항 연산자
        System.out.println("== 삼항 연산자 ==");
        int a = 100;
        String aResult = (a == 100) ? "yes" : "no"; // (조건식) ? 참 반환값 : 거짓 반환값
        System.out.println("aResult = " + aResult); // yes

    }

}
