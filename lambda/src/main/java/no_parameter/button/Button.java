package no_parameter.button;

public class Button {

	//클래스 멤버 함수형 인터페이스
	@FunctionalInterface
	public static interface ClickListener {
		// 추상 메소드(람다식)
		void onClick();
	}

	private ClickListener clickListener;

	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	public void click() {
		this.clickListener.onClick();
	}

}
