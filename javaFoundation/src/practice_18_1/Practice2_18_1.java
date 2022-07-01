package practice_18_1;

import java.util.Locale;

public class Practice2_18_1 {
    public static void solution(char chr) {
        String input = String.valueOf(chr);
        if(input == input.toLowerCase()) {
            System.out.println(input.toUpperCase());
        } else {
            System.out.println(input.toLowerCase());
        }
    }

    public static void reference() {
        int a = (int)'a';
        System.out.println("a = " + a);
        int z = (int)'z';
        System.out.println("z = " + z);
        int A = (int)'A';
        System.out.println("A = " + A);
        int Z = (int)'Z';
        System.out.println("Z = " + Z);
        int etc = (int)'%';
        System.out.println("etc = " + etc);
    }

    public static void main(String[] args) {
        reference();    // 아스키 코드 참고
        solution('a');
        solution('b');
        solution('C');
        solution('D');
    }
}
