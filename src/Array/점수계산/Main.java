package Array.점수계산;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[] arr) {
        int answer = 0, cnt = 0;
        for (int i : arr) {
            if (i == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }
        return answer;
    }

    /**
     *  1. 최종 점수와 가산점을 담을 변수를 각각 0으로 초기화
     *  2. 반복문을 돌며 정답이면 answer++, plus++
     *  3. 정답이 아니면 plus=0으로 설정
     */
    public int my_solution(int n, int[] arr) {
        int answer = 0;
        int plus = 0;
        for (int i : arr) {
            if (i == 1) {
                answer += i + plus;
                plus++;
            } else {
                plus = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(m.my_solution(n, arr));
        System.out.println(m.solution(n, arr));
    }
}
