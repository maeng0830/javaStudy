package java_review_zb.java_review_zb7.person;

import java_review_zb.java_review_zb7.person.EduPerson;
import java_review_zb.java_review_zb7.person.Person;

public class InheritanceTest {
    public static void main(String[] args) {
        System.out.println("TEST!");

        Person person1 = new Person();
        person1.name = "홍길동";
        System.out.println("사람 이름: " + person1.name); // 사람 이름: 홍길동

        EduPerson eduPerson1 = new EduPerson(); // 교직원 이름: 홍길동
        eduPerson1.name = "홍길동";
        System.out.println("교직원 이름: " + eduPerson1.name);
    }
}
