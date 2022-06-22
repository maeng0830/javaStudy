package main_08;// Java 프로그래밍 - 상속

class Person {
    String name;
    int age;
    public int a1;
    private int a2;

    Person() {}
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Person.printInfo");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}

// Student 클래스 - Person 상속, 접근제어자 확인
class Student extends Person {
    Student() {
        a1 = 1;
      //a2 = 1; private 필드여서 상속 불가능
    }

}

// Student 클래스 - Person 상속, super 사용, 오버라이딩
class Student2 extends Person {
    String name; // 부모 클래스와 동일한 필드
    int stdId;

    Student2(String name, int age, int stdId) {
//      super(name, age); // Person의 생성자를 호출
        this.name = name; // this를 통해 Person이 아닌 Student2에서 선언된 name을 가리킴.
        super.name = name; // super를 통해 Person에서 선언한 필드를 가리킴.
        this.age = age; // age를 자식 클래스에서 따로 선언하지 않았으므로, Person에서 선언한 age를 가리킴.
        this.stdId = stdId;
    }
    public void printInfo() {
        System.out.println("Student2.printInfo");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("stdId: " + stdId);
    }
}


public class Main_08 {

    public static void main(String[] args) {

//      Test code
//      1. 상속
        System.out.println("=============");
        Student s1 = new Student();
        s1.name = "a";
        s1.age = 25;
        s1.printInfo();


//      2. super, super(), 오버라이딩
        System.out.println("=============");
        Student2 s2 = new Student2("b",32, 1);
        s2.printInfo();

    }
}
