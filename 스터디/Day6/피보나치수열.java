package 스터디.Day6;

import java.util.Scanner;

public class 피보나치수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i : result(N)) {
            System.out.print(i + " ");
        }
    }
    public static int[] result(int N) {
        int[] rst = new int[N];
        rst[0] = 1;
        rst[1] = 1;
        for(int i = 2; i < rst.length; i++) {
            rst[i] = rst[i-1] + rst[i-2];
        }
        return rst;
    }
}
