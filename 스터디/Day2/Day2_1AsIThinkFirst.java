package 스터디.Day2;

import java.util.Scanner;

public class Day2_1AsIThinkFirst {
    public static void main(String[] args) {
        //sudo code
        //숫자 개수 N, 합을 구해야 하는 횟수 M 받기
        //N개의 숫자 입력받기
        //M개의 줄에 합을 구해야 하는 구간 i와 j 입력받기
        //합배열 먼저 구하기
        //for(숫자 개수만큼 반복) {
        //S[i-1] + A[I] 합 배열 i-1번째 요소에 입력받은 숫자 배열의 i번 index에 해당하는 값을 더하기
        //}
        //int result = 0;
        //for(합을 구해야 하는 횟수 M만큼 반복) {
        //result = S[j] - S[i-1]
        //}
        //System.out.print("구간합 결과 : " + result);
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 개수 N과 합을 구해야 하는 횟수 M을 한 칸 띄워서 입력하세요. : ");
        String NM = sc.nextLine();
        String[] NMArr = NM.split(" ");
        int[] NMArrInteger = new int[2];
        for(int i = 0; i < 2; i++) {
            NMArrInteger[i] = Integer.parseInt(NMArr[i]);
        }
        int N = NMArrInteger[0];
        int M = NMArrInteger[1];

        System.out.print("N개의 숫자를 한 칸 띄워서 입력하세요.");
        String num = sc.nextLine();
        String[] numArr = num.split(" ");
        int[] numArrInteger = new int[NMArrInteger[0]];
        for(int i = 0; i < NMArrInteger[0]; i++) {
            numArrInteger[i] = Integer.parseInt(numArr[i]);
        }
        System.out.print("구간합을 구하고자 하는 구간을 합을 구해야 하는 횟수만큼 입력하세요. A~B : ");
        int[] lengthArrInteger = new int[2];
        for(int i = 0; i < M; i++) {
            String length = sc.nextLine();
            String[] lengthArr = length.split(" ");

            for(int j = 0; j < 2; j++) {
                lengthArrInteger[j] = Integer.parseInt(lengthArr[j]);
            }
        }
        int min = lengthArrInteger[0];
        int max = lengthArrInteger[1];

        int[] sumArr = sumArr(N, numArrInteger);

        int[] result = new int[M];
        for(int i = 1; i < M; i++) {
            result[i-1] = sumArr[max] - sumArr[min - 1];
            System.out.print(i+1 + "번째 " + "결과 : " + result[i]);
            System.out.println("");
        }
    }

    static int[] sumArr(int N, int[] numArrInteger) {
        int[] sumArray = new int[N];
        sumArray[0] = numArrInteger[0];
        for(int i = 1; i < N; i++) {
            sumArray[i] += sumArray[i-1] + numArrInteger[i];
        }
        return sumArray;
    }
}
