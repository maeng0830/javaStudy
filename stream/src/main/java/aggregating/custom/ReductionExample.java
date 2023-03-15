package aggregating.custom;


import java.util.Arrays;
import java.util.List;

/**
 * 스트림은 기본 집계 메소드를 제공하지만, 다양한 집계 결과물을 만들수 있도록 reduce() 메소드를 제공한다.
 * 매개값은 BinaryOperator 함수형 인터페이스가 사용된다. 두 개의 파라미터를 받고 처리 결과를 리턴한다.
 * reduce()는 요소가 없을 경우 예외가 발생한다. identity 파라미터를 사용하여 디폴트 값을 설정하여 예외를 예방할 수 있다.
 */
public class ReductionExample {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("홍길동", 92), new Student("신용권", 95),
				new Student("김자바", 88));

		int sum = students.stream()
				.map(Student::getScore)
				.reduce(0, (a, b) -> a + b); // 92 + 95 = x, x + 88 = sum
		System.out.println("sum = " + sum); // print: 275
	}
}
