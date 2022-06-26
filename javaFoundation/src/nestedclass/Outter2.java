package nestedclass;

public class Outter2 {
    String field = "Outter-field";

    void method() {
        System.out.println("Outter-method");
    }
    class Nested {
        String field = "Nested-field";

        void method() {
            System.out.println("Nested-method");
        }

        void print() {
            System.out.println("this.field는 " + this.field); // 중첩 클래스의 필드를 참조함.
            System.out.println("Outter2.this.field는 " + Outter2.this.field); // 외부 클래스의 필드를 참조함.
            System.out.print("this.method()는 ");
            this.method();
            System.out.print("Outter2.this.method()는 ");
            Outter2.this.method();
        }
    }
}

