package Array.보이는학생;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[] arr) {
        int answer = 1, max = arr[0];

        for(int i = 1; i < n; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }

        return answer;
    }

    /**
     * 1. 앞 사람 한명은 무조건 볼 수 있으니까 answer = 1 로 초기화
     * 2. 현재 가장 큰 키를 담는 변수 height 생성 후 arr의 첫 값으로 초기화
     * 2. 순서대로 2명씩 비교하여 뒤에 사람이 더 크면 answer++, height 설정
     */
    public int my_solution(int n, int[] arr) {
        int answer = 1;
        int height = arr[0];

        for(int i = 1; i < n; i++) {
            if (arr[i] > height) {
                answer++;
                height = arr[i];
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
    }
}
