package java_review_zb.java_review_zb8;

public class EduPerson extends Person {
    public String schoolName;
    public long number;

    public EduPerson(String name, long number, String schoolName, long eduNumber) {
        super(name, number);
        this.schoolName = schoolName;
        this.number = eduNumber;
    }

    public long getEduNumber() {
        return number;
    }
}
