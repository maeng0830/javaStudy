package nestedclass;

public class A {
    // 인스턴스 필드, 메소드
    int field1;
    void method1() {}

    // 정적 필드, 메소드
    static int field2;
    static void method2() {}

    //인스턴스 멤버 클래스
    class B {
        void method() {
            field1 = 1;
            method1();

            field2 = 1;
            method2();
        }
    }

    // 정적 멤버 클래스
    static class C {
        void method() {
//            field1 = 1; 정적 멤버 클래스에서는 인스턴스 필드 사용 불가능
//            method1(); 정적 멤버 클래스에서는 인스턴스 메소드 사용 불가능

            field2 = 1;
            method2();
        }
    }
}
