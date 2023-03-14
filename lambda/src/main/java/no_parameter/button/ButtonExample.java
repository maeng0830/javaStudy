package no_parameter.button;

public class ButtonExample {

	public static void main(String[] args) {
		Button btnOk = new Button();

		// ClickListener(함수형 인터페이스)의 추상 메소드(람다식) 로직을 정의한 익명 구현 객체를 생성
		// Button 클래스의 ClickListener 타입 필드에 대입.
		btnOk.setClickListener(() ->{
			System.out.println("Ok 버튼을 클릭했습니다.");
		});

		// 정의된 로직으로 실행된다.
		btnOk.click(); // print: "Ok 버튼을 클릭했습니다."

		Button btnCancel = new Button();

		btnCancel.setClickListener(() -> {
			System.out.println("Cancel 버튼을 클릭했습니다.");
		});

		btnCancel.click(); // print: "Cancel 버튼을 클릭했습니다."
	}
}
