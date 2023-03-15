package ex1;

public class LambdaExample {

	public static void main(String[] args) {
		// 외부에서 제공된 함수(람다식)
		action((x, y) -> {
			int result = x + y;
			System.out.println("result = " + result);
		});

		// 외부에서 제공된 함수(람다식)
		action((x, y) -> {
			int result = x - y;
			System.out.println("result = " + result);
		});

	}

	// 데이터 처리부
	public static void action(Calculable calculable) {
		// 데이터
		int x = 10;
		int y = 4;

		// 데이터 처리
		calculable.calculate(x, y);
	}
}
