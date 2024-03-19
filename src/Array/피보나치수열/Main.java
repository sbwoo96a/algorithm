package Array.피보나치수열;

import java.util.Scanner;

public class Main {

    public void solution(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    /**
     * 1. 입력한 n의 크기만큼 int배열 생성
     * 2. 처음 2개는 1로 초기화
     * 3. 3번재 부터 반복하여 앞의 두 값의 합을 추가
     */
    public int[] my_solution(int n) {
        //1.
        int[] answer = new int[n];

        //2.
        answer[0] = 1;
        answer[1] = 1;

        //3.
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i : m.my_solution(n)) {
            System.out.print(i + " ");
        }
        System.out.println();
        m.solution(n);
    }
}
