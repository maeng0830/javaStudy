package main_16;// Java 프로그래밍 - 람다식

interface ComputeTool {
    public abstract int compute(int x, int y);

//    public abstract int compute2(int x, int y);
}



public class Main_16 {
    public static void main(String[] args) {
        // 익명 객체 활용
        ComputeTool cTool1 = new ComputeTool() {
            @Override
            public int compute(int x, int y) {
                return x + y;
            }
        };
        System.out.println(cTool1.compute(1, 2));

        // 람다식
        ComputeTool cTool2 = (x, y) -> { return x + y; }; // 간결하게 동작을 표현할 수 있다. 그러나 한 번에 두개의 동작을 작성할 수 없다.
        System.out.println(cTool1.compute(1, 2));
    }
}
