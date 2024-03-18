package String.문자찾기;

import java.util.Scanner;

/**
 * char 대소문자 변경 = Character.toLowerCase(x), Character.toUpperCase(x)
 */
public class Main {
    public int solution(String s, char c) {
        int answer = 0;
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch == Character.toLowerCase(c)) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char c = scanner.next().charAt(0);
        System.out.println(m.solution(s, c));
    }
}
