package mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * mapXxx()는 요소를 다른 요소로 변환한 새로운 스트림을 리턴한다.
 * mapXxx()는 파라미터로 Function을 사용한다.
 * Function은 함수형 인터페이스로 요소를 다른 요소로 변환하여 리턴하는 추상 메소드를 갖고 있다.
 */
public class MapXxxExample {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));

		// Student 스트림을 Student.score 스트림으로 변환
		studentList.stream()
				.mapToInt(s -> s.getScore())
				.forEach(s -> System.out.println(s));
		System.out.println();

		///////////////////////////////////////////////////////////////////////
		int[] ints = {1, 2, 3, 4, 5};

		/**
		 * 기본 타입 -> 기본 타입, 기본 타입 -> 래퍼 객체 변환은 아래와 같은 메소드를 사용하면 간단하다.
		 * asLongStream(), asDoubleStream(), boxed()
		 */
		IntStream intStream = Arrays.stream(ints);
		intStream
				.asDoubleStream()
				.forEach(d -> System.out.println(d));
		System.out.println();

		intStream = Arrays.stream(ints);
		intStream
				.boxed()
				.forEach(o -> System.out.println(o.intValue()));
	}
}
