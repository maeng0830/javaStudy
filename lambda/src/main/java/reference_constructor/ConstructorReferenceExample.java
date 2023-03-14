package reference_constructor;

/**
 * 람다식이 단순히 객체를 생성하로 리턴하도록 구성된다면, 람다식을 생성자 참조로 대치할 수 있다.
 * 클래스::new
 * 추상 메소드의 매개변수 개수에 따라 실행되는 Member 생성자가 다르다.
 */
public class ConstructorReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();

		Member member1 = person.getMember1(Member::new);
		System.out.println(member1.toString());

		Member member2 = person.getMember2(Member::new);
		System.out.println(member2.toString());
	}
}
