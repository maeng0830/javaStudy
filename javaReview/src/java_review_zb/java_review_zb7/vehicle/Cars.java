package java_review_zb.java_review_zb7.vehicle;

import java_review_zb.java_review_zb7.vehicle.Vehicle;

public class Cars extends Vehicle {
    public String name = "자동차"; // 상속받은 필드를 다시 정의할 수 있다.
    public String cc; // 하위 클래스만의 필드를 정의할 수 있다.

    public Cars() {
//        super(); // 상위 클래스의 기본 생성자는 자동으로 호출된다.
        System.out.println("Cars 기본 생성자 호출");
    }

    public Cars(double maxSpeed, int capacity, String cc) {
        super(maxSpeed, capacity);
        this.cc = cc;
        System.out.println("Cars 사용자 정의 생성자 호출");
    }

    public void info() {
        System.out.println("참조X 이름: " + name);
        System.out.println("super 이름: " + super.name); // 부모의 필드를 참조
        System.out.println("최대속도: " + maxSpeed);
        System.out.println("정원: " + capacity);

        System.out.println("this 이름: " + this.name); // 자신의 필드를 참조
        System.out.println("배기량: " + cc);
    }
}
