package ex2;

public class GenericExample {

	public static void main(String[] args) {
		// Product의 타입 파라미터가 K->Tv, M->String으로 결정된다.
		Product<Tv, String> product1 = new Product<>();

		product1.setKind(new Tv());
		product1.setModel("스마트Tv");

		// Product의 타입 파라미터가 K->Car, M->String으로 결정된다.
		Product<Car, String> product2 = new Product<>();

		product2.setKind(new Car());
		product1.setModel("SUV");
	}
}
