package java_review_zb.java_review_zb6;

public class Circle {
    double radius;
    static double pi = 3.141592; // 객체마다 다른 값을 가질 필요 없는 필드이다. static 키워드를 통해 pi는 객체가 아닌 클래스 내부에만 존재하게 하여 Circle 객체들이 공유할 수 있도록 한다.

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }

    public double getPerimeter() {
        return 2 * pi * radius;
    }
}
