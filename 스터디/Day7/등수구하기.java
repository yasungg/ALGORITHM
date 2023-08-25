package 스터디.Day7;

import java.util.Scanner;

public class 등수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        for(int i : result(parser(N, str))) {
            System.out.print(i + " ");
        }
    }
    public static int[] parser(int N, String str) {
        int[] rst = new int[N];
        String[] strArr = str.split(" ");
        for(int i = 0; i < strArr.length; i++) {
            rst[i] = Integer.parseInt(strArr[i]);
        }
        return rst;
    }
    public static int[] result(int[] arr) {
        int[] rst = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) cnt++;
            }
            rst[i] = cnt;
        }
        return rst;
    }
}
