package java_review_zb.java_review_zb6;

public class Cola {
    private static int capacity = 20; // 명시적 초기화. 선언과 동시에 초기화
    private int data = 10; // 명시적 초기화



    // 클래스 초기화 블럭
    static {
        System.out.println("클래스 초기화 블럭");
        capacity = 40;
//        data = 50; // 인스턴스 필드는 초기화 할 수 없음.
        System.out.println("capacity: " + capacity);
//        System.out.println("data :" + data);
    }

    // 인스턴스 초기화 블럭
    {
        System.out.println("인스턴스 초기화 블럭");
        capacity = 50;
        data = 50;
        System.out.println("capacity: " + capacity);
        System.out.println("data :" + data);
    }

    // 생성자
    public Cola() {
        System.out.println("생성자 호출");
        capacity = 60;
        data = 60;
        System.out.println("capacity: " + capacity);
        System.out.println("data :" + data);
    }
}
