package nestedinterface;

// 구현 클래스
public class messageListener implements Button.OnClickListener {
    public void onClick() {
        System.out.println("메세지를 보냅니다.");
    }
}
