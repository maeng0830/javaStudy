package has_parameter;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();

		// 매개변수가 2개 이상인 경우
		person.action1((name, job) -> {
			System.out.printf("%s이 %s을 합니다.", name, job);
			System.out.println();
		});

		// 매개변수가 1개인 경우
		person.action2(content -> System.out.printf("%s라고 말합니다.", content));
	}
}
