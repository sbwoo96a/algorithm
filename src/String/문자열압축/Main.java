package String.문자열압축;

import java.util.Scanner;

public class Main {

    public String solution(String s) {
        String answer = "";
        //빈 문자 하나 추가해서 마지막 문자 비교할 때 에러나는거 방지
        s = s + " ";
        int cnt = 1;
        for(int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) cnt++;
            else {
                answer += s.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }

        return answer;
    }

    /**
     * 1. 반복될 문자 c를 문자열의 첫 문자로 초기화
     * 2. 반복 횟수를 나타낼 count 초기화
     * 3. 문자 비교했을 때 같으면 count++, 다르면 출력
     */
    public String my_solution(String str) {
        StringBuilder answer = new StringBuilder();

        char c = str.charAt(0);
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            //문자가 다르면 비교 문자와 횟수 출력
            if (c != str.charAt(i)) {
                //반복 횟수가 1인 경우 생략
                answer.append((count != 1) ? "" + c + count : "" + c);
                c = str.charAt(i);
                count = 0;
                i--;
            }
            //문자가 같으면 반복 횟수 증가
            else {
                count++;
                //마지막 문자일 때
                if (i == str.length() - 1) {
                    answer.append((count != 1) ? "" + c + count : "" + c);
                }
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
//        System.out.println(m.my_solution(s));
        System.out.println(m.solution(s));
    }
}
