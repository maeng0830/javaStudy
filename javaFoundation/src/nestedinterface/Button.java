package nestedinterface;

public class Button {
    OnClickListener listener;

    void setListener(OnClickListener listener) {
        // OnClickListener의 구현 객체가 인자로 전달됨.
        this.listener = listener;
    }

    void click() {
        // 버튼이 클릭 됐을 때 실행되는 메소드
        // 구체적인 내용을 작성하지 않음.
        // 그 내용은 이 버튼 클래스를 실제로 사용할 개발자들이 작성 <- 그 방법이 인터페이스
        listener.onClick();
    }

    //중첩 인터페이스
    static interface OnClickListener {
        void onClick();
    }
}
