package 스터디.Day5;

import java.util.Scanner;

public class Day5_1AsIThinkFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.print(result(str));
    }
    public static String result(String str) {
        str = str.toUpperCase();
        char[] charArr = str.toCharArray();
        String tmp ="";
        for(int i = 0; i < charArr.length; i++) {
            if(Character.isAlphabetic(charArr[i])) {
                tmp += charArr[i];
            }
        }
        char[] newCharArr = tmp.toCharArray();
        int lt = 0;
        int rt = newCharArr.length - 1;
        while(lt < rt) {
            if(newCharArr[lt] == newCharArr[rt]) {
                lt++;
                rt--;
            }
            else return "NO";
        }
        return "YES";
    }
}
