package String.문장속단어;

import java.util.Scanner;

public class Main {

    public String solution(String input) {

        String[] strArr = input.split(" ");
        String answer = strArr[0];

        for(int i = 1; i < strArr.length; i++) {
            if(answer.length() < strArr[i].length()) {
                answer = strArr[i];
            }
        }

        return answer;
    }

    public String solution2(String input) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = input.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public String solution3(String input) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        while ((pos = input.indexOf(' ')) != -1) {
            String tmp = input.substring(0, pos);
            int len = tmp.length();
            if(len > m) {
                m = len;
                answer = tmp;
            }
            input = input.substring(pos + 1);
        }
        if(input.length() > m) answer = input; // indexOf, substring 을 사용할 시 마지막 input 에 대한 처리는 따로 해줘야함
        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(m.solution3(input));
    }

}
