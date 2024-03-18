package String.암호;

import java.util.Scanner;

public class Main {

    public String solution(int n, String s) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            //1. # -> 1, * -> 0 변환
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');

            //2. 10진수로 변환
            int num = Integer.parseInt(tmp, 2);

            //3. 숫자로 변환 후 정답 생성
            answer += (char) num;
            s = s.substring(7);
        }

        return answer;
    }

    /**
     * 1. 넘어온 문자열(str)의 암호를 숫자로 변경(# -> 1, * -> 0)
     * 2. n개의 암호문자로 분리
     * 3. 각 암호문자를 2진수로 변환
     * 3. 2진수를 10진수로 변환
     * 4. 10진수를 문자로 변환
     * 5. n개의 문자로 answer 생성
     */
    public String my_solution(int n, String str) {
        String answer = "";

        //1. 문자열 변환(# -> 1, * -> 0)
        String strTo1 = str.replace('#', '1');
        String s = strTo1.replace('*', '0');

        for(int i = 0; i < n; i++) {
            //2. 암호 문자 분리
            String cryptoStr = s.substring(i * 7, (i + 1) * 7);

            //3. 문자를 숫자로 변환
            int number = Integer.parseInt(cryptoStr, 2);

            //4. 숫자에 맞는 아스키 코드 answer에 저장
            answer += (char) number;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
//        System.out.println(m.my_solution(n, str));
        System.out.println(m.solution(n, str));
    }
}
