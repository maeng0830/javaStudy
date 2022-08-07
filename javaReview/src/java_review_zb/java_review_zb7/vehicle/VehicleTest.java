package java_review_zb.java_review_zb7.vehicle;

import java_review_zb.java_review_zb7.vehicle.Cars;
import java_review_zb.java_review_zb7.vehicle.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        System.out.println("Test!");

        Vehicle vehicle1 = new Vehicle();
//        Vehicle 기본 생성자 호출
        vehicle1.name = "차량";
        vehicle1.maxSpeed = 100;
        vehicle1.capacity = 2;
        vehicle1.info();
//        차량 이름: 차량
//        최대속도: 100.0
//        정원: 2

        Cars cars1 = new Cars();
//        Vehicle 기본 생성자 호출
//        Cars 생성자 호출
        cars1.maxSpeed = 100;
        cars1.capacity = 2;
        cars1.cc = "2000cc";
        cars1.info();
//        참조X 이름: 자동차
//        super 이름: 차량
//        최대속도: 100.0
//        정원: 2
//        this 이름: 자동차
//        배기량: 2000cc

        Cars cars2 = new Cars(200, 4, "2000cc");
//        Vehicle 사용자 정의 생성자 호출
//        Cars 사용자 정의 생성자 호출
        cars2.info();
//        참조X 이름: 자동차
//        super 이름: 차량
//        최대속도: 200.0
//        정원: 4
//        this 이름: 자동차
//        배기량: 2000cc
    }
}
