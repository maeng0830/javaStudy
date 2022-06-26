package main_13_1;// Java 프로그래밍 - 입출력_1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_13_1 {

    public static void referInputStream() throws IOException {
//      System.in
        System.out.println("== System.in ==");
        System.out.print("입력: ");
        int a = System.in.read() - '0'; // System.in.read()는 char 값 하나를 받아올 수 있다. - '0'은 문자를 아스키코드로 변환해주는 코드이다.
        System.out.println("a = " + a);
        System.in.read(new byte[System.in.available()]); // 데이터를 입력하고 enter키를 누르면, enter키 까지 포함해서 데이터를 읽어옴. System.in.read()는 하나의 값만 받아오기 때문에 enter키가 남게됨. 그것을 소진해주는 코드임.

//      InputStreamReader
        System.out.println("== InputStreamReader ==");
        InputStreamReader reader = new InputStreamReader(System.in); // InputStreamReader은 여러개의 데이터를 받아올 수 있음.
        char[] c = new char[3];
        System.out.print("입력: ");
        reader.read(c); // reader로 읽어온 데이터를 c에 저장.
        System.out.println(c);

//      BufferedReader
        System.out.println("== BufferedReader ==");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader는 배열 등을 통해 먼저 읽을 데이터의 수를 지정할 필요 없이, 그때 그때 필요한 수의 데이터를 읽을 수 있다.
        System.out.print("입력: ");
        String s1 = br.readLine();
        System.out.println("s1 =" + s1);
    }

    public static void main(String[] args) throws IOException {

//      1. 입력
//      1-1. 다른 입력 방식 참고
//        referInputStream();

//      1-2. Scanner
        System.out.println("== Scanner ==");
        Scanner sc = new Scanner(System.in); // 많이 사용하는 방법
        System.out.print("입력1: ");
        System.out.println(sc.next());
        sc.nextLine(); // enter키 소진을 위한 코드

        System.out.print("입력2: ");
        System.out.println(sc.nextInt()); // int 데이터만 읽을 수 있음.
        sc.nextLine();

        System.out.print("입력2: ");
        System.out.println(sc.nextLine()); // 가장 많이 사용함. BufferedReader처럼 자유자재로 데이터를 읽어올 수 있음.
//        sc.nextLine();


//      참고) 정수, 문자열 변환
        int num = Integer.parseInt("123");
        String str = Integer.toString(123456);
        
//      2. 출력
        System.out.println("== 출력 ==");
        System.out.println("Hello");
        System.out.println("World!");

        System.out.print("Hello ");
        System.out.print("World!");
        System.out.println();

        System.out.printf("Hello ");
        System.out.printf("World!");
        System.out.println();

        String s = "자바";
        int number = 3;

        System.out.println(s + "는 언어 선호도 " + number + "위 입니다.");
        System.out.printf("%s는 언어 선호도 %d위 입니다.\n", s, number);
        System.out.println();

        System.out.printf("%d\n", 10); // 10진수 정수
        System.out.printf("%o\n", 10); // 8진수 정수
        System.out.printf("%x\n", 10); // 16진수 정수
        System.out.println();

        System.out.printf("%f\n", 1.123456f); // 실수
        System.out.printf("%c\n", 'A'); // 문자
        System.out.printf("%s\n", "abc"); // 문자열
        System.out.println();

        System.out.printf("%5d\n", 123); // 5개의 공간을 만들고 우측 정렬
        System.out.printf("%5d\n", 1234);
        System.out.printf("%5d\n", 12345);
        System.out.printf("%5d\n", 123456); // 공간을 넘어가면 무관하게 출력됨.
        System.out.printf("%-5d\n", 123); // 5개의 공간을 만들고 좌측 정결
        System.out.printf("%-5d\n", 1234);
        System.out.printf("%-5d\n", 12345);
        System.out.printf("%-5d\n", 123456); // 공간을 넘어가면 무관하게 출력됨.
        System.out.println();

        System.out.printf("%.2f\n", 1.126483512); // 소수점 둘째자리에서 반올림.

    }
}
