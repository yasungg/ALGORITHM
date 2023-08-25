package 스터디.Day7;

import java.util.Scanner;

public class 점수계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.print(result(parser(N, str)));
    }
    public static int[] parser(int N, String str) {
        String[] strArr = str.split(" ");
        int[] parseRst = new int[N];
        for(int i = 0; i < strArr.length; i++) {
            parseRst[i] = Integer.parseInt(strArr[i]);
        }
        return parseRst;
    }
    public static int result(int[] arr) {
        int rst = 0;
        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) cnt++;
            else if(arr[i] == 0) cnt = 0;
            rst += cnt;
        }
        return rst;
    }
}
