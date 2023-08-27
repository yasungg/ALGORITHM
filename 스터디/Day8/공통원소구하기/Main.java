package 스터디.Day8.공통원소구하기;

import java.util.ArrayList;
import java.util.Collections;
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
        if(arr1.length <= arr2.length) {
            while(p1 < N) {
                for (int i = 0; i < N; i++) {
                    if (arr1[p1] == arr2[i]) rst.add(arr1[p1]);
                }
                p1++;
            }
        }
        if(arr1.length > arr2.length) {
            while(p2 < M) {
                for (int i = 0; i < M; i++) {
                    if (arr1[i] == arr2[p2]) rst.add(arr2[p2]);
                }
                p2++;
            }
        }
        Collections.sort(rst);
        return rst;
    }
}
