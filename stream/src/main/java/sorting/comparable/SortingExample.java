package sorting.comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * sorting은 요소를 오름차순 또는 내림차순으로 정렬하는 중간 처리 기능이다.
 */
public class SortingExample {

	/**
	 * 요소가 객체일 경우, 객체가 Comparable을 구현하고 있어야만 sorted() 메소드를 사용하여 정렬할 수 있다.
	 * 그렇지 않다면 classCastException이 발생한다.
	 */
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("홍길동", 30));
		students.add(new Student("신용권", 10));
		students.add(new Student("유미선", 20));

		// 점수를 기준으로 오름차순 정렬 스트림 획득
		students.stream()
				.sorted()
				.forEach(s -> System.out.println(s.getName() + ":" + s.getScore()));

		// 점수를 기준으로 내림차순 정렬 스트림 획득
		// sorted의 파라미터로 Comparator.reverseOrder()를 사용하면 된다.
		students.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(s -> System.out.println(s.getName() + ":" + s.getScore()));
	}
}
