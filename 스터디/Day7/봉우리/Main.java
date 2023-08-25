package 스터디.Day7.봉우리;

import java.util.Scanner;

public class Main {
    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] numArr = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j =0; j < N; j++) {
                numArr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(numArr[i][j] + " ");
            }
            System.out.println("");
        }
    }
//    public static int result(int N, int[][] numArr) {
//
//    }
}
