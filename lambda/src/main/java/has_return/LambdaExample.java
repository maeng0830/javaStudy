package has_return;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();

		// 실행문이 두 개 이상인 경우
		// return 키워드 생략 불가능
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});

		// 실행문이 1개인 경우
		// return 키워드 생략 가능
		person.action((x, y) -> x + y);

		// 실행문이 1개인 경우(함수 호출)
		// return 키워드 생략 가능
		person.action((x, y) -> sum(x, y));
	}

	public static double sum(double x , double y) {
		return x + y;
	}
}
