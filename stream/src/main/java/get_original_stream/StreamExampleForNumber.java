package get_original_stream;

import java.util.stream.IntStream;

/**
 * IntStream, LongStream의 정적 메소드인 range(), rangeClosed() 메소드를 통해 특정 범위의 정수를 얻을 수 있다.
 */
public class StreamExampleForNumber {

	public static int sum;

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100); // 1 ~ 100의 정수 스트림을 얻는다.
		stream.forEach(a -> sum += a);
		System.out.println("sum = " + sum);
	}
}