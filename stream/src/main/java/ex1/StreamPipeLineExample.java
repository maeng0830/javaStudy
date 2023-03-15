package ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 스트림이란 컬렉션 및 배열의 요소를 반복 처리하기 위한 기능(반복자)이다.
 * 스트림은 내부 반복자이므로 처리 속도가 빠르고 병렬 처리에 효율적이다.
 * 스트림은 람다식으로 다양한 요소
 * 처리를 정의할 수 있다. 스트림은 중간 처리와 최종 처리를 수행하도록 파이프 라인을 형성할 수 있다.
 */
public class StreamPipeLineExample {

	/**
	 * 스트림은 하나 이상 연결될 수 있다. 첫 시작은 컬렉션 또는 배열의 오리지널 스트림이다.
	 * 그 후 필터링, 매핑 등 중간 스트림을 연결해 요소들에 대한 중간 처리를 할 수 있다.
	 * 그리고 마지막으로 카운팅, 총합, 평균 등 최종 처리를 한다.
	 */
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 10), new Student("신용권", 20),
				new Student("유미선", 30));

		// 방법 1
		Stream<Student> studentStream = list.stream(); // 오리지널 스트림
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore()); // 중간 스트림
		double avg = scoreStream.average().getAsDouble(); // 최종 처리

		System.out.println("avg = " + avg); // print: 20

		// 방법 2(체이닝)
		// 체이닝을 통해 여러 스트림이 연결된 것을 스트림 파이프라인이라고 한다.
		// 스트림 파이프라인을 구성할 때 주의점은 파이프라인 맨 끝에 반드시 최종 처리가 있어야한다는 것이다.
		// 최종 처리(average() 이하)가 없다면 오리지널 및 중간 스트림은 동작하지 않는다.
		double avg2 = list.stream()
				.mapToInt(student -> student.getScore())
				.average().getAsDouble();

		System.out.println("avg2 = " + avg2); // print: 20
	}
}
