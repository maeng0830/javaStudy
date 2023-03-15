package looping;

import java.util.Arrays;

/**
 * 루핑은 요소를 하나씩 반복해서 가져오고, 그 요소에 대해 처리하는 것을 말한다.
 * 루핑 메소드에는 peek()과 forEach()가 있다. 전자는 중간 처리이며, 후자는 최종 처리이다.
 */
public class LoopingExample {

	public static void main(String[] args) {
		int[] ints = {1, 2, 3, 4, 5};

		Arrays.stream(ints)
				.filter(a -> a%2 == 0)
				.peek(n -> System.out.println(n)); // 최종 처리가 없으므로 동작 X

		int total = Arrays.stream(ints)
				.filter(a -> a % 2 == 0)
				.peek(n -> System.out.println(n)) // 중간 처리
				.sum(); // 최종 처리
		System.out.println("total = " + total);

		Arrays.stream(ints)
				.filter(a -> a%2 == 0)
				.forEach(n -> System.out.println(n)); // 최종 처리
	}
}
