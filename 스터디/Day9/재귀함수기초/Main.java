package 스터디.Day9.재귀함수기초;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        result(N);
    }
    public static void result(int N) {
        if(N == 0) {
            return;
        }
        System.out.print(N+ " ");
        result(N-1);
    }
}
