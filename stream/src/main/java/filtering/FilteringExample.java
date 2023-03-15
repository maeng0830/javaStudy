package filtering;

import java.util.ArrayList;

/**
 * 필터링은 요소를 걸러내는 중간 처리 기능이다.
 * distinct()와 filter()를 통해 필터링을 할 수 있다.
 */
public class FilteringExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("김자바");
		list.add("신용권");
		list.add("신민철");

		// 중복 요소 제거
		// distinct()는 중복 요소를 제거한다.
		// 객체 스트림일 경우 equals()의 리턴 값이 true이면 동일 요소로 판단한다.
		list.stream()
				.distinct()
				.forEach(n -> System.out.println(n));
		System.out.println();

		// 신으로 시작하는 요소만 필터링
		// filter()는 주어진 Predicate가 true를 리턴하는 요소만 필터링한다.
		// Predicate는 함수형 인터페이스이며, 파라미터를 확인하는 test() 추상메소드를 갖고 있다.
		list.stream()
				.filter(n -> n.startsWith("신"))
				.forEach(n -> System.out.println(n));
		System.out.println();

		// 중복 요소 제거 -> 신으로 시작하는 요소 필터링
		list.stream()
				.distinct()
				.filter(n -> n.startsWith("신"))
				.forEach(n -> System.out.println(n));
	}
}
