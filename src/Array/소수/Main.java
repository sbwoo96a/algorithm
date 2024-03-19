package Array.소수;

import java.util.Scanner;

public class Main {

    public int solution(int n) {
        int answer = 0;
        //index가 n번까지 생기기 위해 배열의 크기는 n+1
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            //소수 판별
            if (ch[i] == 0) {
                answer++;
                //배수 체크
                for(int j = i; j <= n; j=j+i) ch[j] = 1;
            }
        }

        return answer;
    }

    /**
     * 아예 감을 못잡겠음
     */
    public String my_solution(String str) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(m.solution(n));
    }
}
