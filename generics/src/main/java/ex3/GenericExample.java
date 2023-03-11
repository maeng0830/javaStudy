package ex3;

public class GenericExample {

	// 제네릭 메소드
	// 제네릭 메소드는 선언부에 타입 파라미터를 갖는 메소드이다.
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();

		box.set(t);

		return box;
	}

	public static void main(String[] args) {
		//제네릭 메소드 호출
		Box<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println("intValue = " + intValue);

		//제네릭 메소드 호출
		Box<String> box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println("strValue = " + strValue);
	}
}
