package 스터디.Day7.격자판최대합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] num = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        System.out.print(result(N, num) + " ");
    }
    public static int result(int N, int[][] num) {
        int rst = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                sum1 = sum2 = 0;
                sum1 += num[i][j];
                sum2 += num[j][i];
            }
            rst = Math.max(rst, sum1);
            rst = Math.max(rst, sum2);
        }
        sum1 = 0;
        sum2 = 0;
        for(int i = 0; i < N; i++) {
            sum1 += num[i][i];
            sum2 += num[i][N-i-1];
        }
        rst = Math.max(rst, sum1);
        rst = Math.max(rst, sum2);
        return rst;
    }
}
