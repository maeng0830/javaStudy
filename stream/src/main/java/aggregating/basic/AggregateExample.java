package aggregating.basic;

import java.util.Arrays;

/**
 * aggregating은 요소들을 추합해 하나의 값을 산출하는 최종 처리이다. 스트림은 다양한 기본 집계 메소드를 제공한다.
 * count(), sum()을 제외한 집계 메소드들은 OptionalXXX를 리턴한다.
 * 이들은 최종 값을 저장하는 객체로 get(), getAsDouble(), getAsInt(), getAsLong()으로 최종값을 얻을 수 있다.
 */
public class AggregateExample {

	public static void main(String[] args) {
		int[] ints = {1, 2, 3, 4, 5};

		// 카운팅
		long count = Arrays.stream(ints)
				.filter(n -> n % 2 == 0)
				.count();
		System.out.println("count = " + count);

		// 총합
		int sum = Arrays.stream(ints)
				.filter(n -> n % 2 == 0)
				.sum();
		System.out.println("sum = " + sum);

		// 평균
		double avg = Arrays.stream(ints)
				.filter(n -> n % 2 == 0)
				.average() // optional 객체
				.getAsDouble();
		System.out.println("avg = " + avg);

		// 최대값
		int max = Arrays.stream(ints)
				.filter(n -> n % 2 == 0)
				.max() // optional 객체
				.getAsInt();
		System.out.println("max = " + max);

		// 최소값
		int min = Arrays.stream(ints)
				.filter(n -> n % 2 == 0)
				.min() // optional 객체
				.getAsInt();
		System.out.println("min = " + min);

		// 2의 배수 중 첫 번째 요소
		int first = Arrays.stream(ints)
				.filter(n -> n % 2 == 0)
				.findFirst() // optional 객체
				.getAsInt();
		System.out.println("first = " + first);
	}
}
