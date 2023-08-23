package 스터디.Day5;

import java.util.Scanner;

public class Day5_4AsIThinkFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(result(str));
        System.out.println("");
    }
    public static String result(String str) {
        String rst = "";
        char[] charArr = str.toCharArray();
        String firstOne = "";
        for(int i = 0; i < charArr.length; i++) {
            if(str.indexOf(charArr[i]) == i) firstOne += charArr[i];
        }
        char[] firstOneArr = firstOne.toCharArray();
        int[] countArr = new int[firstOne.length()];
        for(int i = 0; i < firstOneArr.length; i++) {
            int count = 0;
            for(int j = i; j < charArr.length; j++) {
                if(str.charAt(j) == firstOneArr[i]) count++;
                countArr[i] = count;
            }
        }
        for(int i = 0; i < firstOneArr.length; i++) {
            rst += firstOneArr[i];
            if(countArr[i] > 1) rst += countArr[i];
        }
        return rst;
    }

}
