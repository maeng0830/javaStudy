package ex1;

public class GenericExample {

	public static void main(String[] args) {
		// T가 String으로 결정되었다.
		Box<String> box1 = new Box<>();
		// 따라서 content의 타입은 String이 된다.
		box1.content = "안녕하세요.";
		String value1 = box1.content;

		// T가 Integer로 결정되었다.
		Box<Integer> box2 = new Box<>();
		// 따라서 content의 타입은 Integer가 된다.
		box2.content = 100;
		int value2 = box2.content;
	}
}
