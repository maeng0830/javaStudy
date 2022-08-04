package java_review_zb.java_review_zb5;

public class StudentTest {
    public static void main(String[] args) {
//        Student studentStudy = new Student(); // 기본생성자
//        studentStudy.name = "홍길동";

        Student studentStudy = new Student("홍길동");
        System.out.println(studentStudy.name);

        Student studentSleep = new Student();
        studentSleep.name = "홍길순";
        System.out.println(studentSleep.name);
    }
}
