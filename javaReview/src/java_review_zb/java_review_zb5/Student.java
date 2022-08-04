package java_review_zb.java_review_zb5;

public class Student {
    public String name;

    public Student() {
        System.out.println("student 생성자가 호출됨.");
    }

    public Student(String name) {
        System.out.println("name 매개변수를 갖는 student 생성자가 호출됨.");
        this.name = name;
    }
}
