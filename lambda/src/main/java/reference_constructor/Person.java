package reference_constructor;

public class Person {

	public Member getMember1(Creatable1 creatable) {
		Member member = creatable.create("winter");
		return member;
	}

	public Member getMember2(Creatable2 creatable) {
		Member member = creatable.create("winter", "한겨울");
		return member;
	}
}
