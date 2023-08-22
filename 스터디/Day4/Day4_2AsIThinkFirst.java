package 스터디.Day4;

import java.util.Scanner;

public class Day4_2AsIThinkFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(result(str));
    }

    public static String result(String str) {
        String rst = "";
        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) rst += Character.toUpperCase(x);
            else rst += Character.toLowerCase(x);
        }
        return rst;
    }
}
