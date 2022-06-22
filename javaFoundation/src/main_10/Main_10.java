package main_10;// Java 프로그래밍 - 추상 클래스

// 추상 클래스 Person



// 추상 클래스 상속

// 추상 클래스 Person
abstract class Person {
    abstract void printInfo();
}

// 추상 클래스 상속
class Student extends Person {
    public void printInfo() {
        System.out.println("Student.printInfo");
    }
}
public class Main_10 {

    public static void main(String[] args) {
        
//        추상 클래스의 사용
//        Person p1 = new Peron(); 추상 클래스는 객체를 만들 수 없다.
        Student s1 = new Student();
        s1.printInfo(); // Student.printInfo

//        추상클래스는 익명 클래스에 사용될 수 있다.
        Person p2 = new Person() {
            @Override
            void printInfo() {
                System.out.println("Person.printInfo");
            }
        };
        p2.printInfo(); // Student.printInfo

    }
}
