package java_review_zb.java_review_zb8;

public class EduPersonTest {
    public static void main(String[] args) {
        EduPerson eduPerson1 = new EduPerson("김사랑", 1111, "제로베이스", 2222);
        System.out.println("=================================================");
        System.out.println("이름: " + eduPerson1.name); // 이름: 김사랑
        System.out.println("주민번호: " + eduPerson1.getResidnetNumber()); // 주민번호: 1111
        System.out.println("학교명: " + eduPerson1.schoolName); // 학교명: 제로베이스
        System.out.println("교번: " + eduPerson1.number); // 교번: 2222

        Person person1 = eduPerson1;
        System.out.println("=================================================");
        System.out.println("이름: " + person1.name); // 이름: 김사랑
        System.out.println("주민번호: " + person1.number); // 주민번호: 1111, 상위 클래스로 업캐스팅 할 경우, 상위 클래스의 필드, 메소드에만 접근 할 수 있다.
//        System.out.println("교번: " + person1.getEduNumber()); // 상위 클래스로 업캐스팅 할 경우, 상위 클래스의 필드, 메소드에만 접근 할 수 있다.
    }
}
