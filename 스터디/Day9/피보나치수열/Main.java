package 스터디.Day9.피보나치수열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            System.out.print(fivonacci(i) + " ");
        }
    }
    public static int fivonacci(int N) {
        if(N <= 1) return 1;
        else return fivonacci(N-1) + fivonacci(N-2);
    }
}
