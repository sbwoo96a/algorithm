package String.중복문자제거;

import java.util.Scanner;

/**
 * 문자열의 앞에서 처음 발견되는 위치= indexOf()
 */
public class Main {

    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(main.solution(s));
    }
}
