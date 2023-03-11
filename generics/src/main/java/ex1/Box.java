package ex1;

//제네릭이란 결정되지 않은 타입을 파라미터로 처리하고, 실제 사용할 때 파라미터를 구체적인 타입으로 대체시키는 기능
// Box를 선언할 당시에 실제 사용될 타입이 정해지지 않았다.
// 제네릭 기능을 통해 T라는 파라미터로 타입을 미결정 해두었다.
public class Box<T> {
	// Box를 사용할 떄 T의 실제 타입이 정해질 것이고, 그것이 content의 타입으로 사용될 것이다.
	public T content;
}
