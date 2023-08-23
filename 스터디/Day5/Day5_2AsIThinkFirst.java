package 스터디.Day5;

import java.util.Scanner;

public class Day5_2AsIThinkFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(result(str));
    }
    public static int result(String str) {
        String rst = "";
        char[] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            if(Character.isDigit(charArr[i])) {
                rst += String.valueOf(charArr[i]);
            }
        }
        return Integer.parseInt(rst);
    }
}
