package String.대소문자변환;

import java.util.Scanner;

/**
 * 대문자 -> 소문자, 소문자 -> 대문자 변경 후 문자열 출력
 * 대소문자 구별 방법 = Character.isLowerCase(), Character.isUpperCase()
 * String 추가, 삭제 시 StringBuffer, StringBuilder 사용 ㄱ
 */
public class Main {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(Character.toUpperCase(ch));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(m.solution(s));
    }

}
