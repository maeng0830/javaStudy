package collecting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 스트림은 중간 처리를 거친 후의 요소들을 컬렉션에 수집하여 반환하는 collect() 메소드를 제공한다.
 * collect()는 Collector 인터페이스 타입을 파라미터로 가진다.
 * Collector 구현체는 Collectors 클래스의 정적 메소드로 얻을 수 있다.
 */
public class CollectExample {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("홍길동", "남", 92));
		students.add(new Student("김수영", "여", 87));
		students.add(new Student("김자바", "남", 95));
		students.add(new Student("오해영", "여", 93));

		// 남자학생들의 이름을 요소로 하는 list 생성
		List<String> maleList = students.stream()
				.filter(s -> s.getSex().equals("남"))
				.map(s -> s.getName())
				.collect(Collectors.toList());

		maleList.forEach(m -> System.out.println("m = " + m));
		System.out.println();

		// key(이름) : value(점수) map 생성
		Map<String, Integer> map = students.stream()
				.collect(Collectors.toMap(
						s -> s.getName(),
						s -> s.getScore()
				));
		System.out.println(map);
		System.out.println();

		/**
		 * collect()는 요소 그룹핑이라는 기능을 제공한다.
		 * 요소 그룹핑은 컬렉션의 요소들을 그룹핑 해서 Map 객체를 생성하는 기능이다.
		 */

		// 성별을 key로 하는 Map 객체 생성
		Map<String, List<Student>> groupMap = students.stream()
				.collect(
						Collectors.groupingBy(s -> s.getSex())
				);

		List<Student> maleList2 = groupMap.get("남");
		maleList2.stream().forEach(s -> System.out.println("s = " + s.getName()));

		List<Student> femaleList = groupMap.get("여");
		femaleList.stream().forEach(s -> System.out.println("s = " + s.getName()));
	}
}
