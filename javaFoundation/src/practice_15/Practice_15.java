package practice_15;// Practice
// 로또 번호 만들기

import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Practice_15 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }

        LinkedList list = new LinkedList(set);
        System.out.println("list = " + list);
        Stream listStream = list.stream();
        listStream.forEach(n -> System.out.print(" " + n));
    }
}
