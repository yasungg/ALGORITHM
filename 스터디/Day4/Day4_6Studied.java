package 스터디.Day4;

import java.util.Scanner;

public class Day4_6Studied {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(result(str));
    }
    public static String result(String str) {
        String rst = "";
        char[] charArr = str.toCharArray();
        int lt = 0;
        int rt = charArr.length - 1;
        while(lt < rt) {
                if (!Character.isAlphabetic(charArr[lt])) lt++;
                else if (!Character.isAlphabetic(charArr[rt])) rt--;
                else {
                    char tmp = charArr[lt];
                    charArr[lt] = charArr[rt];
                    charArr[rt] = tmp;
                    lt++;
                    rt--;
                }
            }
        rst = String.valueOf(charArr);
        return rst;
    }
}
