package reference_method;

/**
 * 메소드 참조: 메소드를 참조하여 매개변수의 정보 및 리턴 타입을 알아내, 람다식의 불필요한 매개변수 작성을 제거하는 것을 목적으로 한다.
 */
public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();

		// 정적 메소드
		person.action(Computer::staticMethod);

		Computer computer = new Computer();

		// 인스턴스 메소드
		person.action(computer::instanceMethod);
	}
}
