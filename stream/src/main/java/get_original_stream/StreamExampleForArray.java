package get_original_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * java.util.Arrays를 통해 다양한 종류의 배열로부터 스트림을 얻을 수 있다.
 */
public class StreamExampleForArray {

	public static void main(String[] args) {
		String[] names = {"홍길동", "신용권", "김미나"};

		Stream<String> stream1 = Arrays.stream(names);
		stream1.forEach(n -> System.out.print(n + " "));
		System.out.println();

		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		IntStream stream2 = Arrays.stream(nums);
		stream2.forEach(n -> System.out.print(n + " "));
		System.out.println();
	}
}
