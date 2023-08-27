package 스터디.Day8.최대매출;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(result(N, k, arr));
    }
    public static int result(int N, int k, int[] arr) {
        int answer, sum = 0;
        for(int i = 0; i < k; i++) sum += arr[i];
        answer = sum;
        for(int i = k; i < N; i++) {
            sum += arr[i] - arr[i-k];
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}
