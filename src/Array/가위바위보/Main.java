package Array.가위바위보;

import java.util.Scanner;

public class Main {

    //비겼을 때, 기준을 A로 설정한 후 A가 이겼을 상황 + 그 상황이 아니면 B가 이김
    public String[] solution(int n, int[] arrA, int[] arrB) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            //승패 기준을 A로 잡고 진행
            //비김
            if (arrA[i] == arrB[i]) answer[i] = "D";
            //가위 승
            else if (arrA[i] == 1 && arrB[i] == 3) answer[i] = "A";
            //바위 승
            else if (arrA[i] == 2 && arrB[i] == 1) answer[i] = "A";
            //보 승
            else if (arrA[i] == 3 && arrB[i] == 2) answer[i] = "A";
            //다 짐
            else answer[i] = "B";
        }

        return answer;
    }

    /**
     * 1. n만큼 반복하여 두 배열의 같은 index 요소의 값을 비교해 결과 출력
     * 2. 1:가위, 2:바위, 3:보
     */
    public String[] my_solution(int n, int[] arrA, int[] arrB) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            //A의 결과
            //무승부
            if (arrA[i] == arrB[i]) answer[i] = "D";

            //가위
            if (arrA[i] == 1) {
                //승
                if (arrB[i] == 3) answer[i] = "A";
                //패
                else if (arrB[i] == 2) answer[i] = "B";
            }

            //바위
            if(arrA[i] == 2) {
                //승
                if (arrB[i] == 1) answer[i] = "A";
                //패
                else if (arrB[i] == 3) answer[i] = "B";
            }

            //보
            if(arrA[i] == 3) {
                //승
                if (arrB[i] == 2) answer[i] = "A";
                    //패
                else if (arrB[i] == 1) answer[i] = "B";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }
        for (String s : m.solution(n, arrA, arrB)) {
            System.out.println(s);
        }
    }
}