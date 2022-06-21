// Java 프로그래밍 - 반복문

public class Main_05
{
    public static void main(String[] args) {

//      1. 반복문 - for
        System.out.println("== for ==");           // 0
//      1-1. 기본 사용 방법                          // 1
        for(int i = 0; i < 5; i++) {               // 2
            System.out.println(i);                 // 3
        }                                          // 4

        for(int i = 0; i < 5; i++) {                // *
            for(int j = 0; j < (i + 1); j++) {      // **
                System.out.print("*");              // ***
            }                                       // ****
            System.out.println();                   // *****
        }

        for(int i = 0; i < 5; i++) {
            if(i == 2) {
                continue;                           // *
            }                                       // **
            for(int j = 0; j < (i + 1); j++) {      // ****
                System.out.print("*");              // ***** , i가 2일 때는 그 아래의 코드가 실행되지 않고, 다음 반복으로 넘어감.
            }
            System.out.println();
        }

        for(int i = 0; i < 5; i++) {
            if(i == 2) {
                break;                              // *
            }                                       // ** i가 2일 때 반복문이 종료됨.
            for(int j = 0; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//      1-2. for each
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();

        //for each는 어떤 특정한 배열의 모든 데이터를 순회할 때 사용하면 편리하다.
        for (int num : nums) {
            System.out.print(num);
        }
        System.out.println();


//      2. 반복문 - while
        System.out.println("== while ==");
//      2-1. while
        int num3 = 0;
        while(num3 < 5) {
            System.out.print(num3++);
        }
        System.out.println(); // 01234

        num3 = 0;
        while(num3 < 5) {
            if(num3 == 2) {
                num3++;
                continue;
            }
            System.out.print(num3++);
        }
        System.out.println(); // 0134

        num3 = 0;
        while (num3 < 5) {
            if(num3 == 2) {
                num3++;
                break;
            }
            System.out.print(num3++);
        }
        System.out.println(); // 01


//      2-2. do-while
        boolean knock = false;
        do {
            System.out.println("knock"); // knock
        } while (knock);



//      Q1. 아래와 같은 출력 결과를 반복문과 조건문을 이용하여 출력해보세요.
//      *
//      ***
//      *****
//      *******
        for (int i = 0; i < 7; i++) {
            if ((i % 2) != 0) {
                continue;
            }
            for (int j = 0; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//      Q2. 반복문을 실행할 때마다 물 온도를 1도씩 올리고 100도가 되면 종료한다.
//          추가로, 10도, 20도, ... 10도 간격으로 물 온도를 출력하시오.
        int waterTemperature = 0;
        while (waterTemperature < 100) {
            waterTemperature++;
            if(waterTemperature % 10 == 0) {
                System.out.println("현재 온도는 " + waterTemperature + "도 입니다.");
                if(waterTemperature == 100) {
                    System.out.println("물이 끓고 있습니다.");
                }
            }
        }


    }
}
