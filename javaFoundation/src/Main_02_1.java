// Java 프로그래밍 - 변수와 자료형_1

public class Main_02_1 {
    public static void main(String[] args) {

//      1. 변수 사용하기
        System.out.println("== 변수 사용하기 ==");
        int age = 10;
        System.out.println(age);
        String country = "Korea";
        System.out.println(country);

//      2. 변수 이름 규칙
        System.out.println("== 변수 이름 규칙 ==");
//      2-1. 문자, 숫자, _(underscore), $ 사용 가능
        int apple = 2000;
        int apple3 = 2000;
        int _apple = 2000;
        int $apple = 2000;
        System.out.println($apple); //sout
        System.out.println("$apple = " + $apple); //soutv

//      2-2. 숫자로 시작 X
//      int 3apple = 200;

//      2-3. 대소문자 구분
        int apple5 = 1000;
        int Apple5 = 1000;

//      2-4. 공백 사용 X
//      int one apple = 1000;

//      2-5. 예약어 사용 X
//      예약어 예시: true, false, if, switch, for, continue, break, ...

//      참고) 한글 사용 가능
        int 사과 = 1000;

        
//      3. 표기법
//      3-1. 카멜 표기법 (camelCase)
//      변수, 함수
        int myAge = 10;
        int oneApplePrice = 1000;

        
//      3-2. 파스칼 표기법 (PascalCase)
//      클래스
        int MyAge = 10;
        int OneApplePrice = 1000;

        
//      참고) 스네이크 표기법 (snake_case)
//      사용 X


    }
}

