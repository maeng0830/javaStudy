package get_original_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * java.util.Collection 인터페이스는 stream(), parallelStream()을 갖고 있다.
 * 때문에 자식 인터페이스인 List, Set 인터페이스를 구현한 모든 컬렉션에서 오리지널 스트림을 얻을 수 있다.
 */
public class StreamExampleForCollection {

	public static void main(String[] args) {
		// list 컬렉션 생성
		ArrayList<Product> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(new Product(i, "상품" + i, "회사" + i, (int) (100000*Math.random())));
		}

		// 컬렉션으로부터 객체 스트림(오리지널) 획득
		Stream<Product> stream = list.stream();
		stream.forEach(product -> System.out.println(product.toString()));
	}
}
