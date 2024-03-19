package Array.뒤집은소수;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        //입력받은 숫자 뒤집기
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                //1의자리 뽑음
                int t = tmp % 10;
                //뒤집어진 결과를 저장할 변수에 차례로 저장
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) answer.add(res);
        }

        return answer;
    }

    /**
     * 1. 입력받은 자연수들을 StringBuilder의 reverse로 뒤집은 후 다시 int로 변환
     * 2. 소수 판별 진행 후 answer에 추가
     */
    public ArrayList<Integer> my_solution(int n, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        //1.
        for (int i : arr) {
            //int -> StringBuilder -> reverse -> int
            i = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
            //소수인지 판별할 변수
            boolean isPrimNumber = true;
            if (i == 1) isPrimNumber = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimNumber = false;
                    break;
                }
            }
            if (isPrimNumber) answer.add(i);
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
        for (int i : m.my_solution(n, arr)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : m.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
}
