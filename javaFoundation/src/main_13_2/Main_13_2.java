package main_13_2;// Java 프로그래밍 - 입출력_2

import java.io.*;

public class Main_13_2 {

    public static void main(String[] args) throws IOException {
//      1. 파일 쓰기
//      FileWriter
        FileWriter fw = new FileWriter("./memo.txt"); // 파일 생성
        String memo = "헤드 라인\n";
        fw.write(memo); // 파일에 문자열 작성
        memo = "220626 날씨는 맑음\n";
        fw.write(memo); // 파일에 문자열 작성

        fw.close(); // 파일 쓰기 종료

//      PrintWriter
        PrintWriter pw = new PrintWriter("./memo2.txt");
        memo = "헤드 라인\n";
        pw.write(memo);
        memo = "220626 날씨는 맑음\n";
        pw.write(memo);

        pw.close();

//      파일 이어 쓰기
        FileWriter fwa = new FileWriter("./memo.txt", true);
        memo = "오늘은 주말이다\n";
        fwa.write(memo);
        fwa.close();

        PrintWriter pwa = new PrintWriter(new FileWriter("./memo2.txt", true));
        memo = "오늘은 주말이다\n";
        pwa.write(memo);
        pwa.close();



//      2. 파일 입력
        BufferedReader br = new BufferedReader(new FileReader("./memo.txt"));
        while (true) {
            String line = br.readLine(); // 파일의 한줄씩 데이터를 가져옴.

            if (line == null) {
                break;
            }
            System.out.println(line);
        }
    }
}
