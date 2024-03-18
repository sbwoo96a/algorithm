package String.특정문자뒤집기;

import java.awt.print.Pageable;
import java.util.Scanner;

/**
 * 알파벳인지 확인하는 방법: Character.isAlphabetic()
 */
public class Main {

    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (!Character.isAlphabetic(s[left])) left++;
            else if (!Character.isAlphabetic(s[right])) right--;
            else {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
        }
        answer = String.valueOf(s);

        return answer;
    }

    public String my_solution(String str) {
        char[] chars = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while (lt < rt) {
            if (Character.isAlphabetic(chars[lt])) {
                if (Character.isAlphabetic(chars[rt])) {
                    char temp = chars[lt];
                    chars[lt] = chars[rt];
                    chars[rt] = temp;
                    lt++;
                    rt--;
                } else {
                    rt--;
                }
            } else {
                lt++;
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
//        System.out.println(m.my_solution(s));
        System.out.println(m.solution(s));
    }
}
