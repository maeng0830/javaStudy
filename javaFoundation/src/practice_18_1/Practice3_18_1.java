package practice_18_1;

public class Practice3_18_1 {
    public static String solution(char[] str, char[] find, char[] to) {
        int idx = 0;
        String replaceStr = ""; //최종 변경된 스트링 저장
        char[] replaceBucket = str.clone(); // 변경과정에 사용할 배열열

        do {
            idx = findIndex(replaceBucket, find);
            if(idx != -1) {
                for (int i = 0; i < idx; i++) {
                    replaceStr += replaceBucket[i]; // 변경문자열 등장 전까지는 기존 데이터를 그대로 채워주기
                }

                for(int i = 0; i < to.length; i++) {
                    replaceStr += to[i]; // 변경문자열 채워주기
                }

                for(int i = idx + find.length; i < replaceBucket.length; i++) {
                    replaceStr += replaceBucket[i]; // 그 뒤 문자열은 그대로 채워주기
                }

                replaceBucket = replaceStr.toCharArray(); // 그 다음 타겟 문자열을 탐색하기 위해 현재 타겟 문자열이 변경된 상태를 저장.
                replaceStr = "";
            }
        } while(idx != -1);

        replaceStr = new String(replaceBucket);
        return replaceStr;
    }


    // 문자열의 위치 찾기
    public static int findIndex(char[] str, char[] find) {
        int idx = -1;
        boolean isMatch = false;

        for (int i = 0; i < str.length; i++) {
            if(str[i] == find[0] && str.length - i >= find.length) {
                isMatch = true;
                for(int j = 1; j < find.length; j++) {
                    if(str[i + j] != find[j]) {
                       isMatch = false;
                       break;
                    }
                }
            }
            if (isMatch) {
                idx = i;
                break;
            }
        }
        return idx;
    }


    public static void main(String[] args) {
        // Test code
        String str = "Hello Java, Nice to meet you! Java is fun!";
        String find = "Java";
        String to = "자바";

        // 기존 String replace
//        System.out.println(str.replace(find, to));

        // 자체 구현 replace
        char[] strExArr = str.toCharArray();
        char[] findArr = find.toCharArray();
        char[] toArr = to.toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));

        strExArr = "POP".toCharArray();
        findArr = "P".toCharArray();
        toArr = "W".toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));
    }
}
