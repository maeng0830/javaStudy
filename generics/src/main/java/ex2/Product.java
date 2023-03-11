package ex2;

//제네릭 타입은 결정되지 않은 타입을 파라미터로 가지는 클래스와 인터페이스를 말한다.
//제네릭 타입은 선언부에 <>가 사용되고, 그 사이에 타입 파라미터들이 위치한다.
//Product는 K, M을 타입 파라미터로 가진다. 이 타입 파라미터들은 적용된 클래스, 인터페이스 내부에서 사용 가능하다.
public class Product<K, M> {

	// 타입 파라미터를 필드의 타입으로 사용한다.
	private K kind;
	private M model;

	// 타입 파라미터를 리턴 타입으로 사용
	public K getKind() {
		return kind;
	}

	// 타입 파라미터를 메소드 파라미터로 사용
	public void setKind(K kind) {
		this.kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}
}
