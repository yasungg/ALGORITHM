package 스터디.Day8.두배열합치기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long sTime = System.currentTimeMillis(); // 시작시간
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for(int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for(int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int i : result(N, arr1, M, arr2)) {
            System.out.print(i + " ");
        }
        Double sec = (System.currentTimeMillis() - sTime) / 1000.0;
        System.out.print(sec);
    }
    public static List<Integer> result(int N, int[] arr1, int M, int[] arr2) {
        List<Integer> rst = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while(p1 < N && p2 < M) {
            if(arr1[p1] < arr2[p2]) rst.add(arr1[p1++]);
            else rst.add(arr2[p2++]);
        }
        while(p1 < N) rst.add(arr1[p1++]);
        while(p2 < M) rst.add(arr2[p2++]);
        return rst;
    }
}
