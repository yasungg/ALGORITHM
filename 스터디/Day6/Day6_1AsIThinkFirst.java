package 스터디.Day6;

import java.util.Scanner;

public class Day6_1AsIThinkFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.print(result(N));
    }
    public static int result(int N) {
        int cnt = 0;
        for(int i = 2; i < N; i++) {
            int tmp = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) tmp++;
            }
            if(tmp < 3) cnt++;
        }
        return cnt;
    }
}
