package aggregating.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Optional 클래스는 집게값 뿐만 아니라
 * 집계값이 존재하지 않을 경우의 디폴드 값 설정
 * 집계값이 있을 경우에만 동작하는 Consumer를 등록할 수 있다.
 * 이러한 기능을 통해 요소가 존재하지 않아 집계값을 산출할 수 없을 때, 집계값에 접근하여 발생하는 NoSuchElementException 예외를 방지할 수 있다.
 */
public class OptionalExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		// 방법 1. isPresent() 메소드가 true를 리턴할 때만 집계값을 얻는다.
		OptionalDouble optional = list.stream()
				.mapToInt(Integer::intValue)
				.average();
		if (optional.isPresent()) {
			System.out.println("true = " + optional.getAsDouble());
		} else {
			System.out.println("false = " + 0.0);
		}

		// 방법 2. orElse() 메소드로 집계값이 없을 경우를 대비해서 디폴트 값을 정해놓는다.
		double avg = list.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0.0);
		System.out.println("avg = " + avg);

		// 방법 3. 집계값이 있을 경우에만 동작하는 ifPresent()에 Consumer 람다식을 제공한다.
		list.stream()
				.mapToInt(Integer::intValue)
				.average()
				.ifPresent(d -> System.out.println("d = " + d));
	}
}
