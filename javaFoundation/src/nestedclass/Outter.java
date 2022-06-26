package nestedclass;

public class Outter {
    public void method(int arg) {
        int localVariable = 1;

//        arg = 100;             final 특성으로 변경 불가능
//        localVariable = 100;   final 특성으로 변경 불가능
        // 로컬 클래스
        class Inner {
            void innerMethod() {
                int result = arg + localVariable;
            }
        }
    }
}
