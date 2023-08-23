package 스터디.Day5;

import java.util.Scanner;

public class Day5_AsIThinkFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(result(str));
    }
    public static String result(String str) {
        str = str.toUpperCase();
        char[] charArr = str.toCharArray();
        int lt = 0;
        int rt = charArr.length - 1;
        while(lt < rt) {
            if(charArr[lt] == charArr[rt]) {
                lt++;
                rt--;
            } else return "NO";
        }
        return "YES";
    }
}
