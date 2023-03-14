package parameter_reference_method;

/**
 * 람다식의 파라미터 a의 메소드를 호출해서, 파라미터 b를 메소드의 파라미터로 사용할 수 있다.
 */
public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();

		// (a, b) -> a.compareToIgnoreCase(b)
		person.ordering(String::compareToIgnoreCase);
	}
}
