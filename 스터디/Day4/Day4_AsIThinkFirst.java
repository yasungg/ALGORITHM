package 스터디.Day4;

import java.util.Scanner;

public class Day4_AsIThinkFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);

        System.out.print(result(str, ch));
    }
    public static int result(String str, char ch) {
        int rst = 0;
        str = str.toUpperCase();
        ch = Character.toUpperCase(ch);
        for(char x : str.toCharArray()) {
            if(x == ch) rst++;
        }
        return rst;
    }
}
