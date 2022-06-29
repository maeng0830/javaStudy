package main_15;// Java 프로그래밍 - 컬렉션 프레임워크

import java.util.*;

public class Main_15 {

    public static void main(String[] args) {

//      1. List
//        1-1. ArrayList
        ArrayList list1 = new ArrayList(); // ArrayList 객체 생성
        list1.add(1); // 데이터 추가
        list1.add(2);
        list1.add(3);
        System.out.println("list1 = " + list1); // list1 = [1, 2, 3]
        list1.remove(Integer.valueOf(2)); // 그냥 2를 쓸 경우, 인덱스 2의 값이 삭제됨.
        System.out.println("list1 = " + list1); // list1 = [1, 3]
        list1.add(0, 10);
        System.out.println("list1 = " + list1); // list1 = [10, 1, 3]
        System.out.println("list1.size() = " + list1.size()); // ArrayList의 길이
        System.out.println("list1.contains(1) = " + list1.contains(1)); // true, 해당 값이 포함되어 있는지 확인
        System.out.println("list1.indexOf(10) = " + list1.indexOf(10)); // 0, 해당 값의 인덱스를 출력
        list1.clear(); // 모든 값 삭제
        System.out.println("list1 = " + list1); // list1 = []

//      1-2. LinkedList
        System.out.println("== LinkedList ==");
        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("list2 = " + list2);
        list2.addFirst(10); // 첫번째 인덱스에 10추가, ArrayList에서는 사용 불가
        list2.addLast(20); // 마지막 인덱스에 20추가, ArrayList에서는 사용 불가
        list2.remove(Integer.valueOf(1));
        System.out.println("list2 = " + list2); // list2 = [10, 2, 3, 20]
        list2.removeFirst(); // 첫번째 값 삭제, ArrayList에서는 사용 불가
        list2.removeLast(); // 마지막 값 삭제, ArrayList에서는 사용 불가
        System.out.println("list2 = " + list2); // list2 = [2, 3]
        System.out.println(list2.size()); // 2
        System.out.println(list2.contains(2)); // true
        System.out.println(list2.indexOf(3)); // 1
        list2.clear();
        System.out.println("list2 = " + list2); // list2 = []
        

//      2. Set
//      2-1. HashSet
        System.out.println("== HashSet ==");
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.remove(1); // Set은 remove()에서 인자를 인덱스가 아닌 값으로 바로 인식한다.
        System.out.println("set1 = " + set1); // set1 = [2, 3]
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1); // set1 = [2, 3], Set은 중복을 허용하지 않는다.
        System.out.println(set1.size()); // 2
        System.out.println(set1.contains(2)); // true
        

//      2-2. TreeSet
        System.out.println("== TreeSet ==");
        TreeSet set2 = new TreeSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.remove(2);
        System.out.println("set2 = " + set2); // set2 = [1, 3]
        set2.clear();
        set2.add(10);
        set2.add(5);
        set2.add(15);
        set2.add(15); // 중복된 값이므로 걸러짐
        System.out.println("set2 = " + set2); // set2 = [5, 10, 15]
        System.out.println(set2.first()); // 5, 첫번째 값
        System.out.println(set2.last()); // 15, 마지막 값
        System.out.println(set2.lower(10)); // 5, 10보다 작은 값
        System.out.println(set2.higher(10)); // 15, 10보다 큰 값


//      3. Map
//      3-1. HashMap
        System.out.println("== HashMap ==");
        HashMap map1 = new HashMap();
        map1.put(1, "kiwi");
        map1.put(2, "apple");
        map1.put(3, "mango");
        System.out.println("map1 = " + map1); // map1 = {1=kiwi, 2=apple, 3=mango}
        
        map1.remove(2); // 해당 키 값을 삭제
        System.out.println("map1 = " + map1); // map1 = {1=kiwi, 3=mango}
        System.out.println("map1.get(1) = " + map1.get(1)); // map1.get(1) = kiwi, 해당 키의 값을 반환


//      3-2. TreeMap
        System.out.println("== TreeMap ==");
        TreeMap map2 = new TreeMap();
        map2.put(10, "kiwi");
        map2.put(5, "apple");
        map2.put(15, "mango");

        System.out.println(map2.firstEntry()); // 5=apple, 첫번째 키 값을 반환
        System.out.println(map2.lastEntry()); // 15=mango, 마지막 키 값을 반환
        System.out.println(map2.firstKey()); // 5, 첫번째 키를 반환
        System.out.println(map2.lastKey()); // 15, 마지막 키를 반환
        System.out.println(map2.lowerEntry(10)); // 5=apple, 10보다 작은 키의 키 값을 반환
        System.out.println(map2.higherEntry(10)); // 15=mango, 10보다 큰 키의 키 값을 반환
    }
}
