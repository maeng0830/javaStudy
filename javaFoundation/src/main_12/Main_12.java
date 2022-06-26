package main_12;// Java 프로그래밍 - 내부 클래스

// 외부 클래스
class Outer {
    public void print() {
        System.out.println("Outer.print");
    }

    // 내부 클래스 - 인스턴스
    class Inner {
        public void innerPrint() {
            Outer.this.print(); //외부 클래스의 메소드 호출
        }
    }


    static class InnerStaticClass {
        void innerStaticClass() {
//            Outer.this.print(); print()은 Outer 객체가 생성되야 호출이 가능한데, 정적내부클래스의 메소드는 그냥 사용가능한 상황
        }
    }
}

// 익명 클래스
abstract class Person {
    public abstract void printInfo();
}

//class Student extends Person {
//    public void printInfo() {
//        System.out.println("Student.printInfo");
//    }
//}

public class Main_12 {
    public static void main(String[] args) {
//      외부 클래스
        Outer o1 = new Outer();
//      내부 클래스 - 인스턴스
        Outer.Inner i1 = new Outer().new Inner(); // 외부클래스의 객체를 먼저 생성해야됨.
//      내부 클래스 - 정적
        Outer.InnerStaticClass i2 = new Outer.InnerStaticClass(); // 외부클래스의 객체를 생성할 필요 없음.
//      익명 클래스
        Person p1 = new Person() {
            @Override
            public void printInfo() {
                System.out.println("Person.printInfo");
            }
        };

        p1.printInfo();


    }

}
