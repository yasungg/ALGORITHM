package 스터디.Day1;

import java.util.Arrays;
import java.util.Scanner;

public class Day1_2Studied {
    public static void main(String[] args) {
        //문제 : 최댓값을 M이라고 할 때, 주어진 모든 점수를 점수/M * 100으로 고쳤다.
        //이 때, 바뀐 계산 방식으로 도출된 평균값을 구하시오.

        //로직 : 1) 응시한 전체 과목 수와 과목별 점수를 입력받는다.
        //      2) for {모든 점수를 다 더한 후}
        //      3) 최대값을 구한다.
        //      4) 총합을 최대값으로 나누고 100을 곱한다. 그리고 그 값을 응시한 전체 과목 수로 나눈다.

        Scanner sc = new Scanner(System.in);

        System.out.print("응시한 전체 과목 수를 입력하세요. : ");
        int N = sc.nextInt();

        int[] Array = new int[N];
        System.out.print("응시 과목별 점수를 입력하세요. : ");
        for(int i = 0; i < N; i++) {
            Array[i] = sc.nextInt();
        }
        sc.close();

        System.out.println();
        System.out.print("결과 : " + calc(sum(Array), max(Array), N));
    }

    //점수 총합 구하기
    static int sum(int[] Array) {
        int summary = 0;
        for(int num : Array) {
            summary += num;
        }
        return summary;
    }

    //최대값 구하기
    static int max(int[] Array) {
        int maximum = -1;
        for(int i = 0; i < Array.length; i++) {
            if(Array[i] > maximum) maximum = Array[i];
        }
        return maximum;
    }

    //최종 계산
    static double calc(int sum, int max, int N) {
        return sum * 100.0 / max / N;
    }
}
