package mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * flatMapXxx()은 하나의 요소를 복수 개의 요소들로 변환한 새로운 스트림을 리턴한다.
 * a, b -> a1, a2, b1, b2
 */
public class FlatMapXxxExample {

	public static void main(String[] args) {
		// 문장 스트림을 단어 스트림으로 변환
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("i am a best developer");

		list1.stream()
				.flatMap(data -> Arrays.stream(data.split(" ")))
				.forEach(word -> System.out.println(word));


		// 문자열 숫자 목록 스트림을 숫자 스트림으로 변환
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
		list2.stream()
				.flatMapToInt(data -> {
					String[] strArr = data.split(",");
					int[] intArr = new int[strArr.length];
					for (int i = 0; i < strArr.length; i++) {
						intArr[i] = Integer.parseInt(strArr[i].trim());
					}
					return Arrays.stream(intArr);
				})
				.forEach(n -> System.out.println(n));

	}
}
