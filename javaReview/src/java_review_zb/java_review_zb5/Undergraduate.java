package java_review_zb.java_review_zb5;

public class Undergraduate {
    public String name;
    public int age;
    public String gender;
    public String department;

    public Undergraduate() {

    }

    public Undergraduate(String name) {
        this.name = name;
    }

    public Undergraduate(int age) {
        this.age = age;
    }

    public Undergraduate(String name, int age) {
        this(name); // 생성자 내부에서 다른 생성자를 호출한다.
//        this.name = name;
//        this(age); // 특정 생성자 안에서 this 생성자는 한번만 사용할 수 있다. 두번째 줄부터는 사용이 불가능하기 때문..
        this.age = age;
    }

    public Undergraduate(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Undergraduate(String name, int age, String gender, String department) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
    }

    public Undergraduate(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
//    생성자들은 매개변수의 타입, 순서로 구분된다. 아래의 생성자는 위의 생정자와 매개변수의 타입, 순서가 동일하다.
//    public Undergraduate(String name, String department) {
//        this.name = name;
//        this.department = department;
//    }
}
