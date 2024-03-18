package String.단어뒤집기;

import java.util.Scanner;

/**
 * StringBuilder 의 reverse()
 */
public class Main {

    public void my_solution(String[] strArr) {

        for (int i = 0; i < strArr.length; i++) {
            StringBuilder sb = new StringBuilder(strArr[i]);
            System.out.println(sb.reverse());
        }
    }


    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            strArray[i] = s;
        }
        m.my_solution(strArray);
    }
}
