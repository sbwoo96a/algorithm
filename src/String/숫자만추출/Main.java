package String.숫자만추출;

import java.util.Scanner;

public class Main {

    public int solution1(String str) {
        int answer = 0;
        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57) answer = answer * 10 + (c - 48);
        }
        return answer;
    }

    public int solution2(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) answer += c;
        }
        return Integer.parseInt(answer);
    }
    public int my_solution(String str) {
        int answer;
        answer = Integer.parseInt(str.replaceAll("[^0-9]", ""));
        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(m.my_solution(s));
        System.out.println(m.solution1(s));
        System.out.println(m.solution2(s));
    }
}
