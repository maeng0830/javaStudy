package java_review_zb.java_review_zb8;

public class OfficePersonTest {
    public static void main(String[] args) {
        Person male = new Person("홍길동", 1111);
        System.out.println("name:" + male.name + ", residentNumber:" + male.number); // name:홍길동, residentNumber:1111

        System.out.println("=================================================================");
        EduPerson eduPerson1 = new EduPerson("김사랑", 2222, "제로베이스", 3333);
        Person female = eduPerson1;
        System.out.println("name:" + female.name + ", residentNumber:" + female.number); // name:김사랑, residentNumber:2222
//        System.out.println("schoolName:" + female.schoolName);
        System.out.println("schoolName:" + eduPerson1.schoolName + ", eduNumber:" + eduPerson1.number); // schoolName:제로베이스, eduNumber:3333

        System.out.println("=================================================================");
        OfficePerson officePerson1 = new OfficePerson("김철수", 4444, "제로베이스", 5555, "경영지원");
        Person person2 = officePerson1;
        EduPerson eduPerson2 = officePerson1;
        System.out.println("name:" + person2.name + ", residentNumber:" + person2.number); // name:김철수, residentNumber:4444
        System.out.println("schoolName:" + eduPerson2.schoolName + ", eduNumber:" + eduPerson2.number); // schoolName:제로베이스, eduNumber:5555
        System.out.println("department:" + officePerson1.department); // department:경영지원

        System.out.println(officePerson1.number); // 5555
        System.out.println(((Person) officePerson1).number); // 4444
    }
}
