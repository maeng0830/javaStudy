package java_review_zb.java_review_zb8;

public class OfficePerson extends EduPerson {
    public String department;

    public OfficePerson(String name, long number, String schoolName, long eduNumber, String department) {
        super(name, number, schoolName, eduNumber); // EduPerson의 생성자 호출.
        this.department = department;
    }

}
