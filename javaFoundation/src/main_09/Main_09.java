package main_09;// Java 프로그래밍 - 다형성

class Person {
    public void print() {
        System.out.println("Person.print");
    }
}

class Student extends Person {
    public void print() {
        System.out.println("Student.print");
    }

    public void print2() {
        System.out.println("Student.print2");
    }
}

class CollegeStudent extends Person {
    public void print() {
        System.out.println("CollegeStudent.print");
    }
}


public class Main_09 {

    public static void main(String[] args) {

//      1. 다형성
        System.out.println("== 다형성 ==");
        Person p1 = new Person();
        Student s1 = new Student();

        Person p2 = new Student(); // 자식을 부모 타입으로 변환
//        Student s2 = new Person(); 부모를 자식 타입으로 변환은 불가능

        Person p3 = new CollegeStudent();

        p1.print();
        s1.print();
        s1.print2();
        p2.print();
//        p2.print2(); 부모가 접근할 수 있는 범위까지만 가능함.

        p3.print();

//      2. 타입 변환
        System.out.println("== 타입 변환 ==");
        Person pp1 = null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student();

        pp1 = pp2;
        ss1 = ss2;
        pp1 = pp3;
//        ss1 = pp2;
        ss1 = (Student) pp3;



//      3. instanceof
        System.out.println("== instanceof ==");
        Person pe1 = new Person();
        Student st1 = new Student();
        Person pe2 = new Student();
        Person pe3 = new CollegeStudent();

        System.out.println(pe1 instanceof Person); // true
        System.out.println(pe1 instanceof Student); // false

        System.out.println(st1 instanceof Person); // true
        System.out.println(st1 instanceof Student); // true

        System.out.println(pe2 instanceof Person); // true
        System.out.println(pe2 instanceof Student); // true

        System.out.println(pe3 instanceof Person); // true
        System.out.println(pe3 instanceof CollegeStudent); // true

    }
}
