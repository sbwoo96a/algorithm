package String.유효한팰린드롬;

import java.util.Scanner;

/**
 * replaceAll 과 정규식 활용
 */
public class Main {

    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) answer = "YES";
        return answer;
    }

    public String my_solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (!Character.isAlphabetic(str.charAt(left))) {
                left++;
            } else if (!Character.isAlphabetic(str.charAt(right))) {
                right--;
            } else {
                if (str.charAt(left) != str.charAt(right)) {
                    return "NO";
                }
                left++;
                right--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        System.out.println(m.my_solution(s));
        System.out.println(m.solution(s));
    }
}
