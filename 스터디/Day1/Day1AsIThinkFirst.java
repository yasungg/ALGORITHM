package 스터디.Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1AsIThinkFirst {
    public static void main(String[] args) {
        //문제 : N개의 숫자가 공백 없이 쓰여 있다. 이 숫자들을 모두 합해 출력하는 프로그램을 작성하시오.
        //단, (1 <= N <= 100)
        //입력값은 숫자의 갯수 N과 공백없이 쓰여있는 숫자배열 두 개.

        //로직 : 1) 숫자를 입력받는다.
        //      2) 입력받은 공백없는 숫자배열에서 각 자리수를 추출, 배열로 반환한다.
        //      3) 추출한 자리수를 모두 더한다.
        //      4) 더한 값을 출력한다.

        Scanner sc = new Scanner(System.in);

        System.out.print("자릿수를 입력하세요. : ");
        int N = sc.nextInt();
        System.out.print("숫자열을 입력하세요. : ");
        int Default = sc.nextInt();


        System.out.print("결과 : " + getSummary(extractedArr(N, Default)));
    }

    //숫자열을 각각 쪼개서 배열에 담는다.
    static List<Integer> extractedArr(int N, int Default) {
        List<Integer> Array = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            Array.add(Default / (int) Math.pow(10, (N - (i+1))));
            Default = Default % (int) Math.pow(10, (N - (i+1)));
        }
        return Array;
    }

    //추출한 배열을 전부 합친다.
    static int getSummary(List<Integer> extractedArr) {
        int summary = 0;
        for(int num : extractedArr) {
            summary += num;
        }
        return summary;
    }
    //디버깅 결과 : 입력 자료형 : int, 어레이리스트 사이즈 : 정상 출력
}
