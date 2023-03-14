package parameter_reference_method;

public class Person {
	public void ordering(Comparable comparable) {
		String a = "홍길동";
		String b = "김길동";

		int result = comparable.compare(a, b);

		if (result < 0) {
			System.out.printf("%s은 %s보다 앞에 옵니다.", a, b);
		} else if (result == 0) {
			System.out.printf("%s은 %s와 같습니다.", a, b);
		} else {
			System.out.printf("%s은 %s보다 앞에 옵니다.", b, a);
		}
	}
}
