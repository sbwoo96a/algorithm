package Array.큰수출력하기;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public ArrayList<Integer> solution(int n, int[] arr) {
        //1.
        ArrayList<Integer> answer = new ArrayList<>();

        //2.
        answer.add(arr[0]);

        //3.
        for(int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    /**
     * 1. ArrayList로 answer 초기화
     * 2. arr의 첫 번째 요소를 answer에 추가
     * 3. arr의 두 번째 요소부터 앞의 요소와 비교하여 크면 answer 추가
     */
    public ArrayList<Integer> my_solution(int n, int[] arr) {
        //1.
        ArrayList<Integer> answer = new ArrayList<>();

        //2.
        answer.add(arr[0]);

        //3.
        for(int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
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
        for (int i : m.my_solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
}
