package ex4;

//제한된 타입 파라미터는 특정 타입, 상속 또는 구현 관계에 있는 타입으로만 대체할 수 있는 타입 파라미터를 말한다.
public class BoundedTypeParameter {

	// 제한된 타입 파라미터를 갖는 제네릭 메소드
	public static <T extends Number> boolean compare(T t1, T t2) {
		//Number의 메소드를 사용, T를 Number의 하위 클래스만 대체 할 수 있으므로 사용 가능하다.
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();

		return (v1 == v2);
	}

	public static void main(String[] args) {
		//제네릭 메소드 호출
		// T -> Integer
		boolean result1 = compare(10, 20);
		System.out.println(result1); // false

		// 제네릭 메소드 호출
		// T -> Double
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2); // true
	}
}
