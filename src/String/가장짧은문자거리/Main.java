package String.가장짧은문자거리;

import java.util.Scanner;

public class Main {

    /**
     *  1. 오른쪽 방향으로 최단거리를 구함
     *  2. 왼쪽 방향으로 최던거리를 구할 때 값이 작은 값을 answer에 설정
     */
    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    /**
     * 1. 입력한 문자열을 띄어쓰기 기준으로 분리하여 s, t로 나눔
     * 2. 구간을 나눔
     *  2-1. 구간을 나눌 때 기준이 되는 index 구하기
     *      (지점을 나누는 기준: 첫번째, 두번째 t의 index 합 / 2)
     * 3. 문자열의 첫 index ~ 기준 index 까지 최소거리 계산
     * 4. 문자열에서 최소거리 계산이 끝난 부분 제외 후 반복
     */
    public String my_solution(String str) {

        String answer = "";

        //1. 문자열 s, 문자 t 분리
        String s = str.split(" ")[0];
        String t = str.split(" ")[1];
        StringBuilder sb = new StringBuilder(s);
        int firstIndex = 0;
        int secondIndex = 0;

        while(secondIndex != -1) {
            //2. s에서 첫 번째, 두 번째 t의 index 구하기
            firstIndex = sb.indexOf(t);  //첫 번째 t의 index
            secondIndex = sb.indexOf(t, firstIndex + 1); //두 번째 t의 index
            System.out.println("firstIndex = " + firstIndex);
            System.out.println("secondIndex = " + secondIndex);

            //2-1. 구간을 나눌 기준이 되는 index 구하기
            int index = (secondIndex == -1) ? sb.length() - 1: (firstIndex + secondIndex) / 2;
            System.out.println("index = " + index);

            //3. 0 ~ index 까지 문자열을 분리하여 t와의 최소거리 계산
            for (int i = 0; i <= index; i++) {
                //문자 t 와의 거리 계산(절댓값)
                answer += Math.abs(i - firstIndex) + " ";
                System.out.println("answer = " + answer);
            }

            //4. 최소 거리 계산이 끝난 구간은 문자열 s에서 삭제
            sb.delete(0, index + 1);
            System.out.println("최소거리 계산 후 sb = " + sb.toString());
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(m.my_solution(s));

        String str = sc.next();
        char c = sc.next().charAt(0);
        for(int i : m.solution(str, c)) {
            System.out.print(i + " ");
        }
    }
}
