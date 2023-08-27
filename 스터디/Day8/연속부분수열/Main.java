package 스터디.Day8.연속부분수열;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long sTime = System.currentTimeMillis(); // 시작시간
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(result(N, M, arr));
        Double sec = (System.currentTimeMillis() - sTime) / 1000.0;
        System.out.print(sec);
    }
    public static int result(int N, int M, int[] arr) {
        int rst = 0;
        int k = 0;
        for(int i = k; i < N; i++) {
            for(int j = k; j < N; j++) {
                int sum = 0;
                while(sum == M) {
                    sum += arr[j];
                    rst++;
                    k = j+1;
                }
            }
        }
        return rst;
    }
}
