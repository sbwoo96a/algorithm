package String.회문문자열;

import java.util.Scanner;

/**
 * 대소문자를 구분하지 않는다면?
 * 모두 소문자로 변환 후 진행
 */
public class Main {

    public String solution1(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) return "NO";
        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "NO";
        String temp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(temp)) {
            answer = "YES";
        }

        return answer;
    }

    public String my_solution(String str) {

        String answer = "";
        char[] chars = str.toLowerCase().toCharArray();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                answer = "NO";
                break;
            } else {
                left++;
                right--;
                answer = "YES";
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
//        System.out.println(main.my_solution(s));
        System.out.println(main.solution1(s));
    }
}
