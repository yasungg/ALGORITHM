package 스터디.Day6;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 큰수출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        sc.close();
        for(int x : result(parser(N, str))) {
            System.out.print(x + " ");
        }
    }
    public static int[] parser(int N, String str) {
        int[] arr = new int[N];
        String[] strArr = str.split(" ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        return arr;
    }
    public static List<Integer> result(int[] parsed) {
        List<Integer> rst = new ArrayList<>();
        rst.add(parsed[0]);
        for(int i = 1; i < parsed.length; i++) {
            if(parsed[i] > parsed[i-1]) rst.add(parsed[i]);
        }
        return rst;
    }
}
