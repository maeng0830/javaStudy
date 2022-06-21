// Java 프로그래밍 - 조건문

public class Main_04
{
    public static void main(String[] args) {

//      1. 조건문 - if
        System.out.println("== if ==");
        // if문은 여러개의 조건문과 그에 대한 코드 블럭으로 구성될 수 있다.
        // 위에서 부터 순서대로 조건문에 대한 판단이 진행된다.
        // 만약 어떤 조건문의 반환 값이 참이어서, 그에 대한 코드 블럭이 실행된다면, 그 아래의 조건문과 코드 블럭은 무시된다.
        // 따라서 조건문을 작성할 때에는 판단 우선 순위를 잘 고려하여 작성해야한다.
        int waterTemperature = 99;
        if(waterTemperature >= 100) {
            System.out.println("물이 끓는 중입니다.");
        } else {
            System.out.println("물을 끓이는 중입니다."); // 물을 끓이는 중입니다.
        }

        int score = 85;
        char grade = 0;
        if(score >= 90) {
            grade = 'A';
        } else if(score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("grade = " + grade); // grade = F
        


//      2. 조건문 - switch
        System.out.println("== switch ==");
        String fruit = "blueberry";

        switch (fruit) {
            case "apple":
                System.out.println(fruit + "은(는) 5000원 입니다.");
                break;
            case "blueberry":
                System.out.println(fruit + "은(는) 10000원 입니다."); // blueberry은(는) 10000원 입니다.
                break;
            default:
                System.out.println("해당 과일이 없습니다.");
                break;
        }



//      Q1. number의 값이 홀수인지 짝수인지 판단하는 코드를 작성하세요.
        int number = 8;
        if (number == 0) {
            System.out.println(number + "은(는) 0입니다.");
        } else if((number%2) == 0) {
            System.out.println(number + "은(는) 짝수입니다."); // 8은(는) 짝수입니다.
        } else {
            System.out.println(number + "은(는) 홀수입니다.");
        }



//      Q2. 아래 주석은 위의 실습에서 진행한 score에 따라 grade를 출력하는 코드이다.
//        이를 switch 조건문 기반으로 바꿔보세요.
//        int score = 90;
//        char grade = 0;
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else {
//            grade = 'F';
//        }
//        System.out.println("grade = " + grade);

        switch(score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("grade = " + grade); // grade = F


    }
}
