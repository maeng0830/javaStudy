package sorting.comparator;

import java.util.ArrayList;
import java.util.List;
import sorting.comparable.Student;

/**
 * sorting은 요소를 오름차순 또는 내림차순으로 정렬하는 중간 처리 기능이다.
 */
public class SortingExample {

	/**
	 * 요소 객체가 Comparable을 구현하고 있지 않다면, 비교자를 사용하여 요소를 정렬할 수 있다.
	 * 비교자는 Comparator 인터페이스를 구현한 객체를 말한다. 간단하게 람다식으로 작성할 수 있다.
	 */
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("홍길동", 30));
		students.add(new Student("신용권", 10));
		students.add(new Student("유미선", 20));

		// sorted((o1, o2) -> { ... })
		// o1 < o2 = 음수
		// o1 == o2 = 0
		// o1 > o2 = 양수
		// 정수간 비교는 Integer.compare(o1, o2)
		// 실수간 비교는 Double.compare(o1, o2) 메소드를 사용하면 편하다.

		// 점수를 기준으로 오름차순 정렬 스트림 획득
		students.stream()
				.sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
				.forEach(s -> System.out.println(s.getName() + ":" + s.getScore()));

		// 점수를 기준으로 내림차순 정렬 스트림 획득
		students.stream()
				.sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
				.forEach(s -> System.out.println(s.getName() + ":" + s.getScore()));
	}
}
