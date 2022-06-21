// Java 프로그래밍 - 다차원 배열

public class Main_06 {
    public static void main(String[] args) {
        
        // 1. 일차원 배열
        System.out.println("== 일차원 배열 ==");
        int[] myArray = {1, 2, 3};
        System.out.println("myArray[0] = " + myArray[0]);

        // 일반적인 for문
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        // 향상된 for문
        for (int i : myArray) {
            System.out.println(i);
        }

        // 2. 이차원 배열
        System.out.println("== 이차원 배열 ==");
        int[][] myArray2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("myArray2[1][2] = " + myArray2[1][2]); // myArray2[1][2] = 6

        // 일반적인 for문
        for (int i = 0; i < myArray2.length; i++) {
            for (int j = 0; j < myArray2[i].length; j++) {
                System.out.println(myArray2[i][j]); // 1 2 3 4 5 6
            }
        }

        // 향상된 for문
        for (int[] ints : myArray2) {
            for(int anInt : ints) {
                System.out.println(anInt); // 1 2 3 4 5 6
            }
        }


//      Q1. 아래와 같이 3x3 행렬이 2차원 배열로 초기화 되어있다.
//          모든 원소를 1로 변경하고, 대각 원소는 10으로 변경하시오.
        int [][] testArray1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        
        for (int i = 0; i < testArray1.length; i++) {
            for (int j = 0; j < testArray1[i].length; j++) {
                if (i == j) {
                    testArray1[i][j] = 10;
                } else {
                    testArray1[i][j] = 1;
                }
                System.out.print(testArray1[i][j] + " ");
            }
            System.out.println();
        }



    }
}
