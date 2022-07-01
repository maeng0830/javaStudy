package practice_18_1;

public class Practice1_18_1 {
    public static void solution(int num) {
        String input = String.valueOf(num);
        char[] inputArr = new char[input.length()];
        char[] outputArr = new char[input.length()];
        String output = "";
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = input.charAt(i);
        }

        if(inputArr[0] != '-') {
            for (int i = 0; i < inputArr.length; i++) {
                outputArr[i] = inputArr[(inputArr.length)-1-i];
                output += outputArr[i];
            }
        } else {
            output += inputArr[0];
            for (int i = 1; i < inputArr.length; i++) {
                outputArr[i] = inputArr[(inputArr.length)-i];
                output += outputArr[i];
            }
        }

        System.out.println(Integer.parseInt(output));
    }

    public static void main(String[] args) {
        // Test code
        solution(12345);
        solution(-12345);
        solution(100);
        solution(0);
    }
}
