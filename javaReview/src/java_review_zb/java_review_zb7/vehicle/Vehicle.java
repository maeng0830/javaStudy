package java_review_zb.java_review_zb7.vehicle;

public class Vehicle {
    public String name = "차량";
    public double maxSpeed;
    public int capacity;

    public Vehicle() { // 기본 생성자
        System.out.println("Vehicle 기본 생성자 호출");
    }

    public Vehicle(double maxSpeed, int capacity) {
        System.out.println("Vehicle 사용자 정의 생성자 호출");
        this.maxSpeed = 200;
        this.capacity = 4;
    }
    public void info() {
        System.out.println("차량 이름: " + name);
        System.out.println("최대속도: " + maxSpeed);
        System.out.println("정원: " + capacity);
    }
}
