package 스터디.Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1_2AsIThinkFirst {
    public static void main(String[] args) {
        //문제 : 최댓값을 M이라고 할 때, 주어진 모든 점수를 점수/M * 100으로 고쳤다.
        //이 때, 바뀐 계산 방식으로 도출된 평균값을 구하시오.

        //로직 : 1) 응시한 전체 과목 수와 과목별 점수를 입력받는다.
        //      2) for {모든 점수를 다 더한 후}
        //      3) 버블 정렬로 최대값을 구한다.
        //      4) 총합을 최대값으로 나누고 100을 곱한다. 그리고 그 값을 응시한 전체 과목 수로 나눈다.

        Scanner sc = new Scanner(System.in);

        System.out.print("응시한 전체 과목 수를 입력하세요. : ");
        int N = sc.nextInt();

        int[] Array = new int[N];
        System.out.print("응시 과목별 점수를 입력하세요. : ");
        for(int i = 0; i < N; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("새로운 평균 : " + result(N, Array));
    }
    static int result(int N, int[] Array) {
        int sum = 0;
        for(int num : Array) {
            sum += num;
        }
        return sum * 100 / max(Array) / N;
    }
    static int max(int[] Array) {
        int max = 0;
        for(int i = 0; i < Array.length; i++) {
            if(Array[i+1] > max) {
                max = Array[i+1];
            }
        }
        System.out.print(max);
        if(max == 0) new RuntimeException("실패!! max 값 0");
        return max;
    }
    //틀렸음!!
    //디버깅 결과 : max가 배열의 가장 마지막 숫자로 나타난다. 따라서 올바른 결과가 도출되고 있지 않다.
    //문제는 버블 정렬을 이용한 최대값 구하기 로직에서 나타난다는 사실을 알 수 있다.
}
