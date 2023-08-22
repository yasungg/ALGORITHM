package 스터디.Day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day4_5AsIThinkFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(result(str));
    }

    public static String result(String str) {
        String rst = "";
        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i) rst += str.charAt(i);
        }
        return rst;
    }
}
